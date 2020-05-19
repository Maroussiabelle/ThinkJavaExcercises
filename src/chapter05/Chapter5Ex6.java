package chapter05;

public class Chapter5Ex6 {

    public static void baffle(String blimp) {
        System.out.println(blimp); //5 blimp : "rattle"
        zippo("ping", -5); //6
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop"); //7
        } else {//2
            System.out.println("ik"); //3
            baffle(quince); //4
            System.out.println("boo-wa-ha-ha");//8
        }
    }
    public static void main(String[] args) {
        zippo("rattle", 13);//1
    }
}

