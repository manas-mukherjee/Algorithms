package leetcode.easy;

public class CountAndSay38 {
    static int counter;

    public static void main(String args[]) {
        CountAndSay38 obj = new CountAndSay38();
        System.out.println(obj.countAndSay(7));
    }

    public String countAndSay(int n) {
        String ret = "1";

        for(int i=0; i<n-1; i++){
            ret = countAndSay(ret);
            if(i==n){
                break;
            }
        }
        return ret;
    }

    private static String countAndSay(String n) {

        char[] nchars = n.toCharArray();
        char prevc = nchars[0];
        int charCounter = 1;

        StringBuffer sb = new StringBuffer();

        if(nchars.length==1){
            sb.append(charCounter);
            sb.append(prevc);
        }else{
            for (int i=1; i<nchars.length; i++) {
                if(prevc==nchars[i]){
                    charCounter++;
                }else {
                    sb.append(charCounter);
                    sb.append(prevc);

                    prevc = nchars[i];
                    charCounter = 1;
                }
                if(i==(nchars.length-1)){
                    sb.append(charCounter);
                    sb.append(prevc);
                }
            }
        }
        return sb.toString();
    }
}
