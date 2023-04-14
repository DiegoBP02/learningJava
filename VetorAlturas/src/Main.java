import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String[] arrName = new String[n];
        int[] arrAge = new int[n];
        Double[] arrHeight = new Double[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            arrName[i] = sc.nextLine();

            System.out.print("Idade: ");
            arrAge[i] = sc.nextInt();

            System.out.print("Altura: ");
            arrHeight[i] = sc.nextDouble();
        }

        double averageHeight = 0;
        double sixteenAge = 0;
        for(int i = 0; i < n; i++){
            averageHeight += arrHeight[i];
            if(arrAge[i] < 16){
                sixteenAge++;
            }
        }
        double percent = (sixteenAge * 100) / n;
        System.out.print("Altura média: " + String.format("%.2f%n", averageHeight/n));
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
        for(int i = 0; i < n; i++){
            if(arrAge[i] < 16){
                System.out.println(arrName[i]);
            }
        }

        sc.close();

    }
}