package inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="banking999")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="FromBankName",discriminatorType = DiscriminatorType.STRING)
public class Bank
{
	@Id
	private String bankid;
	private String bankname;
	public String getBankid() {
		return bankid;
	}
	public void setBankid(String bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	
}
