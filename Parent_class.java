package Inheritance;

import org.testng.annotations.BeforeMethod;

public class Parent_class {
	@BeforeMethod
	public void beforerun()
	{
		System.out.println("run me first");
	}
	public void parent() {
		
	System.out.println("Iam parent of child class");
	}

}
