package DiamonShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.UserProduct.CartDto;

@Service
public interface iCartService {
	public HashMap<Long, CartDto> AddCart(long id_product, HashMap<Long, CartDto> cart);
	public HashMap<Long, CartDto> DeleteCart(long id_product, HashMap<Long, CartDto> cart);
	public HashMap<Long, CartDto> EditCart(long id_product, int quantity, HashMap<Long, CartDto> cart);
	public int TotalQuanty(HashMap<Long, CartDto> cart);
	public double TotalPrice(HashMap<Long, CartDto> cart);
}
