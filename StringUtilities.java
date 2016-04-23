
public class StringUtilities {
	public static int indexOf(String str, char c) {
		int result = -1;
		boolean found = false;
		for (int loc = 0; loc < str.length() && !found; loc++)
			if (str.charAt(loc) == c) {
				result = loc;
				found = true;
			}
		return result;
	}

	public static boolean startsWith(String org, String prefix) {
		boolean result = true;
		int index = 0;
		if (org.length() < prefix.length())
			result = false;
		while (index < prefix.length() && result) {
			if (org.charAt(index) != prefix.charAt(index))
				result = false;
			index++;
		}
		return result;
	}
}
