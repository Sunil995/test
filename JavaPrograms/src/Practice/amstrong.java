package Practice;

public class amstrong 
{
	public static void main(String[] args) {
		int no=253;
		int no1=no;
		int sum=0;
		while(no!=0)
		{
			int y=no%10;
			sum=sum+(y*y*y);
			 no=no/10;
		}
		if(sum==no1)
		{
			System.out.println("its a Strong number");
		}
		else
		{
			System.out.println("its not a Strong number");
		}
	
	}

}
