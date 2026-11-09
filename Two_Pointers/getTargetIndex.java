 package Two_Pointers;

import java.util.Arrays;

public class getTargetIndex {

    public static  int[] toSum(int[] nums, int target){
        int left= 0;
        int right= nums.length-1;

        while(left<right){
            int sum= nums[left] +nums[right];

            if(sum== target){
                return new int[]{left+1, right+1};

            }

            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
         return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] nums={2,7,11,13,14,16};
        int target= 9;

        System.out.print(Arrays.toString(toSum(nums, target)));
    }
    
}