package DiamonShop.Controller.User;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController extends BaseController {
	
	@RequestMapping(value= {"/trang-chu","/"},method = RequestMethod.GET)
	public ModelAndView HomeIndex() {
		_shareView.setViewName("user/index");
		_shareView.addObject("sildes", _homeService.GetDateSilde());
		_shareView.addObject("newProductsSilde", _homeService.GetDatanNewProductsSilde());
		_shareView.addObject("newProducts", _homeService.GetDatanNewProducts());
		_shareView.addObject("highlightProducts", _homeService.GetDataHighLightProducts());
		return _shareView;
	}
	
	
}
