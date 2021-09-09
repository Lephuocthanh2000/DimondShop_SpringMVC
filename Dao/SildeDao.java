package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Mapper.MapSildes;
import DiamonShop.Entity.Sildes;

@Repository
public class SildeDao extends BaseDao{
	
	public List<Sildes> GetDateSilde(){
		// KHỞI TẠO LIST MANG ĐỐI TƯỢNG SILDE
		List<Sildes> list = new ArrayList<Sildes>();
		String sql = "SELECT * FROM silde";
		list = _jdbcTemplate.query(sql,new MapSildes());
		return list;
	}
	
}
