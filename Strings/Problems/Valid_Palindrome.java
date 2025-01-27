package DSA.Strings.Problems;

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
public class Valid_Palindrome {
    public static void main(String args[]){
        Valid_Palindrome obj = new Valid_Palindrome();
        boolean result = obj.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
    // Check for Character Categories
    public boolean isPalindrome(String s) {
        boolean res = true;
        String str = "";
        for(int i = 0;i < s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str += s.charAt(i);
            }
        }
        System.out.println(str);
        int j = str.length()-1;
        for(int k = 0;k < str.length();k++){
            if(j > k && Character.toLowerCase(str.charAt(k)) == Character.toLowerCase(str.charAt(j)) ){
                j -= 1;
            }   
            else if(j <= k){
                break;
            }
            else{
                res = false;
            }
        }
        return res;
    }
}
