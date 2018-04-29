package samplePackage;

import junit.framework.Assert;

public class sampleClass {

	public static void main(String[] args) {
		String name = "Suresh Dubey";
		Assert.assertEquals(name, "Suresh Dubey");
		System.out.println("Name is " + name);
	}

}
