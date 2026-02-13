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

    // Muestra los porcentajes de todos los candidatos del 1 al máximo registrado
    public void mostrarPorcentajes() {
        if (totalVotos == 0) {
            System.out.println("\nNo hay votos registrados aún.");
            return;
        }

        // Encontrar el candidato con el número más alto
        int maxCandidato = votos.keySet().stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("PORCENTAJES DE VOTOS POR CANDIDATO");
        System.out.println("=".repeat(50));

        // Mostrar todos los candidatos del 1 al máximo
        for (int i = 1; i <= maxCandidato; i++) {
            int cantidadVotos = votos.getOrDefault(i, 0);
            double porcentaje = (cantidadVotos * 100.0) / totalVotos;
            System.out.printf("%d. %.2f%%%n", i, porcentaje);
        }

        System.out.println("=".repeat(50));
    }

    public static void main(String[] args) {
        ContadorVotos contador = new ContadorVotos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE CONTEO DE VOTOS - URNA ELECTORAL");
        System.out.println();

        int opcion;

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar porcentajes de votos");
            System.out.println("2. Contar voto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        contador.mostrarPorcentajes();
                        break;

                    case 2:
                        System.out.print("Ingrese número de candidato: ");
                        int numeroCandidato = scanner.nextInt();

                        if (numeroCandidato <= 0) {
                            System.out.println("Error: El número debe ser positivo.");
                            break;
                        }

                        contador.registrarVoto(numeroCandidato);
                        System.out.println("Voto registrado (" + contador.totalVotos + " votos totales)");
                        break;

                    case 0:
                        System.out.println("\nCerrando programa...");
                        contador.mostrarResultados();
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        }
    }
}
