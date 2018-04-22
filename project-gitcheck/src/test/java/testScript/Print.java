package testScript;

import org.testng.annotations.Test;

public class Print {
	@Test(priority=0)
	public void Cognizant() {
		System.out.println("I love Cognizant");
	}

	@Test(priority=1)
	public void TCS() {
		System.out.println("tcs ");
	}

	@Test(priority=2)
	public void Mphasis() {
		System.out.println("Mphasis is good company");
	}
	@Test(priority=-1)
	public void Accenture() {
		System.out.println("This is my dream company");
	}



}
