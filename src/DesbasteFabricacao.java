public class DesbasteFabricacao extends Fabrica {


    public void Usinagem() {
        System.out.println("Estamos agora usinando a prancha do cliente. Isso significa que estamos deixando um bloco no formato" +
                " que voce deseja. Aguarde...");
        try {
            Thread.sleep(7000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Usinagem concluida");
    }

    public void CorteDaRabeta() {
        System.out.println("Vamos agora deixar a rabeta da prancha da maneira que o cliente pediu. Aguarde...");
        try {
            Thread.sleep(4000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Corte da rabeta realizado");
        try {
            Thread.sleep(1500);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


    @Override
    public void PrimeiroProcesso() {
        System.out.println("Vamos iniciar o primeiro processo que é o de usinagem e corte da rabeta");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    @Override
    public void SegundoProcesso() {
        System.out.println("O primeiro processo foi finalizado, vamos agora para o segundo que é o de Laminacao e" +
                " Polimento.");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
