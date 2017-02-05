package ua.com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class SubCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name ;
	
	@OneToMany(mappedBy="subCategory",cascade = CascadeType.REMOVE)
	private List<Commodity> commodities;
	
	@ManyToOne
	private Category category;
	
	public SubCategory() {
		// TODO Auto-generated constructor stub
	}

	public SubCategory(String name) {
		super();
		this.name = name;
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
	

	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", name=" + name + "]";
	}
	
}
