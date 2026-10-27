public class CajaFuerte {

    private static final int MAX_INTENTOS = 3;

    private String combinacion;
    private boolean bloqueada;
    private int intentosFallidos;

    public CajaFuerte(String combinacion) {
        this.combinacion = combinacion;
        this.bloqueada = false;
        this.intentosFallidos = 0;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public boolean abrir(String intentoClave) {

        if (bloqueada) {
            System.out.println("Caja bloqueada: no se aceptan más intentos.");
            return false;
        }

        if (combinacion.equals(intentoClave)) {
            intentosFallidos = 0; // un acierto reinicia el contador
            System.out.println("Clave correcta: caja abierta.");
            return true;
        }

        intentosFallidos++;
        System.out.println("Clave incorrecta (intento fallido " + intentosFallidos + " de " + MAX_INTENTOS + ").");

        if (intentosFallidos >= MAX_INTENTOS) {
            bloqueada = true;
            System.out.println("Demasiados errores: la caja quedó BLOQUEADA.");
        }

        return false;
    }

    public boolean cambiarCombinacion(String claveActual, String nuevaClave) {

        if (bloqueada) {
            System.out.println("Cambio rechazado: la caja está bloqueada.");
            return false;
        }

        if (!combinacion.equals(claveActual)) {
            System.out.println("Cambio rechazado: la clave actual es incorrecta.");
            return false;
        }

        if (nuevaClave == null || nuevaClave.trim().isEmpty()) {
            System.out.println("Cambio rechazado: la nueva clave no puede estar vacía.");
            return false;
        }

        combinacion = nuevaClave;
        System.out.println("Combinación actualizada.");
        return true;
    }
}