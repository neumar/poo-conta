import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] argumentos) {
        
        Scanner entrada = new Scanner(System.in, "utf-8");

        int opcao = 0;

        ArrayList<Conta> contas = new ArrayList<Conta>();
        
        while (opcao != 5) {

            opcao = exibirMenu(entrada);

            if (opcao == 1) {
                System.out.println("Informe nome do cliente: ");
                String nome = entrada.nextLine();
                System.out.println("Informe CPF do cliente: ");
                String cpf = entrada.nextLine();
                Cliente cliente1;
                cliente1 = new Cliente(nome, cpf);
                Conta c = new Conta(0, -500, cliente1);
                contas.add(c);

            } else if (opcao == 2) {
                //mostrar saldo
                
                System.out.println("Informe numero da conta: ");
                int numero = Integer.parseInt(entrada.nextLine());

                Conta c = buscarConta(contas, numero);

                if (c != null) {
                    System.out.println("Cliente: " + c.getNomeTitular());
                    System.out.println("Numero: " + c.getNumero());
                    System.out.println("Saldo: " + c.getSaldo());
                } else {
                    System.out.println("Erro: Numero de conta não encontrado");
                }

                
               
            } else if (opcao == 3) {
                //depositar
                System.out.println("Informe valor deposito: ");
                double v = Double.parseDouble(entrada.nextLine());
                if(conta1.depositar(v)) {
                    System.out.println("Deposito realiado com sucesso.");
                } else {
                    System.out.println("Erro.");
                };
            } else if (opcao == 4) {
                //sacar
                System.out.println("Informe valor saque: ");
                double v = Double.parseDouble(entrada.nextLine());
                if(conta1.sacar(v)) {
                    System.out.println("Saque realiado com sucesso.");
                } else {
                    System.out.println("Erro.");
                };
            }
        }
    }


    private static Conta buscarConta(ArrayList<Conta> l, int num) {

        for(Conta c : l) {
            if (c.getNumero() == num) {
                return c;
            }
        }
        return null;
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
