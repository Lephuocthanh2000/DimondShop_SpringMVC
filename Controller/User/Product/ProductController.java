package DiamonShop.Controller.User.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Controller.User.BaseController;
import DiamonShop.Service.User.ProductsServiceImp;

@Controller
public class ProductController extends BaseController {
	@Autowired
	private ProductsServiceImp productsService;
	@RequestMapping(value= {"/chi-tiet-san-pham/{id_products}"},method = RequestMethod.GET)
	public ModelAndView Product(@PathVariable String id_products ) {
		_shareView.setViewName("user/products/product");	
		_shareView.addObject("product",productsService.GetDataProductById(Integer.parseInt(id_products)));
		int id_category =productsService.GetDataProductById(Integer.parseInt(id_products)).getId_category();
		_shareView.addObject("list_products",productsService.GetAllDataProductByIdCategory(id_category));
		return _shareView;
	}

}
