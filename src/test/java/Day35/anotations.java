package Day35;


import org.testng.annotations.*;

public class anotations {
	@BeforeMethod
	void login()
	{
		System.out.println("login application");
	}

	@Test(priority=1)
	void search()
	{
		System.out.println("search");
		
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advanced serch");
	}
	@AfterMethod
	void logout()
	{
	System.out.println("logout");
}
}