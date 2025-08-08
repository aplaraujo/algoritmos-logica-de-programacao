package model.entities;

import model.services.AverageService;

public class Average implements AverageService{
    private double grade1;
    private double grade2;

    public Average() {}

    public Average(double grade1, double grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    @Override
    public double average() {
        return ((grade1 * 3.5) + (grade2 * 7.5)) / 11;
    }

    @Override
    public String toString() {
        return "MEDIA = " + String.format("%.5f", average());
    }
}
