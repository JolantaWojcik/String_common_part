import javax.swing.JOptionPane;

public class StringClass {
	public static void main(String[] args) {
		String n1 = "11000";
		String n2 = "00110";
		//		N1 = "11000"
		//				 * N2 = "00110"
		//				 * result: "11000110"

		//	String characters = String.valueOf(JOptionPane.showInputDialog("Enter string to proceed"));

		String n3 = shortest(n1, n2);
		System.out.println(n3);
	}

	/**
	 * Should return shortest String which contains n1 and n2 value.
	 * 
	 * <pre>
	 * For example:
	 * N1 = "111";
	 * N2 = "1";
	 * result: "111" because, it contains "111" and "1"
	 * N1 = "11000"
	 * N2 = "00110"
	 * result: "11000110"
	 *       N1"11000"
	 *          N2"00110"
	 * </pre>
	 * 
	 * Assume that n2 is no longer than n1 and they both are not. empty and
	 * words can contains only "0" or "1"
	 * 
	 * @param n1
	 * @param n2
	 * @return shortest string which contains n1 and n2
	 */
	private static String shortest(String n1, String n2) {
		String result =null;
		String rest = null;
		int count = 0;
		char[] ch = new char[n1.length()];
		for(char c: n1.toCharArray())
		{
			if(c != n2.charAt(count)){
				count++;
				ch[count]=c;
				//  rest = n1.substring(0,ch.length);//+  n1.substring(ch.length, count);
				//nie rozumiem czym jest / skad ta pozostala czesc Stringa
				rest = n2;
			}else{
				count=1;
			}
			result = new String(ch) + rest;
		}

		return result;
	}

}
