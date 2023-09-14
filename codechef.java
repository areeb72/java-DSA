
import java.util.Scanner;
public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int T = sc.nextInt();
	    
        for(int i = 0; i<=T; i++){
        int A = sc.nextInt();
	        if(A%7==0 && A%2==0){
	            System.out.println("Alice");
	        }
	        else if(A%9==0 && A%2==1){
	            System.out.println("Bob");
	        }
	        else{
	            System.out.println("Charlie");
	        }
        }   
    }
}
