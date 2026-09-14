public class MajorityElement {

    public static int MajorElement(int nums[]){
       int major=0;
       int count=0;
       for(int num : nums){
            if(count == 0){
                 major=num;
            }
            if(num== major){
                count++;
            }else{
                count--;
            }

       }
       return major;
    }
    public static void main(String[] args) {
        int nums[]= {1,1,1,2,2,2,2,1,3,3,3};
     int Ans=   MajorElement(nums);
        System.out.print(" this is major element : "+Ans);
    }
    
}