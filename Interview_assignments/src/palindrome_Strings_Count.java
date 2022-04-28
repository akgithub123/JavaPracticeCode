//import java.util.Arrays;

public class palindrome_Strings_Count {
	
	static void pal_words(String strr) {
		int count = 0;
		String[] stst = strr.split(" ");
		//System.out.println(Arrays.toString(stst));
		
		for(int i = 0; i < stst.length; i++) {
			Boolean flag = true; 
			if(stst[i].length() == 1) {
				count++;
				//System.out.println(stst[i] + " is palindrom");
			} else {
				for(int x = 0, y = stst[i].length()-1; x < y; x++,y--) {
					if(stst[i].charAt(x) != stst[i].charAt(y)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					count++;
					//System.out.println(stst[i] + " is palindrom");
				}
			}
		}
		System.out.println("Total " + count + " words are palindrome");
	}

	public static void main(String[] args) {
			pal_words("I live with my mom dad");
			//System.out.println(strr.split(" "));
		}
		
	}


