import java.util.Arrays;

public class bubbeSort {
    public static void main(String[] args) {
        int arr[]= {2,8,5,7,1,4};
        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        // System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]){
    
        int temp;
        for(int i = 0; i<arr.length; i++){
            for( int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    

                }
            }
            
        }
    }
    
}
