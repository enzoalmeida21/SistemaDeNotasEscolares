import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Qual o seu nome: ");
        student.name = sc.nextLine();
        System.out.println("Qual foi sua nota no primeiro trimestre: ");
        student.notaPrimeiroTrimestre = sc.nextDouble();
        System.out.println("Qual foi sua nota no segundo trimestre: ");
        student.notaSegundoTrimestre = sc.nextDouble();
        System.out.println("Qual foi sua nota no terceiro trimestre: ");
        student.notaTerceiroTrimestre = sc.nextDouble();

        System.out.println("nota 1: "+student.notaPrimeiroTrimestre+" nota 2: "+student.notaSegundoTrimestre+" nota 3: "+student.notaTerceiroTrimestre);
        student.notaFinal();


    }
}