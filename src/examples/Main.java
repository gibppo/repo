package examples;

import examples.KvadratnoeUravnenie;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        KvadratnoeUravnenie kv = new KvadratnoeUravnenie();

        double res[] = kv.returnKoren(5,6,7);

        System.out.println(res[0]);
        System.out.println(res[1]);

    }
}
