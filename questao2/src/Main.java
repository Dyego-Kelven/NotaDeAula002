import java.util.Scanner;

public class Main {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;


    public Main(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }


    public double calcularValorCorrida() {
        double valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
        return valorFinal;
    }


    public void exibirDetalhesCorrida() {
        double valorFinal = calcularValorCorrida();
        System.out.printf("Detalhes da Corrida:\n");
        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Tempo de espera: %d minutos\n", tempoEspera);
        System.out.printf("Tarifa base: R$ %.2f\n", tarifaBase);
        System.out.printf("Fator de demanda: %.2f\n", fatorDemanda);
        System.out.printf("Valor final da corrida: R$ %.2f\n", valorFinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = sc.nextDouble();

        System.out.print("Digite o tempo de espera (em minutos): ");
        int tempoEspera = sc.nextInt();

        System.out.print("Digite a tarifa base: ");
        double tarifaBase = sc.nextDouble();

        System.out.print("Digite o fator de demanda: ");
        double fatorDemanda = sc.nextDouble();


        Main corrida = new Main (distancia, tempoEspera, tarifaBase, fatorDemanda);


        corrida.exibirDetalhesCorrida();

        sc.close();
    }
}
