package Infrastructure;

import java.util.Date;

/*
 * @Author : Philipp Cserich
 * Date : 09.07.21
 * Description :
 * Keyboard Class => extended ComputerZubehör
 */

public class Keyboard extends ComputerZubehör
{
	
//------------------------------ GLOBAL VARIABLES ---------------------------------------
	
	private String languageSetting;
	private boolean rgb;
	private boolean mousepad;
	
//------------------------------ CONSTRUCTOR ---------------------------------------
	
	public Keyboard(String name, Date buydate, Date madedate, Hersteller hersteller) {
		super(name, buydate, madedate, hersteller, "Keyboard");
		// TODO Auto-generated constructor stub
	}
	
	public Keyboard(String name, Date buydate, Date madedate, Hersteller hersteller,String languageSetting,boolean rgb,boolean mousepad) {
		super(name, buydate, madedate, hersteller, "Keyboard");
		// TODO Auto-generated constructor stub
		this.languageSetting=languageSetting;
		this.mousepad=mousepad;
		this.rgb=rgb;
	}

//------------------------------ GET / SET METHODS ---------------------------------------
	
	public String getLanguageSetting() {
		return languageSetting;
	}

	public void setLanguageSetting(String languageSetting) {
		this.languageSetting = languageSetting;
	}

	public boolean isRgb() {
		return rgb;
	}

	public void setRgb(boolean rgb) {
		this.rgb = rgb;
	}

	public boolean isMousepad() {
		return mousepad;
	}

	public void setMousepad(boolean mousepad) {
		this.mousepad = mousepad;
	}	
	
}
