package co.lti.hiber.otm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ShoppingCart111")
public class Cart
{
	@Id
	@Column(name="cartid")
	private String cartId;
	
	@Column(name="customerid")
	private String custid;
	
	@Column(name="cartamount")
	private int cartamount;
	
	
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name="cartid")
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	private Set<CartItem> cartItems;
	
	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(String cartId, String custid, int cartamount) {
		super();
		this.cartId = cartId;
		this.custid = custid;
		this.cartamount = cartamount;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public int getCartamount() {
		return cartamount;
	}

	public void setCartamount(int cartamount) {
		this.cartamount = cartamount;
	}
	
}
