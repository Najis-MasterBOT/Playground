import java.util.Scanner;
class Main {
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int n=1;
	    int fdc=0;
	    int loop=1;
	    while(loop>0)
	    {
	        if (num/n == 0){
	            loop=0;
	        }
	        else{
	            n=n*10;
	        }
	    }
	    int fd= num/(n/100);
        int sd= fd%10;
	    System.out.println(sd);
	}
}