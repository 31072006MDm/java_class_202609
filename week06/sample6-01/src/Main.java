//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner keyboard = new Scanner(System.in);
        int age;
        final int HEART = 65;
        final int DayofYear = 365;

    System.out.print("How long has you lived?");
    age = keyboard.nextInt();

    int day = age * DayofYear;
    int hour = day * 24;
    long minute = hour * 60L;

    long count = minute * HEART;

        System.out.printf("the avg of pulses are %,d pulses.%n", HEART);
        System.out.printf("your heart has in total %,d pulses all over the years you had lived ( %d years ) ", count, age);
}
