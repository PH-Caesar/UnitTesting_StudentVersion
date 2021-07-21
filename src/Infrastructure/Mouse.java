package Infrastructure;

import java.util.Date;

/*
 * @Author : Philipp Cserich
 * Date : 09.07.21
 * Description :
 * Extended ComputerZubeh�r Class Mouse
 */

public class Mouse extends ComputerZubeh�r
{


//------------------------------ GLOBAL VARIABLES ---------------------------------------
	
	//Mousetype
	private String mousetype;
	

//------------------------------ CONSTRUCTORS -------------------------------------------
	
	/*
	 * Methodtype : Constructor
	 * Description :
	 * Default Constructor which contains ONLY extended parameters
	 */
	
	public Mouse(String name,
				 Date buydate,Date madedate,
				 Hersteller hersteller) 
	{
		super(name, buydate, madedate, hersteller,"Mouse");
		
	}
	
	/*
	 * Methodtype : Constructor
	 * Description :
	 * Constructor with Mouse specific parameters
	 */
	
	public Mouse(String name,
				 Date buydate,Date madedate,
				 Hersteller hersteller,String mousetype) 
	{
		//initialising super class with constructor
		super(name, buydate, madedate, hersteller,"Mouse");
		//initialising mouse specific Variables
		this.mousetype=mousetype;
	}
	

//------------------------------ GET / SET METHODS ---------------------------------------
	
	public String getMaustyp() {
		return mousetype;
	}

	
	
}
