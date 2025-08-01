public class EnumTest {
    private Day weekDay;

    public EnumTest(Day weekDay) {
        this.weekDay = weekDay;
    }

    public Day getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Day weekDay) {
        this.weekDay = weekDay;
    }

    public void tellItLikeItIs() {

        switch (weekDay) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}
