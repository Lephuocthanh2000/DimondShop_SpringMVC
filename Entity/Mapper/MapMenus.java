package DiamonShop.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DiamonShop.Entity.Menus;

public class MapMenus implements RowMapper<Menus> {
	@Override
	public Menus mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Mapping menus
		Menus menus= new  Menus();
		menus.setId(rs.getInt("id"));
		menus.setName(rs.getString("name"));
		menus.setUrl(rs.getString("url"));
		return  menus;
	}
}
