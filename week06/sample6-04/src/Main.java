//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    final int YEAR = 365;
    final int CASE = 20;

    int life;
    int tobacco;
    int piece;
    long minute;
    int day;
    double price;

    System.out.print("담배를 몇 년 동안 피우셨나요? ");
    life = keyboard.nextInt();

    System.out.print("담배를 하루에 몇 개비 피우시나요? ");
    tobacco = keyboard.nextInt();

    System.out.print("담배 한 갑의 가격은 얼마인가요? ($) ");
    price = keyboard.nextDouble();

    piece = life * YEAR * tobacco;

    int box = piece / CASE
            + (piece % CASE == 0 ? 0 : 1);

    minute = (long) piece * 5;

    long totalDays = minute / (60 * 24);
    int years = (int) (totalDays / YEAR);
    day = (int) (totalDays % YEAR);
    int hour = (int) ((minute % (60 * 24)) / 60);
    int minutes = (int) (minute % 60);


    double totalCost = box * price;

    System.out.printf("지금까지 피운 담배 개비 수: %,d개비%n", piece);
    System.out.printf("지금까지 구매한 담뱃갑 수: %,d갑%n", box);

    System.out.printf(
            "총 흡연 시간: %d년 %d일 %d시간 %d분%n",
            years, day, hour, minutes
    );

    System.out.printf("담뱃갑 한 개의 가격: $%.2f%n", price);
    System.out.printf("지금까지 지출한 총 담배 비용: $%,.2f USD%n",
            totalCost);
}
