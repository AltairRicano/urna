import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorVotos {

    private Map<Integer, Integer> votos;
    private int totalVotos;

    public ContadorVotos() {
        this.votos = new HashMap<>();
        this.totalVotos = 0;
    }

    public void registrarVoto(int numeroCandidato) {
        votos.put(numeroCandidato, votos.getOrDefault(numeroCandidato, 0) + 1);
        totalVotos++;
    }

    public void mostrarResultados() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RESULTADOS DEL CONTEO DE VOTOS");
        System.out.println("=".repeat(50));
        System.out.println("Total de votos contados: " + totalVotos);
        System.out.println("=".repeat(50));

        if (totalVotos == 0) {
            System.out.println("No se registraron votos.");
            return;
        }

        // Ordenar candidatos por número
        votos.keySet().stream()
                .sorted()
                .forEach(candidato -> {
                    int cantidadVotos = votos.get(candidato);
                    double porcentaje = (cantidadVotos * 100.0) / totalVotos;

                    System.out.printf("Candidato %d: %d votos (%.2f%%)%n",
                            candidato, cantidadVotos, porcentaje);
                });

        System.out.println("=".repeat(50));
    }

    public static void main(String[] args) {
        ContadorVotos contador = new ContadorVotos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE CONTEO DE VOTOS - URNA ELECTORAL");
        System.out.println();
        System.out.println("Instrucciones:");
        System.out.println("- Ingrese el número del candidato por cada voto");
        System.out.println("- Ingrese 0 cuando termine el conteo");
        System.out.println();

        int numeroCandidato;
        int votosIngresados = 0;

        while (true) {
            System.out.print("Ingrese número de candidato (0 para finalizar): ");

            try {
                numeroCandidato = scanner.nextInt();

                if (numeroCandidato == 0) {
                    break;
                }

                if (numeroCandidato < 0) {
                    System.out.println("Error: El número debe ser positivo o 0 para finalizar.");
                    continue;
                }

                contador.registrarVoto(numeroCandidato);
                votosIngresados++;
                System.out.println("Voto registrado (" + votosIngresados + " votos totales)");

            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        }

        scanner.close();
        contador.mostrarResultados();
    }
}
