import java.util.Scanner;

abstract class Fornecedor {

    private String CNPJ;
    private String NomeFornecedor;
    private int Telefone;

    public void setCNPJ (String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ(){
        return CNPJ;
    }

    public void NomeFornecedor (String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }

    public String NomeFornecedor(){
        return NomeFornecedor;
    }

    public void setTelefone (int Telefone) {
        this.Telefone = Telefone;
    }

    public int getTelefone(){
        return Telefone;
    }

    public static void main(String[] args){

        Scanner prompt = new Scanner(System.in);
        System.out.println("Bem vindo a listagem de nossos fornecedores.");

        int opcao = 0;
        while (opcao != 3){
            System.out.println("Menu");
            System.out.println("Digite 1 - Para indentificar o Fornecedor da Fabrica");
            System.out.println("Digite 2 -Para indentificar o Fornecedor de Vestuario");
            opcao = prompt.nextInt();

            if(opcao == 1){
                System.out.println("Nosso Fornecedor de Fabrica, MateriaPrima.INC, CNPJ 0000000 e Telfone 11111," +
                        "está disponivel para pedidos");
            }

            else if (opcao == 2){
                System.out.println("Nosso Fornecedor de Vestuario, Vestuario.INC, CNPJ 1111111 e Telfone 000000," +
                        "está disponivel para pedidos");
            }
            else {
                System.out.println("Fornecedor não identificado.");
            }
        }


    }

}
