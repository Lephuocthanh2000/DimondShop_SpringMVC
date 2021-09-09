package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.MenuDao;
import DiamonShop.Dao.SildeDao;
import DiamonShop.Dao.Product.CategoryDao;
import DiamonShop.Dao.Product.ProductsDao;
import DiamonShop.Dto.UserProduct.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Sildes;

@Service
public class HomeServiceImp implements iHomeService {
	@Autowired
	private SildeDao sildedao;
	@Autowired
	private CategoryDao categogydao;
	@Autowired
	private MenuDao menudao;
	@Autowired
	private ProductsDao productsdao;
	@Override
	public List<Sildes> GetDateSilde() {
		return sildedao.GetDateSilde();
	}

	public List<Categorys> GetDataCatelory() {
		return categogydao.GetDataCategogy();
	}
	public List<Menus> GetDataMenu() {
		// TODO Auto-generated method stub
		return menudao. GetDataMenu();
	}
	public List<ProductsDto> GetDatanNewProducts(){
		return productsdao.GetDataNewProducts();
	};
	public List<ProductsDto> GetDataHighLightProducts(){
		return productsdao.GetDataHighLightProducts();
	}

	@Override
	public List<ProductsDto> GetDatanNewProductsSilde() {
		return productsdao.GetDataNewProductsSilde();
	};


	
}
