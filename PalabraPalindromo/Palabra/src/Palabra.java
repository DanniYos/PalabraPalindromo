import java.util.Scanner;

public class Palabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra a evaluar: ");
        String palabra = scanner.nextLine();
        if (esPalindromo(palabra)){
            System.out.println("La palabra " + palabra + " es palindromo");
        }

    }

        private static boolean esPalindromo(String palabra) {
            palabra = palabra.toLowerCase();
            String palabra2 = palabra;
            int j = palabra.length() -1;
            for (int i = 0; i< palabra.length(); i++){
                if (palabra.charAt(i) == palabra2.charAt(j)){
                    return true;
                }
                j--;
            }
            return false;
        }
}
