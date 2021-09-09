package DiamonShop.Dto.UserProduct;

import java.util.Date;

public class ProductsDto {
	private int id_products;
	private int id_category;
	private String sizes;
	private String name_products;
	private double price;
	private int sale;
	private String title;
	private boolean highlight;
	private boolean new_product;
	private String details;
	private Date created_at;
	private Date updated_at;
	private int id_colors;
	private String name_colors;
	private String img;
	private String code;

	public ProductsDto() {
		super();
	}

	public ProductsDto(int id_products, int id_category, String sizes, String name_products, double price, int sale,
			String title, boolean highlight, boolean new_product, String details, Date created_at, Date updated_at,
			int id_colors, String name_colors, String img, String code) {
		super();
		this.id_products = id_products;
		this.id_category = id_category;
		this.sizes = sizes;
		this.name_products = name_products;
		this.price = price;
		this.sale = sale;
		this.title = title;
		this.highlight = highlight;
		this.new_product = new_product;
		this.details = details;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.id_colors = id_colors;
		this.name_colors = name_colors;
		this.img = img;
		this.code = code;
	}

	public int getId_products() {
		return id_products;
	}

	public void setId_products(int id_products) {
		this.id_products = id_products;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getName_products() {
		return name_products;
	}

	public void setName_products(String name_products) {
		this.name_products = name_products;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isHighlight() {
		return highlight;
	}

	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}

	public boolean isNew_product() {
		return new_product;
	}

	public void setNew_product(boolean new_product) {
		this.new_product = new_product;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getId_colors() {
		return id_colors;
	}

	public void setId_colors(int id_colors) {
		this.id_colors = id_colors;
	}

	public String getName_colors() {
		return name_colors;
	}

	public void setName_colors(String name_colors) {
		this.name_colors = name_colors;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
