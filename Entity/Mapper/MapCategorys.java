package DiamonShop.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DiamonShop.Entity.Categorys;

public class  MapCategorys implements RowMapper<Categorys> {
	
	@Override
	public Categorys mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Mapping Categorys
		Categorys categorys = new Categorys();
		categorys.setId(rs.getInt("id"));
		categorys.setName(rs.getString("name"));
		categorys.setDescription(rs.getString("description"));
		return categorys;
	}
}
