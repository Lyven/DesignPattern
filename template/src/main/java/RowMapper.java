import java.sql.ResultSet;

/**
 * @Author: wensp
 * @Version: v1.0 2019-4-20
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum)throws Exception;
}
