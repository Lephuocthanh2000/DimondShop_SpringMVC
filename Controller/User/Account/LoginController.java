package DiamonShop.Controller.User.Account;

import java.net.http.HttpClient.Redirect;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.dbcp.dbcp2.datasources.PerUserPoolDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Controller.User.BaseController;
import DiamonShop.Entity.Users;
import DiamonShop.Service.User.AccountServiceImp;
@Controller
public class LoginController extends BaseController {
	@Autowired
	private AccountServiceImp accountService;
	@RequestMapping(value = "/dang-nhap" , method = RequestMethod.GET)
	public ModelAndView login() {
		Users users = new Users();
		_shareView.addObject("User", users);
		_shareView.setViewName("user/account/login");
		return _shareView;
	}
	@RequestMapping(value = "/dang-nhap" , method = RequestMethod.POST)
	public ModelAndView Login(@ModelAttribute ("User") Users users, HttpSession sesion) {
		users =accountService.CheckAccount(users);
		if (users!=null) {
			_shareView.setViewName("Redirect:trang-chu");
			sesion.setAttribute("LoginInfo", users);
		}else {
			_shareView.addObject("StatusLogin", "Đăng nhập thất bại  Email hoặc Password không đúng!");
		}
		
		return _shareView;
	}
}
