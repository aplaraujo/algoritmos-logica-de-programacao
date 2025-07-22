package entities;

public class Grade {
    public String Name;
    public double Grade1;
    public double Grade2;
    public double Grade3;

    public double FinalGrade() {
        return Grade1 + Grade2 + Grade3;
    }

    @Override
    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", FinalGrade());
    }
}
