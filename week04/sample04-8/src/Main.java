//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    float exchange;
    int money ;
    float dollar;

    System.out.print("exchange price");
    exchange = keyboard.nextFloat();
    System.out.print("introduce the 금액");
    money = keyboard.nextInt();

    dollar = money / exchange;

    System.out.printf("change of won %,dwon is  %,.2f dollar \n", money,dollar);

}
