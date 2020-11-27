package test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
	public void testfindWord() {
		String word = "sol";
		assertEquals(1, management.findWord(word), 0);
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
	public void testfillCharacters() {
		char character = 'A';
		int limit = 4;
		String address = "Izquierda";
		assertEquals("AAAAsogamoso ciudad del sol y del acero", management.fillCharacters(character, limit, address));
	}
	
	@org.junit.Test
	public void testdeleteCharacter() {
		char character = 'o';
		assertEquals("sgams ciudad del sl y del acer", management.deleteCharacter(character));
	}
	
	@org.junit.Test
	public void testIntersection() {
		assertEquals("colmia", management.intersection("colombia"));
	}
	
	@org.junit.Test
	public void testDifference() {
		assertEquals("sgs udd de s y de er", management.difference("colombia"));
	}
	
	@org.junit.Test
	public void testdeleteComparing() {
		String word = "curador";
		String address = "Derecha";
		assertEquals("sogamoso ciudad del sol y del ace", management.deleteComparing(word, address));
	}
	
	@org.junit.Test
	public void testdate() {
		String date = "09/07/2000";
		int day = 9;
		int month = 7-1;
		int year = 2000;
		Calendar dateCalendar = new GregorianCalendar(year, month, day);
		assertEquals( dateCalendar.getTime(), management.date(date));
	}
}
