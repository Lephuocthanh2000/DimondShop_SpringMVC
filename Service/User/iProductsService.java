package DiamonShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;
import DiamonShop.Dto.*;
import DiamonShop.Dto.UserProduct.ProductsDto;
@Service
public interface iProductsService  {
	public ProductsDto GetDataProductById(long Id_Products);
}
