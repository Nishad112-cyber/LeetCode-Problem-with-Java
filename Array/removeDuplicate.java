class removeDplicate {
    public int removeDuplicates(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (k < 2 || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
           int nums[] = {1,1,1,2,2,2,2,5,5,5,6};
        removeDplicate obj = new removeDplicate();

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}