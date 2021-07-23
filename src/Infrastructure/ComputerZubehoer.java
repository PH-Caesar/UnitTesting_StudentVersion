package Infrastructure;

import java.util.Date;
/*
 * @Author : Philipp Cserich
 * Date : 09.07.21
 * Description :
 * Abstract class that includes variables for all ComputerZubehör type classes
 */
public class ComputerZubehoer 
{
	

//------------------------------ GLOBAL VARIABLES ---------------------------------------

	//Zubehörname
	private String name;
	//Kaufdatum
	private Date buydate;
	//Erstelldatum
	private Date madedate;
	//Artikelnummer
	private String itemNumber;
	//Hersteller
	private Hersteller hersteller;
	//Produkttyp
	private String producttype;

//------------------------------ CONSTRUCTOR ---------------------------------------------
	
	/*
	 * Methodtype : Constructor
	 * Description :
	 * Initialising fields
	 */
	
	public ComputerZubehoer(String name, Date buydate, Date madedate, Hersteller hersteller,String producttype) {
		super();
		this.name = name;
		this.buydate = buydate;
		this.madedate = madedate;
		this.hersteller = hersteller;
		this.producttype=producttype;
		this.itemNumber = name.substring(0, 3)+hersteller.name()+Math.random();
	}
	

//------------------------------ GET / SET METHODS ---------------------------------------
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getBuydate() {
			return buydate;
		}
		public void setBuydate(Date buydate) {
			this.buydate = buydate;
		}
		public Date getMadedate() {
			return madedate;
		}
		public void setMadedate(Date madedate) {
			this.madedate = madedate;
		}
		public String getItemNumber() {
			return itemNumber;
		}
		public void setItemNumber() {
			this.itemNumber = name.substring(0, 3)+hersteller.name()+Math.random();
		}
		public Hersteller getHersteller() {
			return hersteller;
		}
		public void setHersteller(Hersteller hersteller) {
			this.hersteller = hersteller;
		}
		public String getProductType() {
			return producttype;
		}
		public void setProductType(String producttype) {
			this.producttype = producttype;
		}


//------------------------------ PREDEFINED METHODS ---------------------------------------------
		
		/*
		 * Methodtype : Predefined Method
		 * Description :
		 * ToString edited to return Object values
		 */
		
		@Override
		public String toString() {
			return "\n"+producttype+" "+ name 
					+ "\n\tBought :" + buydate + 
					"\n\tMade :" + madedate 
					+ "\n\tItemNumber :"+ itemNumber 
					+ "\n\tHersteller :" + hersteller +"\n";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((buydate == null) ? 0 : buydate.hashCode());
			result = prime * result + ((hersteller == null) ? 0 : hersteller.hashCode());
			result = prime * result + ((itemNumber == null) ? 0 : itemNumber.hashCode());
			result = prime * result + ((madedate == null) ? 0 : madedate.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		/*
		 * Methodtype : Predefined Method
		 * Description :
		 * Equals edited to compare values not the reference
		 */
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ComputerZubehoer other = (ComputerZubehoer) obj;
			if (buydate == null) {
				if (other.buydate != null)
					return false;
			} else if (!buydate.equals(other.buydate))
				return false;
			if (hersteller != other.hersteller)
				return false;
			if (madedate == null) {
				if (other.madedate != null)
					return false;
			} else if (!madedate.equals(other.madedate))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
	
		
}
