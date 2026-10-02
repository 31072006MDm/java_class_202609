//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double a = 1500.35;
    double b = 890.76;

    int sum = (int) (a + b);
    double tax = sum * (10.0 / 100);
    int result =(int) (sum - tax);

    System.out.printf("이자1= %.2f won \n", a);
    System.out.printf("이자2= %.2f won\n ", b);
    System.out.printf("합계= %,d won\n ", sum);
    System.out.printf("세금= %,.2f won\n", tax);
    System.out.printf("순서 이자: %,d won \n", result);



}
