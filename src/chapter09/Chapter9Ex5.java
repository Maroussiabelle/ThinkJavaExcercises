package chapter09;

public class Chapter9Ex5 {


    public static void main (String[] args){
        String word = "abcde";
        String bla = "eda";
        System.out.println(isAbcderian("aba"));
//        System.out.println(isAbcderian(bla));
        abc();

    }

    public static boolean isAbcderian (String a){
        for (int i = 0; i<a.length()-1; i++){
            if (a.charAt(i+1)<a.charAt(i)){
                return false;
            }
        }
        return true;
    }

public static void abc (){
        for (int i=1; i<11; i++){
            System.out.println(i);
        }
}

}
