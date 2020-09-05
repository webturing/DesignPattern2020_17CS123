package lec03.builder.p5;

public interface Builder {
    void buildTitle();

    boolean buildWeekTitle();

    boolean buildCalendar(int year, int month);

    void buildDayOfMonth();

    calendarProduct getCalendarProduct();
}
