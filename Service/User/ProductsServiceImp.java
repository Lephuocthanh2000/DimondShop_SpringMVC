package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.Product.ProductsDao;
import DiamonShop.Dto.UserProduct.ProductsDto;

@Service
public class ProductsServiceImp implements iProductsService{
	@Autowired
	private ProductsDao productsdao;
	@Override
	public ProductsDto GetDataProductById(long Id_Products){
		ProductsDto productsdto = new ProductsDto();
		List<ProductsDto> list= productsdao.GetDataProductsById(Id_Products);
		productsdto=list.get(0);
		return productsdto;
	}
	public List<ProductsDto> GetAllDataProductByIdCategory(int id_category) {
		return productsdao.GetAllDataProductsById_Category(id_category);
	}
	
}
