public class Main {
    public static void main(String[] args) {
        Generics.Box<Day> dayBox = new Generics.Box<>(Day.SUNDAY);
        Day retrievedDay = dayBox.getValue();
        System.out.println(retrievedDay.isWeekend());
    }
}