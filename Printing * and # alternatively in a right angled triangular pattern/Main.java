import java.util.Scanner;
class Main { 
	public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int num=1;
      for(int col=1;col<=n;col++){
        for(int col2=1; col2<=col; col2++){
            if(num%2==0){
                System.out.print("#");
            }
            else {
                System.out.print("*");
            }
            num++;
            
        }
        System.out.print("\n");
      }
    }
}