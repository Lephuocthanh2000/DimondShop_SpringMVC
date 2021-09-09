package DiamonShop.Dto.UserProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapProducts implements RowMapper<ProductsDto> {
	@Override
	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ProductsDto products = new ProductsDto();
		products.setId_products(rs.getInt("id_products"));
		products.setId_category(rs.getInt("id_category"));
		products.setSizes(rs.getString("sizes"));
		products.setName_products(rs.getString("name_products"));
		products.setPrice(rs.getDouble("price"));
		products.setSale(rs.getInt("sale"));
		products.setTitle(rs.getString("title"));
		products.setHighlight(rs.getBoolean("highlight"));
		products.setNew_product(rs.getBoolean("new_product"));
		products.setDetails(rs.getString("details"));
		products.setCreated_at(rs.getDate("created_at"));
		products.setUpdated_at(rs.getDate("updated_at"));
		products.setId_colors(rs.getInt("id_colors"));
		products.setName_colors(rs.getString("name_colors"));
		products.setImg(rs.getString("img"));
		products.setCode(rs.getString("code"));

		return products;
	}
}
