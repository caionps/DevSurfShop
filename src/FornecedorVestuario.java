public class FornecedorVestuario extends Fornecedor{

    private int wetSuit;
    private int sunga;
    private int maio;
    private int bikini;

    public int getWetSuit() {
        return wetSuit;
    }

    public void setWetSuit(int wetSuit) {
        this.wetSuit = wetSuit;
    }

    public int getSunga() {
        return sunga;
    }

    public void setSunga(int sunga) {
        this.sunga = sunga;
    }

    public int getMaio() {
        return maio;
    }

    public void setMaio(int maio) {
        this.maio = maio;
    }

    public int getBikini() {
        return bikini;
    }

    public void setBikini(int bikini) {
        this.bikini = bikini;
    }

    public FornecedorVestuario(int wetSuit, int sunga, int maio, int bikini){

        this.wetSuit = wetSuit;
        this.sunga = sunga;
        this.maio = maio;
        this.bikini = bikini;
    }
    public void fazerPedido() {
        if (wetSuit < 15 | sunga < 15 | maio < 15 | bikini < 15 ) {

            System.out.println("Necessario fazer pedido aos fornecedores.");

        }
        else{
            System.out.println("Estoque em condições ideais.");
        }

    }
}