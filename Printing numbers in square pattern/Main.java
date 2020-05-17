import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int col=1;col<=n ;col++ ){
	        for (int col2=1;col2<=n ;col2++ ){
	            System.out.print(col);
	        }
	        System.out.println("");
	    }
	}
}