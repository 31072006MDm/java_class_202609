//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("지구에서의 몸무게를 입력하세요 (kg): ");
    double weight = sc.nextDouble();

    double moon = weight * 0.165;

    System.out.printf("지구에서의 몸무게: %.2f kg\n", weight);
    System.out.printf("달에서의 몸무게: %.2f kg\n", moon);
    sc.close();
}
