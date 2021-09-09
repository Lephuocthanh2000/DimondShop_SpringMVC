package DiamonShop.Dao.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Dao.BaseDao;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Mapper.MapCategorys;
@Repository
public class CategoryDao extends BaseDao{
	public List<Categorys> GetDataCategogy(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql,new MapCategorys());
		return list;
	}
}
