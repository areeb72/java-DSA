import java.util.*;
public class stringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Str = sc.nextLine();

        StringBuffer sb = new StringBuffer(Str);

        sb.reverse();

        System.out.println(sb.toString());

        if(sb.toString()==Str){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
    
}
