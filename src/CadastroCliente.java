import java.util.Scanner;

public class CadastroCliente extends Cliente{

    private String NomeCliente;
    private int Cpf;
    private String Endereco;
    private int Telefone;

    Scanner prompt = new Scanner(System.in);

    public CadastroCliente() {

    }

    public void Dados() {
        System.out.println("Digite o seu nome: ");
        this.NomeCliente = prompt.next();
        System.out.println("Digite o seu CPF");
        this.Cpf = prompt.nextInt();
        System.out.println("Digite o seu endereco: ");
        this.Endereco = prompt.next();
        System.out.println("Digite o seu telefone: ");
        this.Telefone = prompt.nextInt();
    }
}
