public class pattern {

    public static void main(String[] args) {

        String b = "abcd";
        int num = -12345;
        System.out.println(reverseNum(num));

        int j = b.length()-1, i = 0;
        char c [] =  b.toCharArray();
       while (i<j){
           char temp = c[i];
           c[i] = c[j];
           c[j] = temp;
           i++;j--;
       }
        System.out.println(new String(c));
       int [] arr= { 1,2,3,4,5,6};
       arr = reverseArray(arr);
        for (int n : arr){
            System.out.print(n+" ");
        }
    }
    public static int[] reverseArray(int [] arr){
        int i = 0 , j = arr.length-1;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static int reverseNum(int num){
        int rev = 0;
        while (num!= 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
}
