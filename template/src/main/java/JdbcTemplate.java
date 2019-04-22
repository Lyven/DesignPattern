import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wensp
 * @Version: v1.0 2019-4-20
 */
public abstract class JdbcTemplate {
    private DataSource ds;
    protected JdbcTemplate(DataSource ds){
        this.ds = ds;
    }

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values){
        try{
            //1、获取连接
            Connection conn = ds.getConnection();
            //2、获取preparement
            PreparedStatement ps = conn.prepareStatement(sql);
            //3、参数准备
            for(int i=0;i<values.length;i++){
                ps.setObject(i,values[i]);
            }
            //4、执行查询
            ResultSet rs = ps.executeQuery();
            //5、处理结果集
            List<Object> result = new ArrayList<Object>();
            int num = 1;
            while(rs.next()){
                result.add(rowMapper.mapRow(rs,num+1));
            }

            //6、关闭连接
            rs.close();
            ps.close();
            conn.close();
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
