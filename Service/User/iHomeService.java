package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.UserProduct.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Sildes;

@Service
public interface iHomeService {
	@Autowired
	public List<Menus> GetDataMenu();
	public List<Sildes> GetDateSilde();
	public List<Categorys> GetDataCatelory();
	public List<ProductsDto> GetDatanNewProducts();
	public List<ProductsDto> GetDatanNewProductsSilde();
	public List<ProductsDto> GetDataHighLightProducts();
}
