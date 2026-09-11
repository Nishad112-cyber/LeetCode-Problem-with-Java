public class Remove_Duplicate {
    public static int DuplicateRemove(int nums[]){
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] =nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int nums[] ={1,1,1,2,2,3,3,4,5,5,5,6,7,7,7,7};
        System.out.println(DuplicateRemove(nums));
    }
}
