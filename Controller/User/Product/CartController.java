package DiamonShop.Controller.User.Product;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Controller.User.BaseController;
import DiamonShop.Dto.UserProduct.CartDto;
import DiamonShop.Service.User.CartServiceImp;

@Controller
public class CartController extends BaseController {
	@Autowired
	private CartServiceImp cartsService;

	@RequestMapping(value = "/AddCart", method = RequestMethod.GET)
	public ModelAndView  indexCart(HttpSession session) {
		_shareView.setViewName("user/products/cart");
		return 	_shareView;
	}
	@RequestMapping(value = "/AddCart/{id_product}", method = RequestMethod.GET)
	public String AddCart(HttpServletRequest request, HttpSession session, @PathVariable Long id_product) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		cart = cartsService.AddCart(id_product, cart);
		session.setAttribute("Cart", cart);
		double totalPrice = cartsService.TotalPrice(cart);
		session.setAttribute("TotalPrice", totalPrice);
		int totalQuantity = cartsService.TotalQuanty(cart);
		session.setAttribute("TotalQuantity", totalQuantity);
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value = "/EditCart/{id_product}", method = RequestMethod.GET)
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable Long id_product) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		cart = cartsService.EditCart(id_product,1, cart);
		session.setAttribute("Cart", cart);
		double totalPrice = cartsService.TotalPrice(cart);
		session.setAttribute("TotalPrice", totalPrice);
		int totalQuantity = cartsService.TotalQuanty(cart);
		session.setAttribute("TotalQuantity", totalQuantity);
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value = "/DeleteCart/{id_product}", method = RequestMethod.GET)
	public String RemoveCart(HttpServletRequest request, HttpSession session, @PathVariable Long id_product) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		cart = cartsService.DeleteCart(id_product,cart);
		session.setAttribute("Cart", cart);
		double totalPrice = cartsService.TotalPrice(cart);
		session.setAttribute("TotalPrice", totalPrice);
		int totalQuantity = cartsService.TotalQuanty(cart);
		session.setAttribute("TotalQuantity", totalQuantity);
		return "redirect:"+request.getHeader("Referer");
	}
}
