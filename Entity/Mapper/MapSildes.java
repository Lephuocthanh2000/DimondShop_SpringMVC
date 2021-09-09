package DiamonShop.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DiamonShop.Entity.Sildes;

public class MapSildes implements RowMapper<Sildes> {
	@Override
	public Sildes mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Mapping silde entity
		Sildes silde= new Sildes();
		silde.setId(rs.getInt("id"));
		silde.setImg(rs.getString("img"));
		silde.setCaption(rs.getString("caption"));
		silde.setContent(rs.getString("content"));
		
		return silde;
	}
}
