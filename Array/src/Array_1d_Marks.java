import java.util.Scanner;

public class Array_1d_Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.nextLine();
		String b=sc.nextLine();
		int k=sc.nextInt();
		int p=0;
		
		char []c=a.toCharArray();
		char []d=b.toCharArray();
		
 		
		
		if(a.contentEquals(b))
		{
			System.out.println("yes");
		}
		
		else
		{
			if(b.length()!=a.length())
			{
				int q=b.length();
                a=a.substring(0, q);
				if(b.length()-a.length()<0)
				{

					System.out.println(-q);
	
				}

				p=p+q;
			}
			
			
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)!=b.charAt(j))
				{
					c[j]=d[j];
					p++;
				}
								
			}
		}
		if(p<=k)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

}
