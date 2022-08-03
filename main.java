/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Conta p1 = new Conta(0, null, null, 0, false);
        Conta p2 = new Conta(0, null, null, 0, false);

        p1.setDono("Jacque");
        p1.setNumConta(11111);
        p1.print();

        p2.setDono("Ueslei");
        p2.setNumConta(22222);
        p2.print();

        p1.setStatus(true);
        p1.depositar(100);
        p1.print();
    }
}
