import java.util.*;
public class pyramid
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		System.out.println("enter limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		if(i%2==0)
		k=0;
		else
		k=1;
		
		for(j=1;j<=i;j++)
		{
		    System.out.print(k);
		    if(k==1)
		    k=0;
		    else
		    k=1;
		}
		System.out.println();
		      
		   
		}
	}
}

