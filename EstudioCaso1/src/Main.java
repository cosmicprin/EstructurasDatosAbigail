import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        while (opcion != 2) {
            System.out.println("\n=== Menú que analiza las expresiones ===");
            System.out.println("1. Ingresar expresión y verificar paréntesis");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                opcion = 0; /*opción inválida*/
            }

            if (opcion == 1) {
                System.out.print("Ingrese la expresión sin espacios: ");
                System.out.println("Ejemplo: (A+B)/4");
                String expresion = br.readLine();
                if (verificarParentesis(expresion)) {
                    System.out.println("Expresión válida (paréntesis balanceados).");
                } else {
                    System.out.println("Expresión inválida (paréntesis desbalanceados).");
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }

    /*Función que verifica si los paréntesis están balanceados*/

    public static boolean verificarParentesis(String expresion) {
        Pila pila = new Pila(expresion.length());

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.estaVacia()) {
                    return false; /*No hay paréntesis de apertura*/
                }
                pila.pop();
            }
        }
        return pila.estaVacia(); /*True si balanceado*/
    }
}