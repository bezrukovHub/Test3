package ua.com.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Basket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Date date;
	private int amountOfUnits;
	
	@ManyToOne
	private User user;
	
	@ManyToMany
	@JoinTable(name = "basket_commodity", joinColumns = @JoinColumn(name = "basket_id"), inverseJoinColumns = @JoinColumn(name = "commodity_id"))
	private List<Commodity> commodities;
	
	public Basket() {
		// TODO Auto-generated constructor stub
	}

	public Basket(Date date, int amountOfUnits) {
		super();
		this.date = date;
		this.amountOfUnits = amountOfUnits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAmountOfUnits() {
		return amountOfUnits;
	}

	public void setAmountOfUnits(int amountOfUnits) {
		this.amountOfUnits = amountOfUnits;
	}
	
	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}

	@Override
	public String toString() {
		return "Basket [id=" + id + ", date=" + date + ", amountOfUnits=" + amountOfUnits
				+ ", commodities=" + commodities + "]";
	}

	
	
}
