import javax.sound.midi.Soundbank;

public class StringSubsequenceOfOther {

    public static Boolean stringSubsequence(String s1,String s2){
        int i = 0;
        int j = 0;
        while (i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else i++;
        }
        if(j==s2.length()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s1= "ABCDE";
        String s2= "AED";

        System.out.println(stringSubsequence(s1,s2));
    }
}
