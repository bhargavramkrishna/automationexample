package apptest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class tcTest {
	public static Logger log_info=LogManager.getLogger(tcTest.class.getName());
	@BeforeTest
	public void browserlanch()
	{
		System.out.println("browser lanch");
		log_info.info("browser lanched");
	}
	@BeforeMethod
	public void openapp()
	{
		System.out.println("open app");
		log_info.info("opened app");
	}
	@Test
	public void login()
	{
		System.out.println("login the user");
		log_info.info("user logged");
	}
	@AfterMethod
	public void productaddtocart()
	{
		System.out.println("productadded to cart");
		log_info.info("cart is ffilled");
	}
	@AfterTest
	public void purchage()
	{
		System.out.println("file close");
		log_info.info("file closed");
	}
}
