/**
 * Aprende Java con Ejercicios ()
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 39
 * 
 * 
 */
public class S05Ejercicio39 {
  public static void main(String[] args) {

    int numeroIntroducido;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int n = 1; n <= numeroIntroducido; n++) {

      int factorial = n;

      for (int i = 1; i < n; i++) {
        factorial *= i;
      }

      System.out.println(n + "! = " + factorial);
    }
  }
}
