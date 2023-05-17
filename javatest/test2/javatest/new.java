import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max=arr[0],step=0;
		int lcm=0;
		for(int i=0;i<n;i++){
			 arr[i]= sc.nextInt(); 
			if(arr[i]>max){
				max  = arr[i];
				step  = arr[i];
			}
			if(max%arr[i]==0){
				lcm = max;
				break;
			}
			 max += step;
			
		}
		System.out.print(lcm);

		
	}
}