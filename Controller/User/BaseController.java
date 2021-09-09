package DiamonShop.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.HomeServiceImp;

@Controller
public class BaseController {
	@Autowired
	protected HomeServiceImp _homeService;
	protected ModelAndView _shareView = new ModelAndView();
	protected boolean sideBar =true;
	@PostConstruct
	public ModelAndView Base() {
		_shareView.addObject("menus", _homeService.GetDataMenu());
		_shareView.addObject("SideBar",sideBar );
		_shareView.addObject("categorys", _homeService.GetDataCatelory());
		return _shareView;
	}
}
