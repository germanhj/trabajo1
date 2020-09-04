public class Suma{
  public static void main(String args[]){

    int numero_uno = 5, numero_dos = 6, resultado = 0;
    int parametro = 5;

    switch (parametro) {
      case 1: resultado = numero_uno + numero_dos;
      System.out.println("el resultado es: " + resultado);
      break;

      case 2: resultado = numero_uno - numero_dos;
      System.out.println("el resultado de la resta es: " + resultado);
      break;

      case 3: resultado = numero_uno * numero_dos;
      System.out.println("el resultado de la multiplicacion es: " + resultado);
      break;

      case 4: resultado = numero_uno / numero_dos;
      System.out.println("el resultado de la divicion  es: " + resultado);
      break;

      default: System.out.println("Error!, Algo anda mal");
      break;
    }
  }
}
