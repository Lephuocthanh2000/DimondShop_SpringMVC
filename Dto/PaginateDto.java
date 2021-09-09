package DiamonShop.Dto;

public class PaginateDto {
	private int currentPage;
	private int startPage;
	private int endPage;
	private int totalProductsPage;
	private int totalPage;
	public PaginateDto() {
		super();
	}
	public PaginateDto(int currentPage, int startPage, int endPage, int totalProductsPage, int totalPage) {
		super();
		this.currentPage = currentPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalProductsPage = totalProductsPage;
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalProductsPage() {
		return totalProductsPage;
	}
	public void setTotalProductsPage(int totalProductsPage) {
		this.totalProductsPage = totalProductsPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
}
