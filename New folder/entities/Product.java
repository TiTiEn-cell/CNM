package entities;

import java.util.List;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

public class Product {
	@BsonId
	private String productId;
	
	@BsonProperty("brand_name")
	private String brandName;
	
	@BsonProperty("category_name")
	private String categoryName;
	
	@BsonProperty("product_name")
	private String productName;
	
	private List<String> colors;
	
	@BsonProperty("model_year")
	private int modelYear;
	
	@BsonProperty("price")
	private double price;
	

	public Product(String productId, String brandName, String categoryName, String productName, List<String> colors,
			int modelYear, double price) {
		super();
		this.productId = productId;
		this.brandName = brandName;
		this.categoryName = categoryName;
		this.productName = productName;
		this.colors = colors;
		this.modelYear = modelYear;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brandName=" + brandName + ", categoryName=" + categoryName
				+ ", productName=" + productName + ", colors=" + colors + ", modelYear=" + modelYear + ", price="
				+ price + "]";
	}
	
}
