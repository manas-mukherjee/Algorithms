package CTCI;

public class Permutations {

    public static void main(String args[]){
        System.out.println("as".substring(1));
        System.out.println("-----------");
        new Permutations().permutation("manas");
    }

    private void permutation(String str) {
        permutation(str, "");
    }

    private void permutation(String str, String prefix) {
        if(str.length()==0){
            System.out.println(prefix);
        }else{
            for (int i=0; i<str.length(); i++){
                String rem = str.substring(0,i) + str.substring(i+1);
                System.out.println("i - " + i +" str - " + str+ " - " + " prefix - " + prefix);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
