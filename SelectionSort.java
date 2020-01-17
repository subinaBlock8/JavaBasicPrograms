package JavaProgramming;

public class HelloWorld {

	public static void main(String[] args) {
		 int[]arr={56,78,3,90,13,18};
	       int min,temp=0;
	       for(int i=0;i<arr.length;i++)
	       {
	    	   min=i;
	    	   for(int j=i+1;j<arr.length;j++)
	    	   {
	    		   if(arr[j]<arr[min])
	    		   {
	    			   min=j;
	    		   }
	    	   }
	    	   temp=arr[i];//swapping is done
	    	   arr[i]=arr[min];
	    	   arr[min]=temp;
	       }
	       for(int i=0;i<arr.length;i++)
	       {
	    	   System.out.println(arr[i]);
	       }
	    	   
	}
}

