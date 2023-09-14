public class cycleSort {
    public static void main(String[] args) {
        int arr[] = {78,4,89,4,89,2,67};
        cycleSorts(arr);    
        swap(arr, 0, 0);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void cycleSorts(int arr[]){
        int  i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

    }
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
