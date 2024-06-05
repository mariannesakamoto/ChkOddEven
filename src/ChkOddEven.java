import java.util.Scanner;

public class ChkOddEven {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Insira um numero entre 1 e 10: ");
            int num = input.nextInt();
            
            if (num >= 1 && num <= 10) {
                if (num % 2 == 0) {
                    System.out.println("O numero " + num + " e par");
                } else {
                    System.out.println("O numero " + num + " e impar");
                }
            } else {
                System.out.println("Por favor, insira um número válido entre 1 e 10.");
            }
        }
    }
}