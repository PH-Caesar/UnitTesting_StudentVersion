package UnitTesting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;

import Infrastructure.ComputerZubehör;
import Infrastructure.CyberStore;
import Infrastructure.Hersteller;
import Infrastructure.Keyboard;


/*
 * @Author : Philipp Cserich
 * Date : 09.07.21
 * Description :
 * UnitTesting Class
 * (Modify the Tests as said in their Description)
 * All imports have been done for you
 */

public class JUnitest 
{

//------------------------------ GLOBAL VARIABLES ---------------------------------------
	
	/*
	 * Create one private member from class Cyberstore
	 */
	
	private CyberStore cyberstore;
	String[] array1=new String[] {"Hi","You","Are","Amazing"};
	String[] array2=new String[] {"Hello","I","Am","Different"};
	

//------------------------------ CONSTRUCTOR ---------------------------------------
	
	/*
	 * Methodtype : Constructor
	 * Description :
	 * Constructor for Junitest
	 * (Initialize the cyberstore)
	 */
	
	public JUnitest() {
		// TODO Auto-generated constructor stub
	}
	

//------------------------------ TEST-SETUP (@BEFORE) --------------------------------------
	
	/*
	 * Methodtype : Test @Before
	 * Description :
	 * Setup config for Testing
	 */
	
	 @Before
	 public void setup(){
	 }
	 
	 @BeforeEach
	 public void beforeEach() {
	 }
	 


//------------------------------ TEST-CASES (@TEST) --------------------------------------
	
	/*
	* Methodtype : Testcase @Test
	* Task-Number : 1
	* Description :
	* Test if the Firstname "Max" is equal to the lastname "Mustermann"
	* Question :
	* Is the Testcase succesfull?
	* Awnser :
	* 
	* 
	*/
	 
	@Test
	public void testFirstnameAndLastname() {
		//Fill Function
	}
	
	/*
	* Methodtype : Testcase @Test
	* Task-Number : 2
	* Description :
	* Compare Array 1 to Array 2
	*/
	
	@Test
	public void testArrays() {
		//Fill Function
	}
	 
	/*
	 * Methodtype : Testcase @Test
	 * Task-Number : 3
	 * Description :
	 * Testing if the first element in the Cyberstore stock is equal to its third element
	 */
	
	@Test
	public void testCaseCompare0To2() {
		//Fill Function
	}

	/*
	 * Methodtype : Testcase @Test
	 * Task-Number : 4
	 * Description :
	 * Testing if the first element in the Cyberstore stock is NOT equal to its second element
	 */
	
	@Test
	public void testCaseCompare1To2() {
		//Fill Function
	}
	
	/*
	 * Methodtype : Testcase @Test
	 * Task-Number : 5
	 * Description :
	 * Testing whether or not a ComputerZubehör can be added correctly
	 * (Add one new Keyboard)
	 * 
	 * TIPP : 
	 * Use either assertThrows or assertDoesNotThrow 
	 * And don't forget the Executable()
	 */
	
	@Test
	public void testCaseAddComputerZubehörToStock() {
		//Fill Function
	}
	
	/*
	 * Methodtype : Testcase @Test
	 * Task-Number : 6
	 * Description :
	 * Testing if you can add an already existing ComputerZubehör 
	 * (and if it throws the right Exception)
	 * 
	 * TIPP :
	 * Use either assertThrows or assertDoesNotThrow 
	 * And don't forget the Executable()
	 */
	
	@Test
	public void testCaseAddExisingComputerZubehörToStock() {
		//Fill Function
	}
	
	/*
	 * Methodtype : Testcase @Test
	 * Task-Number : 7
	 * Description :
	 * Testing if you can add null into the List
	 * (We don't want an unexpected exception => Check for IllegalArgumentException)
	 * Question :
	 * What is preventing the Test to be correct and why ?
	 * Awnser :
	 * 
	 * 
	 */
	
	@Test
	public void testCaseAddNulltoStock() {
		//Fill Function
	}
	
	/*
	 * Methodtype : Testcase @Test
	 * Task-Number : 8
	 * Description :
	 * Clear Shop & Stock
	 * Create one Computerzubehör and add it to Shop and Stock
	 * Compare them to each other 
	 * Question :
	 * Why are they not Equal ?
	 * Awnser :
	 * 
	 * 
	 */
	
	@Test
	public void testCaseCompareStockToShop() throws Throwable {
		//Fill Function
	}
	
	
	

//------------------------------ TEST-END (@AFTER) --------------------------------------
	
	@After
	public void end() {
		
	}
	
	@AfterEach
	public void afterEach() {
		
	}
	
	@AfterAll
	public void afterAll() {
	}
	
	
	/*
	 * After every Task is completed, ignore the Tests that don't work 
	 */
}
