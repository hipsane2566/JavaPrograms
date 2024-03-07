public class ReverseTheString {
	  
	public static String resverString(String str) {
		StringBuilder sb = new StringBuilder();
		sb.setLength(str.length());
		int len = str.length();
		for(int i = 0; i<len; i++) {
			sb.setCharAt(i, str.charAt(len-i-1));
		 }
		   
		   return sb.toString();
	}

	  public static void main(String[] args) {
		  String originalString = "ReverseStringUsingStringBuilder";
		  System.out.println("Original String: " + originalString);
		  String result = resverString(originalString);
		  System.out.println("Reverse String: " + result);
	  }
	}
