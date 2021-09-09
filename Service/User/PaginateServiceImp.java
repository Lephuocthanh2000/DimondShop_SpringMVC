package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.PaginateDto;

@Service
public class PaginateServiceImp implements iPaginateService {

	@Override
	public PaginateDto GetDataInfoPaginate(int totalData, int totalProductsPage, int currentPage) {
		/**
		 * int currentPage; int startPage; int endPage; int totalProductsPage; int totalPage;
		 */
		 PaginateDto paginate= new PaginateDto();
		paginate.setTotalProductsPage(totalProductsPage);
		paginate.setTotalPage(setInfoTotalPage(totalData, totalProductsPage));
		paginate.setCurrentPage(checkCurrentPage(currentPage, paginate.getTotalPage()));
		int start = findStart(currentPage, totalProductsPage);
		int end = fintEnd(totalData, currentPage, totalProductsPage);
		paginate.setStartPage(start);
		paginate.setEndPage(end);
		return paginate;
	}

	/**
	 * 
	 * @param currentPage
	 * @param totalProductsPage
	 * @return end product in Currenpage
	 */
	private int fintEnd(int totalData, int currentPage, int totalProductsPage) {
		/**
		 * totalData=50 sản phẩm totalProductsPage = 9 sản phẩm / trang totalPage 6 trang
		 * currentPage trang thứ 3 => end: sản phẩm kết thúc trang thứ 3 = sản phẩm thứ
		 * 27 ==> end = currentPage*totalProductsPage; Th2 currentPage trang thứ 6 => end = 6*9= 54
		 * sai => end: sản phẩm kết thúc trang thứ 6 = sản phẩm thứ 50 => end = totalData;
		 */
		return totalProductsPage*currentPage<totalData?currentPage*totalProductsPage:totalData;
	}


	/**
	 * 
	 * @param currentPage
	 * @param totalProductsPage
	 * @return Start product in Currenpage
	 */
	private int findStart(int currentPage, int totalProductsPage) {
		/**
		 * totalData=50 sản phẩm totalProductsPage = 9 sản phẩm / trang totalPage 6 trang
		 * currentPage trang thứ 3 => start: sản phẩm bắt đầu trang thứ 3 = sản phẩm thứ
		 * 19 ==> start = (currentPage-1)*totalProductsPage+1
		 */
		return (currentPage - 1) * totalProductsPage ;
	}

	/**
	 * 
	 * @param totalData
	 * @param totalProductsPage
	 * @return totalPage
	 */
	private int setInfoTotalPage(int totalData, int totalProductsPage) {
		/**
		 * Th1: totalData=45 sản phẩm totalProductsPage = 9 sản phẩm / trang => totalPage 5 trang =>
		 * totalData/totalProductsPage = totalPage Th2: totalData=50 sản phẩm totalProductsPage = 9 sản phẩm /
		 * trang => totalPage 6 trang => totalData/totalProductsPage +1 = totalPage
		 */
		int totalPage = totalData / totalProductsPage;
		return totalPage * totalProductsPage < totalData ? totalPage + 1 : totalPage;
	}

	private int checkCurrentPage(int currentPage, int totalPage) {
		// TODO Auto-generated method stub
		if(currentPage<1||currentPage>totalPage) {
			return 1;
		}
		return currentPage ;
	}
}
