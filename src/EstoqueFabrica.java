import java.util.ArrayList;
import java.util.Scanner;

class EstoqueFabrica implements Estoque{

    private int QtdBloco;
    private int QtdResina;
    private int QtdCopinho;
    private int opcao;

    Scanner prompt = new Scanner(System.in);


    public void CompraFornecedor() {
        ArrayList<String> produtosFornecedor = new ArrayList<>();
        produtosFornecedor.add("1 - Bloco");
        produtosFornecedor.add("2 - Resina");
        produtosFornecedor.add("3 - Copinho");

        System.out.println("Digite o produto que deseja encomendar: ");
        System.out.println(produtosFornecedor.get(0));
        System.out.println(produtosFornecedor.get(1));
        System.out.println(produtosFornecedor.get(2));
        opcao = prompt.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a quantidade de blocos que deseja encomendar: ");
            prompt.nextInt();
        }else if (opcao == 2) {
            System.out.println("Digite a quantidade de litros de resina que deseja encomendar: ");
        }else if (opcao == 3) {
            System.out.println("Digite a quantidade de copinhhos que deseja encomendar: ");
        }else {
            System.out.println("opcao invalida");
        }


    }

    public void VendaCliente() {
        System.out.println("Digite a quantidade de pranchas que o cliente esta comprando:");
    }
}
