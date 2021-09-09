package DiamonShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ContactController extends BaseController {
	@RequestMapping(value = "/lien-he", method = RequestMethod.GET)
	public ModelAndView Contact() {
		sideBar=false;
		_shareView.addObject("SideBar", sideBar);
		_shareView.setViewName("user/contact");
		return _shareView;
	}
}
