import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] arrName = new String[n];
        double[] arrFirstGrade = new double[n];
        double[] arrSecondGrade = new double[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            arrName[i] = sc.next();
            sc.nextLine();
            arrFirstGrade[i] = sc.nextDouble();
            arrSecondGrade[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++){
            if((arrFirstGrade[i] + arrSecondGrade[i]) / 2 >= 6){
                System.out.println(arrName[i]);
            }
        }

        sc.close();

    }
}