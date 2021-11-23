package co.lti.hiber.otm;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="CartTem111")
public class CartItem
{
	@Id
	private String itemId;
	private String productName;
	private int price;
	@Column(name="quantity")
	private int qty;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cartid")
	private  Cart cart;
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItem(String itemId, String productName, int price, int qty) {
		super();
		this.itemId = itemId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
