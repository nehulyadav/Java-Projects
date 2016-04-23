import static org.junit.Assert.*;

import org.junit.Test;

public class StartsWithTest {

	@Test
	public void test1() {
		//second string is a prefix of the first
		assertEquals("startsWith second string is a prefix of the first string: ", true, StringUtilities.startsWith("apple tree", "apple"));
	}
	
	@Test
	public void test2() {
		//second string is not a prefix of the first
		assertEquals("startsWith second string is not a prefix of the first string: ", false, StringUtilities.startsWith("pineapple tree", "apple"));
	}
	
	@Test
	public void test3() {
		//first string is empty.
		String org = "";
		String prefix = "big blue";
		assertEquals("startsWith second string is not a prefix of the first string: ", false, StringUtilities.startsWith(org, prefix));
	}
	
	@Test
	public void test4() {
		//second string is empty.
		String org = "blue";
		String prefix = "";
		assertEquals("startsWith second string is not a prefix of the first string: ", true, StringUtilities.startsWith(org, prefix));
	}
	
	@Test
	public void test5() {
		//second string has a greater length than the length of the first string.
		String org = "blue";
		String prefix = "big blue";
		assertEquals("startsWith second string is not a prefix of the first string: ", false, StringUtilities.startsWith(org, prefix));
	}
	
	
	
}
