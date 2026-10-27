//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CajaFuerte caja = new CajaFuerte("4821");

    System.out.println("--- Apertura correcta ---");
    caja.abrir("4821");

    System.out.println("\n--- Cambio de combinación ---");
    caja.cambiarCombinacion("0000", "7355");   // clave actual incorrecta
    caja.cambiarCombinacion("4821", "7355");   // exitoso

    System.out.println("\n--- Dos errores y un acierto (el contador se reinicia) ---");
    caja.abrir("1111");
    caja.abrir("2222");
    caja.abrir("7355");
    System.out.println("Intentos fallidos: " + caja.getIntentosFallidos());

    System.out.println("\n--- Tres errores seguidos ---");
    caja.abrir("1111");
    caja.abrir("2222");
    caja.abrir("3333");

    System.out.println("\n--- Con la caja bloqueada ---");
    caja.abrir("7355");                        // correcta, pero ya no sirve
    caja.cambiarCombinacion("7355", "9999");   // tampoco se puede cambiar

    System.out.println("\nEstado final -> bloqueada: " + caja.isBloqueada());

}
