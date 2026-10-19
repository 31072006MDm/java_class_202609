//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int second = 54321;
    int hour;
    int minute;
    int result;

    hour = second / 3600;
    minute = (second % 3600) / 60;
    result = second % 60;

    System.out.printf("%,d 초 = %d 시간 %d 분 %d 초\n", second, hour, minute, result);
}
