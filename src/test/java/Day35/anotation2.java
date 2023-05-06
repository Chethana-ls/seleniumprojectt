package Day35;

import org.testng.annotations.*;



public class anotation2 {
@BeforeClass
	void login()
	{
		System.out.println("login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advaced search");
		
	}
	@AfterClass
	void logout()
	{
		System.out.println("logout");
	}
	
}
