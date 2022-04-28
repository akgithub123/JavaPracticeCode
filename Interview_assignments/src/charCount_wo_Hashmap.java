
public class charCount_wo_Hashmap {

	public static void main(String[] args) {

		String str = "programming";
		while(str.length()>0) {
			char c = str.charAt(0);
			System.out.println(""+c + "---->"+count_char_func(str,c));
			str = str.replaceAll(""+c,"");
			
		}
	}
	
	private static int count_char_func(String str, char c) {
		int count = 0;
		while(str.indexOf(c) != -1) {
			count++;
			str = str.substring(str.indexOf(c)+1);
		}
		return count;
	}

}
