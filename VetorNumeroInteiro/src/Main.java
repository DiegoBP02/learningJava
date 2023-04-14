import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Digite um número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }

        sc.close();

    }
}