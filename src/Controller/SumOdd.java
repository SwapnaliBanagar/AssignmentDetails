package Controller;

public class SumOdd {

	public static void main(String[] args) {
		int number=0;
		int sum=0;
		for(int i=0; i<=10;i++)
		{
			if (i%2!=0)
			{
				sum=sum+i;
			
			
			}
		}
		System.out.println(" Total Sum of the Odd Number = "+sum);
	}

}
