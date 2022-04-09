import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueFabrica implements Estoque{

    private int QtdBloco;
    private int QtdResina;
    private int QtdCopinho;
    private int QtdRoloFibraVidro;


    @Override
    public void VendaCliente() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite a quantidade de pranchas que o cliente esta comprando: ");
        QtdBloco = prompt.nextInt();
        QtdResina = QtdBloco;
        QtdCopinho = 3 * QtdBloco;
        QtdRoloFibraVidro = 2 * QtdBloco;
    }

    public int getQtdBloco() {
        return QtdBloco;
    }

    public void setQtdBloco(int qtdBloco) {
        QtdBloco = qtdBloco;
    }

    public int getQtdResina() {
        return QtdResina;
    }

    public void setQtdResina(int qtdResina) {
        QtdResina = qtdResina;
    }

    public int getQtdCopinho() {
        return QtdCopinho;
    }

    public void setQtdCopinho(int qtdCopinho) {
        QtdCopinho = qtdCopinho;
    }

    public int getQtdRoloFibraVidro() {
        return QtdRoloFibraVidro;
    }

    public void setQtdRoloFibraVidro(int qtdRoloFibraVidro) {
        QtdRoloFibraVidro = qtdRoloFibraVidro;
    }
}
