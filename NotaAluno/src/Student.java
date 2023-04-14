public class Student {
    String name;
    int grade1;
    int grade2;
    int grade3;
    int finalGrade;
    public int checkGrade() {
        return this.finalGrade = grade1 + grade2 + grade3;
    }

    public String message() {
        if (finalGrade >= 60) {
            return "FINAL GRADE = " + finalGrade + " PASS";
        } else {
            int missingPoints = 60 - finalGrade;
            return "FINAL GRADE = " + finalGrade + " FAILED" + " MISSING " + missingPoints + " POINTS";
        }
    }


}
