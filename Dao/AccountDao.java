package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dto.UserProduct.MapProducts;
import DiamonShop.Dto.UserProduct.ProductsDto;
import DiamonShop.Entity.Users;
import DiamonShop.Entity.Mapper.MapUsers;

@Repository
public class AccountDao extends BaseDao {
	private StringBuffer sqlInsertUser(Users user) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO ");
		sql.append(" `users` ");
		sql.append("(`firstname`, `lastname`, `email`, `password`, `address`, `birthday`) ");
		sql.append("VALUES ");
		sql.append("(    '" + user.getFirstName() + "', ");
		sql.append("        '" + user.getLastName() + "', ");
		sql.append("        '" + user.getEmail() + "', ");
		sql.append("        '" + user.getPassWord() + "', ");
		sql.append("        '" + user.getAddress() + "', ");
		sql.append("        '" + user.getBirthday() + "')");
		return sql;
	}

	public Users GetDataAccountUserByEmail(Users user) {
		String sql = "SELECT * FROM `users` WHERE users.email = '" + user.getEmail() +  " ' ";
		Users result = new Users();
		result = _jdbcTemplate.queryForObject(sql, new MapUsers());
		return result;
	}

	public int addAccount(Users user) {

		String sql = sqlInsertUser(user).toString();
		int count = _jdbcTemplate.update(sql);
		return count;
	}

}
