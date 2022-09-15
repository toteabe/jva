/**
 * PruebaCoche.java
 * Programa que prueba la clase Coche
 * 
 */
public class PruebaCoche {
  public static void main(String[] args) {
    
    Coche cocheDePaco = new Coche("Saab", "93");
    Coche cocheDeJuan = new Coche("Toyota", "Avensis");

    cocheDePaco.recorre(30);
    cocheDePaco.recorre(40);
    cocheDePaco.recorre(220);
    cocheDeJuan.recorre(60);
    cocheDeJuan.recorre(150);
    cocheDeJuan.recorre(90);
    System.out.println("El coche de Paco ha recorrido " + cocheDeLuis.getKilometraje() + "Km");
    System.out.println("El coche de Juan ha recorrido " + cocheDeJuan.getKilometraje() + "Km");
    System.out.println("El kilometraje total ha sido de " + Coche.getKilometrajeTotal() + "Km");
  }
}
