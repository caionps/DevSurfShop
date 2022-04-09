import java.util.ArrayList;
import java.util.Scanner;

public class FornecedorFabrica implements Fornecedor {

    private int EncomendaBloco;
    private int EncomendaResina;
    private int EncomendaCopinho;
    private int EncomendaRoloFibraVidro;
    private int opcao;

    Scanner prompt = new Scanner(System.in);

    public void CompraFornecedor() {
        ArrayList<String> produtosFornecedor = new ArrayList<>();
        produtosFornecedor.add("1 - Bloco");
        produtosFornecedor.add("2 - Resina");
        produtosFornecedor.add("3 - Copinho");
        produtosFornecedor.add("4 - Rolo de Fibra de vidro");

        System.out.println("Digite o produto que deseja encomendar: ");
        System.out.println(produtosFornecedor.get(0));
        System.out.println(produtosFornecedor.get(1));
        System.out.println(produtosFornecedor.get(2));
        System.out.println(produtosFornecedor.get(3));
        opcao = prompt.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a quantidade de blocos que deseja encomendar: ");
            EncomendaBloco = prompt.nextInt();
        } else if (opcao == 2) {
            System.out.println("Digite a quantidade de litros de resina que deseja encomendar: ");
            EncomendaResina = prompt.nextInt();
        } else if (opcao == 3) {
            System.out.println("Digite a quantidade de copinhhos que deseja encomendar: ");
            EncomendaCopinho = prompt.nextInt();
        } else if (opcao == 4) {
            System.out.println("Digite a quantidade de rodos de fibra de vidro que deseja encomendar: ");
        } else {
            System.out.println("opcao invalida");
        }
    }
}