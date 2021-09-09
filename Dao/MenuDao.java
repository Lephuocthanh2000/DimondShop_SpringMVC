package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Mapper.MapMenus;
import DiamonShop.Entity.Menus;


@Repository
public class MenuDao extends BaseDao{
	
	public List<Menus> GetDataMenu() {
		List<Menus> list= new ArrayList<Menus>();
		String sql="SELECT * FROM `menu` ";
		list=_jdbcTemplate.query(sql, new MapMenus());
		return list;
	}

}
