public class isUnique_1_1 {
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "abbc";

        System.out.println(isUniqe(s2));

    }
    /*
    Given a string check if all character in the string are unique:
    input : abcd
    output: true

     */

    /*

    Steps :
    we can create an array of 128 char ASCII and check if every chare appeared once. if not return false;


     *///
    public static boolean isUniqe(String s){

        if (s.length() > 128)return false;

        boolean arr [] = new boolean[128];
        for (int i = 0 ; i < s.length();i ++){
            int val = s.charAt(i);
            if (arr[val]){
                return false;
            }
            arr[val] = true;
        }
        return true;
    }

}
