package programs;

public class Amstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=153;
		int z=x;
		int sum=0;
		while(x!=0)
		{
			int y=x%10;
			sum=sum+(y*y*y);
			x=x/10;
		}
		if(z==sum)
		{
			System.out.println("its Amstrong Number");
		}
		else
		{
			System.out.println("its not a Amstrong Number");
		}

	}

}
