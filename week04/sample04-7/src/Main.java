//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;
    System.out.print("first number:");
    num1 = keyboard.nextInt();
    System.out.print("second number:");
    num2 = keyboard.nextInt();

    System.out.printf("%d and%d divided is = %d, rest = %d\n", num1,num2,num1 / num2,num1%num2);
    System.out.printf("%d and %divided is = %.1f\n", num1,num2, (float)num1 / num2);

}
