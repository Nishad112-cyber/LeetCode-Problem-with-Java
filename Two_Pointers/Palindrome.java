package Two_Pointers;

public class Palindrome {
    public  static boolean isPalindrome(String str){
        int left= 0, right=str.length()-1;

        while (left<=right) {
            if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
                continue;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;

        }

        return true;
    }
    public static void main(String[] args) {
        String str= "a man, a plan, a canal: panama";
        
        if(!isPalindrome(str)){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
