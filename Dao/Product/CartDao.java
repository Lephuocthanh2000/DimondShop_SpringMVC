package DiamonShop.Dao.Product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DiamonShop.Dao.BaseDao;
import DiamonShop.Dto.UserProduct.CartDto;
import DiamonShop.Dto.UserProduct.ProductsDto;

@Repository
public class CartDao extends BaseDao {
	@Autowired
	private ProductsDao productsDao;

	// thêm vào giỏ hàng
	public HashMap<Long, CartDto> AddCart(long id_product, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		ProductsDto product = productsDao.FindProductByID(id_product);
		if (cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		if (product != null && cart.containsKey(id_product)) {
			itemCart = cart.get(id_product);
			itemCart.setQuantity(itemCart.getQuantity() + 1);
			itemCart.setTotalPrice(itemCart.getQuantity() * itemCart.getProduct().getPrice());
		} else {
			itemCart.setProduct(product);
			itemCart.setQuantity(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		cart.put(id_product, itemCart);
		return cart;
	}

	// xóa giỏ hàng
	public HashMap<Long, CartDto> DeleteCart(long id_product, HashMap<Long, CartDto> cart) {
		if (cart == null) {
			return cart;
		} else {
			cart.remove(id_product);
		}
		return cart;
	}

	// sửa giỏ hàng
	public HashMap<Long, CartDto> EditCart(long id_product, int quantity, HashMap<Long, CartDto> cart) {

		if (cart == null) {
			return cart;
		}

		if (cart.containsKey(id_product)) {
			CartDto itemCart = new CartDto();
			itemCart = cart.get(id_product);
			itemCart.setQuantity(quantity);
			double totalPrice = quantity * itemCart.getProduct().getPrice();
			itemCart.setTotalPrice(totalPrice);
			cart.put(id_product, itemCart);
		}

		return cart;
	}

	// tổng số lượng
	public int TotalQuanty(HashMap<Long, CartDto> cart) {
		int totalQuanty = 0;
		if (cart != null) {
			for (Map.Entry<Long, CartDto> itemCart : cart.entrySet()) {
				totalQuanty += itemCart.getValue().getQuantity();
			}
		}
		return totalQuanty;
	}

	public double TotalPrice(HashMap<Long, CartDto> cart) {
		double totalPrice = 0;
		if (cart != null) {
			for (Map.Entry<Long, CartDto> itemCart : cart.entrySet()) {
				totalPrice += itemCart.getValue().getTotalPrice();
			}
		}
		return totalPrice;
	}
}
