import static org.junit.Assert.*;

import org.junit.Test;

public class IndexOfTest {
	
	@Test
	public void test1() {
		// char is in the string
		char c = 'a';
		String str = "ball";
		assertEquals("indexOf char not in string test: ", 1, StringUtilities.indexOf(str, c));

	}
	
	@Test
	public void test2() {
		// duplicate chars are in the string.
		char c = 'l';
		String str = "ball";
		assertEquals("indexOf char not in string test: ", 2, StringUtilities.indexOf(str, c));
	}

	@Test
	public void test3() {
		// char is not in the string
		assertEquals("indexOf char not in string test: ", -1, StringUtilities.indexOf("buck", 'a'));

	}
	
	@Test
	public void test4() {
		// string is empty.
		char c = 'l';
		String str = "";
		assertEquals("indexOf char not in string test: ", -1, StringUtilities.indexOf(str, c));
	}

}
	

