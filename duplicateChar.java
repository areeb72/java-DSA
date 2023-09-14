import java.util.*;
public class duplicateChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String");
        String Str = sc.nextLine();

        char[]Array = Str.toCharArray();
        Arrays.sort(Array);

        int n= Array.length;

        for(int i = 0; i<n; i++){
            if(Array[i]==Array[i+1]){
                System.out.println("duplicate present");
            }
            else{
                System.out.println("No duplicate");
            }
        }



        
    }
    
}
