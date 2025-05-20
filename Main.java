public class Main {

    static class Ingresso {     // classe Ingresso
        double valor;

        Ingresso(double valor) {
            this.valor = valor;
        }

        void imprimeValor() {
            System.out.println("Valor do ingresso: R$" + valor);
        }
    }

    static class VIP extends Ingresso {            // clase VIP herda de Ingresso
        double valorAdicional;

        VIP(double valor, double valorAdicional) {
            super(valor);
            this.valorAdicional = valorAdicional;
        }

        double retornaValor() {
            return valor + valorAdicional;
        }
    }

    static class Normal extends Ingresso {          // classe Normal herda de Ingresso

        Normal(double valor) {
            super(valor);
        }

        void tipoIngresso() {
            System.out.println("Ingresso Normal");
        }
    }

    static class CamaroteInferior extends VIP {                   // classe CamaroteInferior herda de VIP
        String localizacao;

        CamaroteInferior(double valor, double valorAdicional, String localizacao) {
            super(valor, valorAdicional);
            this.localizacao = localizacao;
        }

        void imprimeLocalizacao() {
            System.out.println("Localização: " + localizacao);
        }
    }

    static class CamaroteSuperior extends VIP {                    // classe CamaroteSuperior herda de VIP

        CamaroteSuperior(double valor, double valorAdicional) {
            super(valor, valorAdicional);
        }

        double retornaValor() {
            return valor + valorAdicional;
        }
    }

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50);          // Ingesso comum
        ingresso.imprimeValor();

        Normal normal = new Normal(30);     // Ingresso normal
        normal.imprimeValor();
        normal.tipoIngresso();

        VIP vip = new VIP(50, 20);           // Ingresso VIP
        System.out.println("Valor do ingresso VIP: R$" + vip.retornaValor());

        CamaroteInferior camInf = new CamaroteInferior(60, 30, "Setor A");           // Camarote Inferior
        camInf.imprimeLocalizacao();
        System.out.println("Valor do Camarote Inferior: R$" + camInf.retornaValor());

        CamaroteSuperior camSup = new CamaroteSuperior(60, 50);           // Camarote Superio
        System.out.println("Valor do Camarote Superior: R$" + camSup.retornaValor());
    }
}
