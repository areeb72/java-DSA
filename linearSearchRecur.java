public class linearSearchRecur {
    public static void main(String[] args) {
        int[] arr= {5,3,45,67,8,5,4,3};
        int result=linearSearch(arr, 8, 0);
        System.out.println(result);
    }

    static int linearSearch(int arr[], int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        else{
             return linearSearch(arr, target, index+1);
        }
        
        
    }
}
