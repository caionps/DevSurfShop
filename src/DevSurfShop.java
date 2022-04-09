import java.util.Scanner;

public class DevSurfShop {
    public static void main(String[] args){

        Scanner prompt = new Scanner(System.in);
        System.out.println("Seja bem vindo a DevSurfShop!!");

        int opcao1 = 0;
        int opcao2 = 0;
        int opcao3 = 0;

        while (opcao1 != 3) {

            System.out.println("********** Menu **********");
            System.out.println("Digite a opção que deseja:");
            System.out.println("1 - Pedido ao Fornecedor\n2 - Pedido Cliente\n3 - Sair");
            opcao1 = prompt.nextInt();

            if (opcao1 == 1) {
            // Colocar o método do estoque aqui para avisar da BAIXA

                while (opcao2 != 5) {

                    System.out.println("Olá! Selecione a opcao que deseja:");
                    System.out.println("1 - Fazer pedido ao Fornecedor de Produtos para a Fábrica\n" +
                            "2 - Fazer pedido ao Fornecedor de Vestuario\n"
                            + "3 - Sair");
                    opcao2 = prompt.nextInt();

                    if (opcao2 == 1) {

                        FornecedorFabrica fornecedorFabrica = new FornecedorFabrica();
                        fornecedorFabrica.CompraFornecedor();

                    }else if (opcao2 == 2) {

                        FornecedorFabrica fornecedorFabrica = new FornecedorFabrica();
                        fornecedorFabrica.CompraFornecedor();

                    }else
                        System.out.println("Opcao Invalida, escolha novamente!\n\n");
                    }

            }else if (opcao1 == 2){

                ClientePedidoPrancha pedidoPrancha = new ClientePedidoPrancha();
                pedidoPrancha.NivelSurf();


                System.out.println("Bem vindo a opcao de Encomenda de pranchas de surf!");
                System.out.println("Digite o nome do cliente:");

                System.out.println("Digite ");


                }else{
                System.out.println("Opcao Invalida, escolha novamente!\n\n");
            }
        }
    }
}

