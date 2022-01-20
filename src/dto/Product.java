package dto;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -427400572038677000L;

	private String productId; // ��ǰ ���̵�
	private String pname;
	private Integer unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private String condition;
	private String filename;
	private int quantity;

	public Product(String productId, String pname, Integer unitPrice) {
		super();
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	public Product()

	{

		this("id", "name", 1);

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId ������ productId
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname ������ pname
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return unitPrice
	 */
	public Integer getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice ������ unitPrice
	 */
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description ������ description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer ������ manufacturer
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category ������ category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return unitsInStock
	 */
	public long getUnitsInStock() {
		return unitsInStock;
	}

	/**
	 * @param unitsInStock ������ unitsInStock
	 */
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	/**
	 * @return condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition ������ condition
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * @return filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename ������ filename
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
