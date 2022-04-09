import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Scanner;

public class ClientePedidoPrancha extends Cliente{

    private int OpcaoNivelSurf = 0;
    private float PesoSurfista;
    private String EstiloDePrancha;
    private String TipoRabeta;
    private String ComprimentoPrancha;

    Scanner prompt = new Scanner(System.in);

    public ClientePedidoPrancha() {

    }

    public void CaracteristicasPrancha() {
        System.out.println("Digite o Peso do Surfista:");
        PesoSurfista = prompt.nextFloat();
        System.out.println("Digite o Estilo de Prancha do Surfista: ");
        EstiloDePrancha = prompt.next();
        System.out.println("Digite o Tipo de Rabeta:");
        TipoRabeta = prompt.next();
        System.out.println("Digite o Comprimento da Prancha:");
        ComprimentoPrancha = prompt.next();
    }

    public float NivelSurf(){

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
            }
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

    public String getEstiloDePrancha() {
        return EstiloDePrancha;
    }

    public void setEstiloDePrancha(int estiloDePrancha) {
        EstiloDePrancha = String.valueOf(estiloDePrancha);
    }

    public String getTipoRabeta() {
        return TipoRabeta;
    }

    public void setTipoRabeta(int tipoRabeta) {
        TipoRabeta = String.valueOf(tipoRabeta);
    }

    public String getComprimentoPrancha() {
        return ComprimentoPrancha;
    }

    public void setComprimentoPrancha(String comprimentoPrancha) {
        ComprimentoPrancha = comprimentoPrancha;
    }


}
