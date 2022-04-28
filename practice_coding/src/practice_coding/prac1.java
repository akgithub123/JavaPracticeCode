package practice_coding;

public class prac1 {

	public static void main(String[] args) {
		String st = "Aapaa";
		String reverse = "";

		for (int i = st.length() - 1; i >= 0; i--) 
		{
			reverse = reverse + st.charAt(i);
		}

		System.out.println("reverse of string is " + reverse);

		if (st.equals(reverse)) 
		{
			System.out.println("string is palindrome");
		} 
		else 
		{
			System.out.println("string is not palindrome");
		}

	}

}
