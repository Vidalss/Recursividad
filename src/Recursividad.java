public class Recursividad {



    //Método recursivo
    public static boolean esPalindromoRecursivo(String palabra) {

        if (palabra.length() <= 1) {
            return true;
        } else {
            if (palabra.charAt(0) == palabra.charAt(palabra.length() -1)) {
                return esPalindromoRecursivo(palabra.substring(1,palabra.length() -1));
            } else {
                return false;
            }
        }
    }

    //Metodo sin recursividad

    public static boolean esPalindromo(String palabra){
        palabra = palabra.toLowerCase();

        for (int i = 0, j = palabra.length() - 1; i <= j; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String palabra = "osa";

        System.out.println("¿La palabra " + palabra + " es un palíndromo?: " + esPalindromo(palabra));
        System.out.println("¿La palabra " + palabra + " es un palíndromo recursivo?: " + esPalindromoRecursivo(palabra));
    }

}
