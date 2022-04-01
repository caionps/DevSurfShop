import java.util.Scanner;

public class ClientePedidoPrancha extends Cliente{

    private int OpcaoNivelSurf = 0;
    //private float NivelSurf;
    private float PesoSurfista;
    private int EstiloDePrancha;
    private int TipoRabeta;
    private String ComprimentoPrancha;

    public ClientePedidoPrancha() {

    }

    public float NivelSurf(){

        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite o nível do Surfista");
        System.out.println("1 - Aprendiz\n2 - Iniciante\n3 - Iniciante/Intermediario\n4 - Intermediario\n" +
                "5 - Avancado\n6 - Profissional");
        OpcaoNivelSurf = prompt.nextInt();

        while (OpcaoNivelSurf != 7) {
            if (OpcaoNivelSurf == 1) {
                return (float) 1.2;
            }else if (OpcaoNivelSurf == 2){
                return (float) 1.6;
            }else if (OpcaoNivelSurf == 3){
                return (float) 1.9;
            }else if (OpcaoNivelSurf == 4){
                return (float) 2.3;
            }else if (OpcaoNivelSurf == 5){
                return (float) 2.6;
            }else if (OpcaoNivelSurf == 6) {
                return (float) 2.9;
            }break;
        }

        System.out.println("Opcao invalida, favor selecionar novamente!");
        return (float) 1.0;

    }

    public float CalculoVolume() {

        System.out.println("Qual é o peso do surfista?");
        return NivelSurf() * PesoSurfista;

    }

    //public String


    public int getOpcaoNivelSurf() {
        return OpcaoNivelSurf;
    }

    public void setOpcaoNivelSurf(int opcaoNivelSurf) {
        OpcaoNivelSurf = opcaoNivelSurf;
    }

    public float getPesoSurfista() {
        return PesoSurfista;
    }

    public void setPesoSurfista(float pesoSurfista) {
        PesoSurfista = pesoSurfista;
    }

    public int getEstiloDePrancha() {
        return EstiloDePrancha;
    }

    public void setEstiloDePrancha(int estiloDePrancha) {
        EstiloDePrancha = estiloDePrancha;
    }

    public int getTipoRabeta() {
        return TipoRabeta;
    }

    public void setTipoRabeta(int tipoRabeta) {
        TipoRabeta = tipoRabeta;
    }

    public String getComprimentoPrancha() {
        return ComprimentoPrancha;
    }

    public void setComprimentoPrancha(String comprimentoPrancha) {
        ComprimentoPrancha = comprimentoPrancha;
    }
}
