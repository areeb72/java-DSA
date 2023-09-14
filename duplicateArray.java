
public class duplicateArray {
    public int removeDuplicate (int[]nums) {
        // int nums[] = new int [];
        int n = nums.length;
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==nums[i+1]){
                count ++;
            }
            else{
                continue;
            }
        }
        return count;
    }
    
}
