package DiamonShop.Dao.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dao.BaseDao;
import DiamonShop.Dto.UserProduct.MapProducts;
import DiamonShop.Dto.UserProduct.ProductsDto;

@Repository
public class ProductsDao extends BaseDao {
	private final int YES = 1;
	private final int NO = 0;

	/**
	 * Sql viết để lấy 2 bảng colors và Product
	 */
	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id as id_products, ");
		sql.append("p.id_category, ");
		sql.append("p.sizes, ");
		sql.append("p.name as name_products, ");
		sql.append("p.price, ");
		sql.append("p.sale, ");
		sql.append("p.title, ");
		sql.append("p.highlight, ");
		sql.append("p.new_product, ");
		sql.append("p.details, ");
		sql.append("p.created_at, ");
		sql.append("p.updated_at, ");
		sql.append("c.id as id_colors, ");
		sql.append("c.name as name_colors, ");
		sql.append("c.img, ");
		sql.append("c.code ");
		sql.append("FROM products as p ");
		sql.append("INNER JOIN colors as c ");
		sql.append("ON c.id_product= p.id ");
		return sql;
	}

	/**
	 * 
	 * @param New_Products
	 * @param Hightlight
	 * @return Lấy câu truy vấn cho sản phẩm new product và hightlight
	 */
	private String SqlProducts(int New_Products_Silde, int New_Products,int Hightlight) {
		StringBuffer sql = SqlString();

		if (New_Products_Silde == 1) {
			sql.append("WHERE p.new_product='1' ");
			sql.append("GROUP BY p.id ");
			sql.append("ORDER BY RAND() ");
			sql.append("LIMIT 12 ");
		}
		if (New_Products == 1) {
			sql.append("WHERE p.new_product='1' ");
			sql.append("GROUP BY p.id ");
			sql.append("ORDER BY RAND() ");
			sql.append("LIMIT 3 ");
		}
		if (Hightlight == 1) {
			sql.append("WHERE p.highlight='1' ");
			sql.append("GROUP BY p.id ");
			sql.append("ORDER BY RAND() ");
			sql.append("LIMIT 9 ");
		}

		return sql.toString();
	}

	/**
	 * 
	 * @param Id_Category
	 * @return Lấy câu truy vấn lấy toàn bộ sản phẩm bằng Id_Category của sản phẩm
	 *         đó
	 */
	private String SqlAllProductsById_Category(int Id_Category) {
		StringBuffer sql = SqlString();
		sql.append("WHERE p.id_category= " + Id_Category + " ");
		sql.append("GROUP BY p.id ");
		sql.append("ORDER BY RAND() ");
		return sql.toString();
	}

	/**
	 * 
	 * @param limit
	 * @param startPage
	 * @return câu truy vấn lấy InfoPaginate
	 */
	private String SqlInfoPaginateProducts(int toltalPage, int startPage) {
		StringBuffer sql = SqlString();
		sql.append("GROUP BY p.id ");
		sql.append(" Limit " + startPage + " , " + toltalPage + " ");
		return sql.toString();
	}

	/**
	 * 
	 * @param id_product
	 * @return câu truy vấn lấy sản phẩm có id_product cần lấy
	 */
	private String SqlDataProductsById(long id_product) {
		StringBuffer sql = SqlString();
		sql.append("WHERE p.id= " + id_product + " ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}

	/**
	 * 
	 * @param id_product
	 * @return sản phẩm cần tìm có id_product truyền vào
	 */
	public List<ProductsDto> GetDataProductsById(Long id_product) {
		String sql = SqlDataProductsById(id_product);
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		list = _jdbcTemplate.query(sql, new MapProducts());
		return list;
	}

	/**
	 * 
	 * @param limit
	 * @param startPage
	 * @return List<ProductsDto> lấy infoPaginate
	 */

	public List<ProductsDto> GetInfoPaginateProducts(int id_category, int totalPage, int startPage) {
		String sqlallproduct = SqlAllProductsById_Category(id_category);
		List<ProductsDto> listAllProducts = _jdbcTemplate.query(sqlallproduct.toString(), new MapProducts());
		List<ProductsDto> listPaginateProducts = new ArrayList<ProductsDto>();
		if (listAllProducts.size() > 0) {
			String sql = SqlInfoPaginateProducts(totalPage, startPage);
			listPaginateProducts = _jdbcTemplate.query(sql, new MapProducts());
		}

		return listPaginateProducts;
	}

	/**
	 * 
	 * @param Id_Category
	 * @return Toàn bộ dữ liệu sản phẩm có Id_Category truyền vào
	 */
	public List<ProductsDto> GetAllDataProductsById_Category(int Id_Category) {
		String sql = SqlAllProductsById_Category(Id_Category);
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		list = _jdbcTemplate.query(sql, new MapProducts());
		return list;
	}

	/**
	 * 
	 * @return Toàn bộ dữ liệu sản phẩm mới ở silde
	 */
	public List<ProductsDto> GetDataNewProductsSilde() {
		String sql = SqlProducts(YES, NO,NO);
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		list = _jdbcTemplate.query(sql, new MapProducts());
		return list;
	}
	/**
	 * 
	 * @return Toàn bộ dữ liệu sản phẩm mới 
	 */
	public List<ProductsDto> GetDataNewProducts() {
		String sql = SqlProducts(NO,YES, NO);
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		list = _jdbcTemplate.query(sql, new MapProducts());
		return list;
	}

	/**
	 * 
	 * @return Toàn bộ dữ liệu sản phẩm HightLight
	 */
	public List<ProductsDto> GetDataHighLightProducts() {
		String sql = SqlProducts(NO,NO, YES);
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		list = _jdbcTemplate.query(sql, new MapProducts());
		return list;
	}

	public ProductsDto FindProductByID(long id_product) {
		String sql = SqlDataProductsById(id_product);
		ProductsDto product = new ProductsDto();
		product = _jdbcTemplate.queryForObject(sql, new MapProducts());
		return product;
	}
}
