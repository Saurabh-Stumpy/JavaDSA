public class Anagram {

    public static Boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] count = new char[256];

        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i =0;i<count.length;i++){
            if(count[i]!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "AABBAW";
        String s2 = "BAABAQ";

        System.out.println(checkAnagram(s1,s2));
    }
}
