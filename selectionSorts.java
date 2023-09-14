public class selectionSorts {
    public static void main(String[] args) {
        int arr[] = {67,54,3,9,1,78,};
        selectionsSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void selectionsSort(int arr[]){
        int n = arr.length;
        int small;
        for(int i = 0; i<n; i++){
            small = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[small]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small]= arr[i];
            arr[i] = temp;    

        }
    }
}


