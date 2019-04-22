import javax.sql.DataSource;
import java.util.List;
import java.sql.ResultSet;
/**
 * @Author: wensp
 * @Version: v1.0 2019-4-20
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource ds){
        super(ds);
    }

    public List<?> selectAll(){
        String sql = "select * from sys_org_element";
        return super.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs,int num)throws Exception{
                Member member = new Member();
                member.setFdUserName(rs.getString("fdUserName"));
                member.setFdPassword(rs.getString("fdPassword"));
                member.setFdAddr(rs.getString("fdAddr"));
                member.setAge(rs.getInt("age"));
                return member;
            }
        },null);
    }
}
