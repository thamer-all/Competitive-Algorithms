import java.util.HashMap;

public class permutation_1_2 {

    public static void main(String[] args) {


        String a = "abc";
        String b = "cab";
        System.out.println(isPermutation(a,b));

        // System.out.println(isPermutation(a,b));
    }

     /*
    Given two strings check they are permutaiton
    input : car   rac
    output: true

     */

    /*

    Steps :
    key step:
    check if all characters in string a match all characters in string b

     */
    public static boolean isPermutation(String a, String b) {
        if (a.length()!= b.length())return false;
        int[] letters = new int[128];
        char [] arr1 = a.toCharArray();
        for (char c : arr1){
            letters[c]++;
        }
        for (int i = 0 ; i < b.length(); i++){
            int c = (int)b.charAt(i);
            letters[c]--;
            if (letters[c]<0){
                return false;
            }
        }
        return true;
    }
}
