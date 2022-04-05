public class FornecedorFabrica extends Fornecedor{

    private int BlocoEPS;
    private int BlocoPoliuretano;
    private int FibraDeVidro;
    private int ResinaEpoxy;
    private int ResinaPoliester;
    private int CopinhoQuilha;
    private int CopinhoLeash;

    public int getBlocoEPS() {
        return BlocoEPS;
    }

    public void setBlocoEPS(int blocoEPS) {
        BlocoEPS = blocoEPS;
    }

    public int getBlocoPoliuretano() {
        return BlocoPoliuretano;
    }

    public void setBlocoPoliuretano(int blocoPoliuretano) {
        BlocoPoliuretano = blocoPoliuretano;
    }

    public int getFibraDeVidro() {
        return FibraDeVidro;
    }

    public void setFibraDeVidro(int fibraDeVidro) {
        FibraDeVidro = fibraDeVidro;
    }

    public int getResinaEpoxy() {
        return ResinaEpoxy;
    }

    public void setResinaEpoxy(int resinaEpoxy) {
        ResinaEpoxy = resinaEpoxy;
    }

    public int getResinaPoliester() {
        return ResinaPoliester;
    }

    public void setResinaPoliester(int resinaPoliester) {
        ResinaPoliester = resinaPoliester;
    }

    public int getCopinhoQuilha() {
        return CopinhoQuilha;
    }

    public void setCopinhoQuilha(int copinhoQuilha) {
        CopinhoQuilha = copinhoQuilha;
    }

    public int getCopinhoLeash() {
        return CopinhoLeash;
    }

    public void setCopinhoLeash(int copinhoLeash) {
        CopinhoLeash = copinhoLeash;
    }

    public FornecedorFabrica(int BlocoEPS, int BlocoPoliuretano, int FibraDeVidro, int ResinaEpoxy, int ResinaPoliester,
                            int CopinhoQuilha, int CopinhoLeash){

        this.BlocoEPS = BlocoEPS;
        this.BlocoPoliuretano = BlocoPoliuretano;
        this.FibraDeVidro = FibraDeVidro;
        this.ResinaEpoxy = ResinaEpoxy;
        this.ResinaPoliester = ResinaPoliester;
        this.CopinhoQuilha = CopinhoQuilha;
        this.CopinhoLeash = CopinhoLeash;


    }
    public void fazerPedido() {
        boolean clienteEncomenda = false;
        if (BlocoEPS < 1 | BlocoPoliuretano < 1 | FibraDeVidro < 1
                | ResinaEpoxy < 5 | ResinaPoliester < 5 | CopinhoQuilha < 3 | CopinhoLeash < 1) {

            System.out.println("Necessario fazer pedido aos fornecedores.");

        }
        else if (clienteEncomenda == true) {

            System.out.println("Pedido de prancha feito, encomendar material para produção");
        }
        else{
            System.out.println("Não é necessario fazer pedidos.");}
    }



}