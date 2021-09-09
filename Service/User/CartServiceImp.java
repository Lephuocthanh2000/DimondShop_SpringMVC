package DiamonShop.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.Product.CartDao;
import DiamonShop.Dto.UserProduct.CartDto;

@Service
public class CartServiceImp implements iCartService {
	@Autowired
	private CartDao cartdao;
	@Override
	public HashMap<Long, CartDto> AddCart(long id_product, HashMap<Long, CartDto> cart) {
		return cartdao.AddCart(id_product, cart);
	}

	@Override
	public HashMap<Long, CartDto> DeleteCart(long id_product, HashMap<Long, CartDto> cart) {
		
		return cartdao.DeleteCart(id_product, cart);
	}

	@Override
	public HashMap<Long, CartDto> EditCart(long id_product, int quantity, HashMap<Long, CartDto> cart) {
		
		return cartdao.EditCart(id_product, quantity, cart);
	}

	@Override
	public int TotalQuanty(HashMap<Long, CartDto> cart) {
		return cartdao.TotalQuanty(cart);
	}

	@Override
	public double TotalPrice(HashMap<Long, CartDto> cart) {
		return cartdao.TotalPrice(cart);
	}

}
