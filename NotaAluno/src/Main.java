import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        student.name = scan.nextLine();
        student.grade1 = scan.nextInt();
        student.grade2 = scan.nextInt();
        student.grade3 = scan.nextInt();

        student.checkGrade();
        System.out.println(student.message());

        scan.close();
    }
}