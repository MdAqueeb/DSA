package DSA.Strings.Problems;
// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.
public class Reverse_String {
    public static void main(String args[]){
        char[] s = {'h','e','l','l','o'};
        Reverse_String obj = new Reverse_String();
        obj.reverseString(s);
    }
    public void reverseString(char[] s) {
        int j = s.length-1;
        for(int i = 0;i < s.length;i++){
            if(j > i){
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
                j -= 1;
            }
        }
        return ;
    }
}
