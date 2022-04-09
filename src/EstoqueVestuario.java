import java.util.ArrayList;
import java.util.Scanner;

class EstoqueVestuario implements Estoque{

    private int QtdBikini;
    private int QtdSunga;
    private int QtdWetsuit;
    private int QtdMaio;
    private int opcao;

    @Override
    public void VendaCliente() {

        Scanner prompt = new Scanner(System.in);

        ArrayList<String> produtosEstoque = new ArrayList<>();
        produtosEstoque.add("1 - Bikini");
        produtosEstoque.add("2 - Sunga");
        produtosEstoque.add("3 - Wetsuit");
        produtosEstoque.add("4 - Maio");

        System.out.println("Digite o produto que o cliente deseja comprar: ");
        System.out.println(produtosEstoque.get(0));
        System.out.println(produtosEstoque.get(1));
        System.out.println(produtosEstoque.get(2));
        System.out.println(produtosEstoque.get(3));
        opcao = prompt.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a quantidade de bikinis que o cliente deseja comprar: ");
            QtdBikini = prompt.nextInt();
        } else if (opcao == 2) {
            System.out.println("Digite a quantidade de sungas que o cliente deseja comprar: ");
            QtdSunga = prompt.nextInt();
        } else if (opcao == 3) {
            System.out.println("Digite a quantidade de wetsuits que o cliente deseja comprar: ");
            QtdWetsuit = prompt.nextInt();
        } else if (opcao == 4) {
            System.out.println("Digite a quantidade de maios que o cliente deseja comprar: ");
            QtdMaio = prompt.nextInt();
        } else {
            System.out.println("opcao invalida");
        }
    }

    public int getQtdBikini() {
        return QtdBikini;
    }

    public void setQtdBikini(int qtdBikini) {
        QtdBikini = qtdBikini;
    }

    public int getQtdSunga() {
        return QtdSunga;
    }

    public void setQtdSunga(int qtdSunga) {
        QtdSunga = qtdSunga;
    }

    public int getQtdWetsuit() {
        return QtdWetsuit;
    }

    public void setQtdWetsuit(int qtdWetsuit) {
        QtdWetsuit = qtdWetsuit;
    }

    public int getQtdMaio() {
        return QtdMaio;
    }

    public void setQtdMaio(int qtdMaio) {
        QtdMaio = qtdMaio;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
}




