import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] argumentos) {
        
        Scanner entrada = new Scanner(System.in, "utf-8");

        int opcao = 0;

        Conta c = null;
        
        while (opcao != 5) {

            opcao = exibirMenu(entrada);

            if (opcao == 1) {
                c = new Conta();
            } else if (opcao == 2) {
                //mostrar saldo
                System.out.println("Saldo: " + c.getSaldo());
            } else if (opcao == 3) {
                //depositar
                System.out.println("Informe valor deposito: ");
                double v = Double.parseDouble(entrada.nextLine());
                if(c.depositar(v)) {
                    System.out.println("Deposito realiado com sucesso.");
                } else {
                    System.out.println("Erro.");
                };
            } else if (opcao == 4) {
                //sacar
                System.out.println("Informe valor saque: ");
                double v = Double.parseDouble(entrada.nextLine());
                if(c.sacar(v)) {
                    System.out.println("Saque realiado com sucesso.");
                } else {
                    System.out.println("Erro.");
                };
            }
        }
    }


    private static int exibirMenu(Scanner entrada) {

        System.out.println("\n ==== \n Menu");
        System.out.println("1) Criar conta");
        System.out.println("2) Consultar saldo");
        System.out.println("3) Depositar");
        System.out.println("4) Sacar");
        System.out.println("5) Sair");
        System.out.println("Digite uma opcao: ");
        int opcao = Integer.parseInt(entrada.nextLine());

        return opcao;
    }
}
