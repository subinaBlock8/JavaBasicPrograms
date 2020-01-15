package JavaProgramming;

public class BasicPrograms {
	public static void main(String[]args)
	{
		//Simple Pattern
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
	   //Reverse the pattern	
	   for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	   System.out.println();
	   
	   
	   //Creating a program for Palindrome
	   int num=535;
	   int temp=num;
	   int rev=0,rem;
	   while(temp!=0)
	   {
		   rem=temp%10;
		   rev=rev*10+rem;
		   temp=temp/10;	   
	   }
	   if(num==rev)
	   {
		   System.out.println("It is a pallindrome number");
	   }
		   else
		   {
			   System.out.println("It is not a pallindrome number");
		   }
	}
}

    

