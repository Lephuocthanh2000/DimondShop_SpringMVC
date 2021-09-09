package DiamonShop.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DiamonShop.Entity.Users;

public class MapUsers implements RowMapper<Users>{
@Override
public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
	Users user = new Users();
	user.setId(rs.getString("id"));
	user.setFirstName(rs.getString("firstname"));
	user.setLastName(rs.getString("lastname"));
	user.setEmail(rs.getString("email"));
	user.setPassWord(rs.getString("password"));
	user.setAddress(rs.getString("address"));
	user.setBirthday(rs.getString("birthday"));
	return user;

}
}
