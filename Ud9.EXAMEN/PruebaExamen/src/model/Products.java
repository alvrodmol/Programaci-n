package model;

public class Products {
	
	private String productCode;
	private String productName;
	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private Integer quantityInStock;
	private Integer buyPrice;
	private Integer MSRP;
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getProductScale() {
		return productScale;
	}
	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Integer getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public Integer getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Integer buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Integer getMSRP() {
		return MSRP;
	}
	public void setMSRP(Integer mSRP) {
		MSRP = mSRP;
	}
	@Override
	public String toString() {
		return "Products [getProductCode()=" + getProductCode() + ", getProductName()=" + getProductName()
				+ ", getProductLine()=" + getProductLine() + ", getProductScale()=" + getProductScale()
				+ ", getProductVendor()=" + getProductVendor() + ", getProductDescription()=" + getProductDescription()
				+ ", getQuantityInStock()=" + getQuantityInStock() + ", getBuyPrice()=" + getBuyPrice() + ", getMSRP()="
				+ getMSRP() + "]";
	}
	

}
