
public class addition_num_AlphanumString {

	public static void main(String[] args) {

		String str = "jklm34rst123nsq53spp19";
		int sum = 0;
		String temp = "0";
		for (int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				temp = temp + str.charAt(i);
			}
			else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = sum + Integer.parseInt(temp);
		System.out.println("sum of all numbers is: "+sum);
	}

}
