
public class makeNumZero_array {

	public static boolean setzero(int arr[],int target)
	{
		int i=0;
		int j=arr.length-1;
		boolean flag=false;
		
		while(true)
		{
			if(target==0)
			{
				flag=true;
				break;
				
			}
			else
			{
				if(arr[i]<=target && arr[j] <= target )
				{
					if(arr[i]<arr[j])
					{
						target=target-arr[j];
						flag=false;
						j--;
					}else {
						target= target-arr[i];
						flag=false;
						i++;
					} 
				
				}else if(arr[i]<=target) {
					target= target-arr[j];
					flag=false;
					 j--;
					
				}else
				{
					flag= false;
		
					break;
				}	
					
			}
			
		}
		return flag;
	}
	public static void main(String args[])
	{
		int arr[]=new int[] {1,4,8,9};
		System.out.println(setzero(arr,9));
	}
}
