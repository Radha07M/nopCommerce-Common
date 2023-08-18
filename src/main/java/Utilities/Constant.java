package Utilities;
/*
 * Here we have achieved Abstraction and interface concept of OOPs
 * Abstraction in Java is achieved using either an abstract class or an Interface.
 * An Interface in java represents the blueprint of a class and it contains abstract mehtod and final static variables
 */
public interface Constant {
	String APPURL = "https://admin-demo.nopcommerce.com/login";
	String DRIVERPATH = "\\src\\test\\resources\\drivers\\chromedriver.exe";
	String APPDATA_PATH = ".\\src\\main\\resources\\Properties\\AppData.properties";
	String TESTDATA_PATH = ".\\src\\main\\resources\\Properties\\TestData.properties";
	String ERRORMESSAGE_PATH=".\\src\\main\\resources\\Properties\\ErrorMessage.properties";
	String SUCCESSMESSAGE_PATH=".\\src\\main\\resources\\Properties\\SuccessMessage.properties";
}
