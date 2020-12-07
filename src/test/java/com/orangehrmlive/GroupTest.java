package com.orangehrmlive;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
	@BeforeGroups(groups="admin")
	public void beforeAdminGroups() {
		System.out.println("Executing Admin Module");
	
}
	@BeforeGroups(groups="leave")
  public void beforeLeaveGroups() {
		System.out.println("Executing Leave Module");
  }
	@Test(groups = "admin")
  public void adminmodue1() {
	  System.out.println("Admin Test1");
  }
	@Test(groups = "admin")
  public void adminmodue2() {
		 System.out.println("Admin Test2");
  }
	
	@Test(groups = "leave")
  public void leavemodule1() {
	  System.out.println("Leave Test1");
  }
	@Test(groups = "leave")
  public void leavemodule2() {
	  System.out.println("Leave Test2");
  }
}
