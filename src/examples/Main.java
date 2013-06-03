package examples;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        KvadratnoeUravnenie kv = new KvadratnoeUravnenie();

        double res[] = kv.returnKoren(0, -4, 4);

        System.out.println(res[0]);
        System.out.println(res[1]);

    }
}
