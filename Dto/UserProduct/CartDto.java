package DiamonShop.Dto.UserProduct;

public class CartDto {
	private int id;
	private double totalPrice=0;
	private int quantity=0;
	private ProductsDto product;
	public CartDto() {
		super();
	}

	public CartDto(int id, double totalPrice, int quantity, ProductsDto product) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.quantity = quantity;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductsDto getProduct() {
		return product;
	}

	public void setProduct(ProductsDto product) {
		this.product = product;
	}
	
	
}
