package DiamonShop.Controller.User.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Controller.User.BaseController;
import DiamonShop.Dto.PaginateDto;
import DiamonShop.Service.User.CategoryServiceImp;
import DiamonShop.Service.User.PaginateServiceImp;
@Controller
public class CategoryController extends BaseController{
	
	@Autowired
	private CategoryServiceImp categoryService;
    
	@Autowired
	private PaginateServiceImp paginateService;
	
	private int totalProductsPage = 9;
	
	@RequestMapping(value = "/san-pham/{id_category}")
	public ModelAndView Product(@PathVariable String id_category) {
		_shareView.setViewName("user/products/category");
		int totalData = categoryService.GetAllDataProductsById_Category(Integer.parseInt(id_category)).size();
		PaginateDto  paginateInfo = paginateService.GetDataInfoPaginate(totalData, totalProductsPage, 1);
		_shareView.addObject("categorys", _homeService.GetDataCatelory());
		_shareView.addObject("idCategory", id_category);
		_shareView.addObject("totalData", totalData);
		_shareView.addObject("paginateInfo", paginateInfo);
		_shareView.addObject("productsPaginate", categoryService.GetDataProductsPaginate(Integer.parseInt(id_category), paginateInfo.getStartPage(), totalProductsPage));
		return _shareView;
	}
	@RequestMapping(value = "/san-pham/{id_category}/{current_page}")
	public ModelAndView Product(@PathVariable String id_category,@PathVariable String current_page) {
		_shareView.setViewName("user/products/category");
		int totalData = categoryService.GetAllDataProductsById_Category(Integer.parseInt(id_category)).size();
		PaginateDto  paginateInfo = paginateService.GetDataInfoPaginate(totalData, totalProductsPage,Integer.parseInt(current_page));
		_shareView.addObject("categorys", _homeService.GetDataCatelory());
		_shareView.addObject("idCategory", id_category);
		_shareView.addObject("totalData", totalData);
		_shareView.addObject("paginateInfo", paginateInfo);
		_shareView.addObject("productsPaginate", categoryService.GetDataProductsPaginate(Integer.parseInt(id_category), paginateInfo.getStartPage(), totalProductsPage));
		return _shareView;
	}
}