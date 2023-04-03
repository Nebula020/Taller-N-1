import java.util.Scanner;

    public class Tarea_Con_Decimas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de X: ");
        double x = sc.nextDouble();

        double Z = 1; // Primer término de la serie
        double S = 1; // La suma comienza con el primer término

        int n = 1;
        while (Z >= 0.00001) {
            Z *= x/n; // Siguiente término de la serie
            S += Z; // Agregar el término a la suma
            n++; // Incrementar el número de términos
        }

        System.out.println("El valor de la serie S es: " + S);
    }
}