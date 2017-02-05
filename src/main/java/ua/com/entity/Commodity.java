package ua.com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commodity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private float price;
	private float sale;
	private int count;
	private float weight;
	private String information;
	private String pathImage;

	@ManyToOne
	private SubCategory subCategory;

	public Commodity() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany
	@JoinTable(name = "basket_commodity", joinColumns = @JoinColumn(name = "commodity_id"), inverseJoinColumns = @JoinColumn(name = "basket_id"))
	private List<Basket> baskets;

	public Commodity(String name, String description, float price, float sale, int count, float weight,
			String information) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.sale = sale;
		this.count = count;
		this.weight = weight;
		this.information = information;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSale() {
		return sale;
	}

	public void setSale(float sale) {
		this.sale = sale;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public List<Basket> getBaskets() {
		return baskets;
	}

	public void setBaskets(List<Basket> baskets) {
		this.baskets = baskets;
	}

	public String getPathImage() { return pathImage; }

	public void setPathImage(String pathImage) { this.pathImage = pathImage; }

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", sale=" + sale + ", count=" + count + ", weight=" + weight + ", information=" + information
				+ ", subCategory=" + subCategory + ", baskets=" + baskets + "]";
	}

}
