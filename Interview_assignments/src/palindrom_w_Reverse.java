
public class palindrom_w_Reverse {

	static String str = "aaddaa";
	static String reverse = "";
	public static void main(String[] args) {
		
		for(int i=str.length()-1; i>=0; i--) {
			
			reverse = reverse + str.charAt(i);
			
		}

		if(reverse.equals(str)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
