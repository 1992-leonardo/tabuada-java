import java.util.Scanner;

public class TabuadaMultiplicacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tabuada deseja consultar, por favor nos informe com o numero que deseja verificar: ");
        int tabuadaDesejada = scanner.nextInt();

        for(int numerais = 0; numerais <= 10; numerais++){
            System.out.println(tabuadaDesejada + " x " + numerais + " = " + (tabuadaDesejada * numerais));
        }

    }
}