package DiamonShop.Controller.User.Account;

import java.net.http.HttpClient.Redirect;

import javax.servlet.http.HttpServletRequest;

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
public class RegisterController  extends BaseController{
	@Autowired
	private AccountServiceImp accountservice; 
	
	@RequestMapping(value = "/dang-ki",method=RequestMethod.GET)
	public ModelAndView Register() {
		Users users = new Users();
		_shareView.addObject("User", users);
		_shareView.setViewName("user/account/register");
		return _shareView;
	}
	@RequestMapping(value = "/dang-ki", method = RequestMethod.POST)
	public ModelAndView Create(@ModelAttribute("User") Users users,HttpServletRequest request) {
		_shareView.setViewName("user/account/register");
		int count =accountservice.AddAccount(users);
		
		if(count>0) {
			_shareView.setViewName("redirect:dang-nhap");
		}
		else {
			_shareView.addObject("Status", "Đăng kí tài khoản không thành công");	
			_shareView.setViewName("redirect:dang-ki");
			
			
		}
		return _shareView;
	}
}
