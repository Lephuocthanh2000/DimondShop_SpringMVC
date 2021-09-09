package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.Product.ProductsDao;
import DiamonShop.Dto.UserProduct.ProductsDto;

@Service
public class CategoryServiceImp implements iCategoryService {
	@Autowired
	private ProductsDao productsdao;
	@Override
	public List<ProductsDto> GetAllDataProductsById_Category(int Id_Category) {
		return productsdao.GetAllDataProductsById_Category(Id_Category);
	}
	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage) {
		return productsdao.GetInfoPaginateProducts(id, totalPage, start);
	}

}
