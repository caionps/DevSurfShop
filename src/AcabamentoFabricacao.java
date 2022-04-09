public class AcabamentoFabricacao extends Fabrica {
    public void Laminacao() {
        System.out.println("Estamos agora laminando a sua prancha. Laminacao é o processo de aplicacao da resina" +
                " no bloco. Aguarde...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Laminacao concluida!");
    }

    public void Polimento() {
        System.out.println("Estamos Polindo agora a sua prancha, esse é o último processo. Aguarde...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Polimento realizado!");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


    @Override
    public void PrimeiroProcesso() {
        System.out.println("O primeiro Processo já acabou");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    @Override
    public void SegundoProcesso() {
        System.out.println("Sua pranchinha está pronta!!\n          *\n" +
                "        */ * \n" +
                "      * /  *\n" +
                "     * /  *\n" +
                "    * /  *\n" +
                "   * /  *\n" +
                "  * / *\n" +
                "  * * ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.exit(0);
    }
}


