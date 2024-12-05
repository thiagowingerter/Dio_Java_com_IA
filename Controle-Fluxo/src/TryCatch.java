import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
        scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Algum campo foi preenchido incorretamente, tente novamente.");
        }
    }
}
