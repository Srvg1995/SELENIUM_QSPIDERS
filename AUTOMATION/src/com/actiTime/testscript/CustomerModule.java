
package com.actiTime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.TaskListPage;

public class CustomerModule extends BaseClass {
	@Test 
	public void testCreateCustomer()
	{
	Reporter.log("CreateCustomer", true);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	
	
	
	
	
	}
	

}
