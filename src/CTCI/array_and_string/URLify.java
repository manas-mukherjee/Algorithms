package CTCI.array_and_string;

public class URLify {
    public static void main(String args[]){
        String str = "Mr John Smith    ";

        char nChar, nnChar;
        char[] strArray = new char[str.length()];
        int count=0;

        for(int i=0; i<13; i++){
            char currChar = str.charAt(i);

            if(currChar == ' '){
                strArray[count]='%';
                strArray[++count]='2';
                strArray[++count]='0';
                count++;
            }else{
                strArray[count] = currChar;
                count++;
            }
        }
        System.out.println(new String(strArray));
    }
}
