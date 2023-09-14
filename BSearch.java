public class BSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,78,89};
        int target = 78;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        
    }
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        int mid = start + (end - start)/2;

        while(start<=end){
            if(target< arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid ; 
            }
        }
        return -1;
    }
    
}
