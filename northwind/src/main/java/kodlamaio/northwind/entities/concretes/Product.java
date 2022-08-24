package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	/*
	 * @Column(name="category_id") private int categoryId;
	 */
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantiy_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category cateogry;
	
	public Product() {
		super();
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}


	
	
	
}
