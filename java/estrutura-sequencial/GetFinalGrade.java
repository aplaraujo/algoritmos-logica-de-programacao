import entities.Grade;
import java.util.Locale;
import java.util.Scanner;

public class GetFinalGrade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Grade grade = new Grade();

        grade.Name = sc.nextLine();
        grade.Grade1 = sc.nextDouble();
        grade.Grade2 = sc.nextDouble();
        grade.Grade3 = sc.nextDouble();

        System.out.println(grade);

        if (grade.FinalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - grade.FinalGrade());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
