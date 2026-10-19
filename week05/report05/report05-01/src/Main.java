//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    String result;

    System.out.print("첫 번째 수를 입력 : ");
    num1 = keyboard.nextInt();
    System.out.print("두 번째 수를 입력 : ");
    num2 = keyboard.nextInt();
    System.out.print("세 번째 수를 입력 : ");
    num3 = keyboard.nextInt();

    result = num1 > 0 && num2 > 0 && num3 > 0 ? "모두 양수" :
            (num1 < 0 || num2 < 0 || num3 < 0 ? "음수 포함" : "모두 0");

    System.out.println(result);
}
