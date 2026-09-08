public class Remove_Element {
    public static int removeElement(int nums[],  int val){
       int  k=0;
       for(int i=0; i<nums.length; i++){
           if(nums[i] != val){
              nums[k]=nums[i];
              k++;
           }
       }
       return k;

    }
    public static void main(String[] args) {
        int nums[]= {2,3,3,2,2,5,5};
        System.out.print(removeElement(nums, 3)+"");
    }
}
