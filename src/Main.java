import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Digite o número que deseja a tabuada: ");
                float num1 = in.nextFloat();

                for (int i = 1; i <= 10; i++) {

                    float resultado = num1 * i;

                    System.out.println(num1 + " x " + i + " = " + resultado);

                }
            } catch (InputMismatchException e) {

                System.out.println("Valor inválido, por favor digite apenas números!");
                in.nextLine();

            }

        }
    }
}