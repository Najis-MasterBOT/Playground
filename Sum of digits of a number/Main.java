import java.util.Scanner;
class Main {
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int n=1;
	    int sum=num%10;
	    int loop=1;
	    while(loop>0)
	    {
	       if (num/10 ==0){
	           loop=0;
	       }
	       else{
	           num=num/10;
	           sum=sum+(num%10);
	       }
	    }
	    System.out.println(sum);
    }
}