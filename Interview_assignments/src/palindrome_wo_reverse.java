
public class palindrome_wo_reverse {

	static String st = "Nitin";
	
	public static void main(String[] args) {

		Boolean flag = false;
		
		for(int i=0,j=st.length()-1 ; i<(st.length()/2) ; i++,j--) {
			
			if(st.charAt(i)==st.charAt(j)) {
				flag = true;
			}
			else{
				
				flag = false;
				break;
			}
		}
			
			if(flag) {
				System.out.println("String is palindrome");
			}
			else {
				System.out.println("string is not palindrome");
			}
		
	}

}
