package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="yesbank999")
//@DiscriminatorValue("From YesBAnk")
public class YesBank extends Bank
{
	private double plStartAmount;

	public double getPlStartAmount() {
		return plStartAmount;
	}

	public void setPlStartAmount(double plStartAmount) {
		this.plStartAmount = plStartAmount;
	}
	
}
