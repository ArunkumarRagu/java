import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int count = 0;
		int charcount[] = new int[26];

        for (int i = 0; i<A.length(); i++)
        {
			charcount[A.charAt(i) - 'a']++;	
        }
        
        for (int i = 0; i<B.length(); i++)
		{
			charcount[B.charAt(i) - 'a']--;
		}

        for(int i = 0; i < 26; ++i)
		{
		if(charcount[i] != 0)
		{
			count = count+ Math.abs(charcount[i]);
		}
		}

        System.out.print(count/2);

    }
}



















