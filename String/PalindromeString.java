public class PalindromeString {

    public static boolean palindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while (left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "DODO";

        System.out.println(palindrome(str));

    }
}
