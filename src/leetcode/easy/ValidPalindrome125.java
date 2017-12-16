package leetcode.easy;

public class ValidPalindrome125 {

    public boolean isPalindrome(String s) {

        if(s==null){
            return true;
        }

        StringBuffer sb = new StringBuffer();

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        if(sb.length()==1){
            return false;
        }

        for(int i = 0, j = sb.length()-1; i<=j; i++, j--){
            char ci = Character.toLowerCase(sb.toString().charAt(i));
            char cj = Character.toLowerCase(sb.toString().charAt(j));

            System.out.println(ci + ":" + cj );

            if(ci!=cj){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        ValidPalindrome125 obj = new ValidPalindrome125();
        //boolean ret = obj.isPalindrome("A man, a plan, a canal: Panama");
        boolean ret = obj.isPalindrome("0P");
        System.out.println(ret);
    }
}
