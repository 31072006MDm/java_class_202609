//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard= new Scanner(System.in);
    int second;
    int day;
    int hour;
    int minute;
    int result;

    System.out.print("hours to seconds:");
    second = keyboard.nextInt();

    minute = second / 60;
    result = second - (minute * 60);
    hour = minute / 60;
    minute = minute - (hour * 60);
    day = hour / 24;
    hour = hour - (day *24);

    System.out.printf("%d seconds are %d day %d hours %d minutes %d seconds", second, day, hour, minute, result);
}
