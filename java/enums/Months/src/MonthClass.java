public class MonthClass {
    private MonthStatus month;

    public MonthClass(MonthStatus month) {
        this.month = month;
    }

    public MonthStatus getMonth() {
        return month;
    }

    public void setMonth(MonthStatus month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "mes = " + month;
    }
}
