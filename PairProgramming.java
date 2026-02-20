/**
 * Práctica en parejas – Manejo de Excepciones en Java
 * Ingeniería de Software – Universidad Veracruzana
 */

// ── Ejercicio 3: Clase de excepción personalizada ────────────────────────────

/** Excepción que representa un error de operación inválida. */
class OperacionInvalidaException extends Exception {
    public OperacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// ── Ejercicio 6: Excepción secundaria para encadenamiento ────────────────────

/** Excepción lanzada por b() al detectar el error de a(). */
class ErrorEnCascadaException extends Exception {
    public ErrorEnCascadaException(String mensaje) {
        super(mensaje);
    }
}

// ── Clase principal ──────────────────────────────────────────────────────────

public class PairProgramming {

    // ── Ejercicio 4: Método que lanza la excepción personalizada ─────────────

    /** Procesa un valor; lanza OperacionInvalidaException si es negativo. */
    public void procesarValor(int valor) throws OperacionInvalidaException {
        if (valor < 0) {
            throw new OperacionInvalidaException(
                    "El valor proporcionado es negativo: " + valor);
        }
        System.out.println("  Valor procesado correctamente: " + valor);
    }

    // ── Ejercicio 6a: Método a() ─────────────────────────────────────────────

    /** Lanza siempre OperacionInvalidaException para demostrar el ejercicio. */
    public void a() throws OperacionInvalidaException {
        throw new OperacionInvalidaException("Error generado en el método a()");
    }

    // ── Ejercicio 6b: Método b() ─────────────────────────────────────────────

    /** Llama a a(), captura su excepción y lanza ErrorEnCascadaException. */
    public void b() throws ErrorEnCascadaException {
        try {
            a();
        } catch (OperacionInvalidaException e) {
            System.out.println("  b() capturó la excepción de a(): " + e.getMessage());
            throw new ErrorEnCascadaException(
                    "Error en cascada originado en a() y relanzado por b()");
        }
    }

    public static void main(String[] args) {

        System.out.println("=".repeat(60));
        System.out.println("PRÁCTICA EN PAREJAS – MANEJO DE EXCEPCIONES EN JAVA");
        System.out.println("=".repeat(60));

        // ── Ejercicio 1 ──────────────────────────────────────────────────────
        System.out.println("\n── Ejercicio 1 ──");
        try {
            throw new Exception("Mensaje de la excepción lanzada manualmente");
        } catch (Exception e) {
            System.out.println("  Mensaje capturado: " + e.getMessage());
        }

        // ── Ejercicio 2 ──────────────────────────────────────────────────────
        System.out.println("\n── Ejercicio 2 ──");
        try {
            throw new Exception("Excepción para mostrar stack trace");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("  [finally] Se ha alcanzado la cláusula finally.");
        }

        // ── Ejercicios 3 y 4 ─────────────────────────────────────────────────
        System.out.println("\n── Ejercicios 3 y 4 ──");
        PairProgramming instancia = new PairProgramming();
        try {
            instancia.procesarValor(10);
            instancia.procesarValor(-5);
        } catch (OperacionInvalidaException e) {
            System.out.println("  Excepción capturada: " + e.getMessage());
        }

        // ── Ejercicio 5 ──────────────────────────────────────────────────────
        System.out.println("\n── Ejercicio 5 ──");
        PairProgramming instanciaNula = null;
        try {
            instanciaNula.procesarValor(1);
        } catch (Exception e) {
            System.out.println("  Excepción capturada (Exception base): "
                    + e.getClass().getSimpleName() + " – " + e.getMessage());
        }

        // ── Ejercicio 6 ──────────────────────────────────────────────────────
        System.out.println("\n── Ejercicio 6 ──");
        try {
            instancia.b();
        } catch (ErrorEnCascadaException e) {
            System.out.println("  main() capturó la excepción de b(): " + e.getMessage());
            e.printStackTrace(System.out);
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.println("Práctica finalizada.");
        System.out.println("=".repeat(60));
    }
}
