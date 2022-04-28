package practice_coding;

public class prac2 {

	public static void main(String[] args) {
		int num = 1331;
		int sum=0,r,temp;

		temp=num;
		
		while(num>0)
		{
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}

		if(temp==sum)
		{
			System.out.println("number is palindrome");	
		}
		else
		{
			System.out.println("number is not palindrome");
		}

	}

}
