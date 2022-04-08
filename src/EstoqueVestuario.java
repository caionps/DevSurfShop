import java.util.ArrayList;
import java.util.Scanner;

class EstoqueVestuario implements Estoque{

    private int QtdBikini;
    private int QtdSunga;
    private int QtdWetsuit;
    private int QtdMaio;
    private int opcao;

    Scanner prompt = new Scanner(System.in);


    public void CompraFornecedor() {
        ArrayList<String> produtosFornecedor = new ArrayList<>();
        produtosFornecedor.add("1 - Bikini");
        produtosFornecedor.add("2 - Sunga");
        produtosFornecedor.add("3 - Wetsuit");
        produtosFornecedor.add("4 - Maio");

        System.out.println("Digite o produto que deseja encomendar: ");
        System.out.println(produtosFornecedor.get(0));
        System.out.println(produtosFornecedor.get(1));
        System.out.println(produtosFornecedor.get(2));
        System.out.println(produtosFornecedor.get(3));
        opcao = prompt.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a quantidade de Bikinis que deseja encomendar: ");
            prompt.nextInt();
        }else if (opcao == 2) {
            System.out.println("Digite a quantidade de Sungas que deseja encomendar: ");
        }else if (opcao == 3) {
            System.out.println("Digite a quantidade de Wetsuits que deseja encomendar: ");
        }else if (opcao == 4) {
            System.out.println("Digite a quantidade de Maios que deseja encomendar: ");
        }else {
            System.out.println("opcao invalida");
        }
    }

    public void VendaCliente() {


    }
}

