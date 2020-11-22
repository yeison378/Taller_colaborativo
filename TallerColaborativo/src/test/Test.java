package test;

import static org.junit.Assert.*;

import model.Management;

public class Test {
	private Management management;
	public Test() {
		management = new Management("sogamoso ciudad del sol y del acero");
	}
	@org.junit.Test
	public void testOwnName() {
		assertEquals("Sogamoso Ciudad Del Sol y Del Acero", management.ownName());
	}
	
	@org.junit.Test
	public void testEncrypt() {
		assertEquals("hi", management.encrypt("ab"));
	}
	
	@org.junit.Test
	public void testDecrypt() {
		assertEquals("ab", management.decrypt("hi"));
	}
	
	@org.junit.Test
	public void testIntersection() {
		assertEquals("colmia", management.intersection("colombia"));
	}
	
	@org.junit.Test
	public void testDifference() {
		assertEquals("sgs udd de s y de er", management.difference("colombia"));
	}

}
