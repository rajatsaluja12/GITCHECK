package testScript;

import org.testng.annotations.Test;

public class Print {
	@Test(priority=0)
	public void Cognizant() {
		System.out.println("Cognizant pays well");
	}

	@Test(priority=1)
	public void TCS() {
		System.out.println("tcs is good employee friendly organisation");
	}
	
	@Test(priority=2)
	public void Mphasis() {
		System.out.println("Mphasis pay me to run my house");
	}



}
