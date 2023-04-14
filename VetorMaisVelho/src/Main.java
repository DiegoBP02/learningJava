import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] arrName = new String[n];
        int[] arrAge = new int[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            arrName[i] = sc.nextLine();
            System.out.print("Idade: ");
            arrAge[i] = sc.nextInt();
        }
        String olderPerson = "";
        int biggestAge = 0 ;
        for (int i = 0; i < n; i++){
            if(arrAge[i] > biggestAge){
                biggestAge = arrAge[i];
                olderPerson = arrName[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + olderPerson);

        sc.close();

    }
}