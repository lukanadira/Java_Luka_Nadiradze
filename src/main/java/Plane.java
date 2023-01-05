public class Plane {
    private String WeekDays;
    private Double Clock;

    public Plane(String weekDays, Double clock) {
        WeekDays = weekDays;
        Clock = clock;
    }

    public String getWeekDays() {
        return WeekDays;
    }

    public void setWeekDays(String weekDays) {
        WeekDays = weekDays;
    }

    public Double getClock() {
        return Clock;
    }

    public void setClock(Double clock) {
        Clock = clock;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "WeekDays='" + WeekDays + '\'' +
                ", Clock=" + Clock +
                '}';
    }
}
