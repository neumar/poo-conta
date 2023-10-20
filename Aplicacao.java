public class Aplicacao {

    public static void main(String[] argumentos) {
        System.out.println("Sistema de Contas Bancarias");
       
        Conta c1 = new Conta(0, 1000);
        Conta c2 = new Conta(300);

        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());

        c1.depositar(500);
        c2.depositar(-50);

        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());



    }
}
