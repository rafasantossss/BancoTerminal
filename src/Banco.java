import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        Calculo calcular = new Calculo();

        ContaBancaria conta1 = new ContaBancaria();

        while(true){
            System.out.println("1 - Login");
            System.out.println("2 - Registro");
            int respostaLogin = Scanner.nextInt();
            Scanner.nextLine();

            switch (respostaLogin){
                case 2:
                    System.out.println("Digite seu nome: ");
                    String nomeCadastro = Scanner.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senhaCadastro = Scanner.nextLine();

                    conta1.titular = nomeCadastro;
                    conta1.senha = senhaCadastro;
                    break;
                case 1:

                System.out.println("Digite seu nome cadastrado: ");
                String nomeLogin = Scanner.nextLine();
                System.out.println("Digite sua senha cadastrada: ");
                String senhaLogin = Scanner.nextLine();

                if (senhaLogin.equals(conta1.senha) && nomeLogin.equals(conta1.titular)) {

                    while (true) {

                        System.out.println("\nBanco\n1 - depositar\n2 - sacar\n3 - saldo\n4 - sair\n");

                        int usuario = Scanner.nextInt();


                        switch (usuario) {
                            case 1:
                                System.out.println("\nQual valor do deposito?");
                                double valorDeposito = Scanner.nextDouble();
                                calcular.depositar(valorDeposito);
                                System.out.println("\nsaldo = " + calcular.saldo + "\n");
                                break;

                            case 2:
                                System.out.println("\nQual valor do saque?");
                                double valorSaque = Scanner.nextDouble();
                                calcular.sacar(valorSaque);
                                System.out.println("\nsaldo = " + calcular.saldo + "\n");
                                break;

                            case 3:
                                System.out.println("\nsaldo = " + calcular.saldo + "\n");
                                break;

                            case 4:
                                System.out.println("saindo...");
                                return;
                            default:
                                System.out.println("\nOpção inválida!\n");
                        }
                    }
                } else {
                    System.out.println("\ninvalido\n");
                }
            }
        }
    }
}