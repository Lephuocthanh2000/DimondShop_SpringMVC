package DiamonShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.UserProduct.ProductsDto;

@Service
public interface iCategoryService {
	public List<ProductsDto> GetAllDataProductsById_Category(int Id_Category);
	 public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage);
}
