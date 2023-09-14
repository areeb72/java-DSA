public class insertioSort {
    public static void main(String[] args) {
        int arr[] = {8,45,6,3,90,65,3,2,89};
        insertioSortExample(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void insertioSortExample(int[]arr){
        int n = arr.length;
        int temp;
        for(int i = 0; i<n; i++){
            temp = arr[i];
            int j =i-1;
            while(j>=0 &&arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
                
            }
            arr[j+1] = temp;
        }
    

    }
}
