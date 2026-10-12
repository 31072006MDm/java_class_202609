//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("판매금액을 입력하세요 : ");
    int total = sc.nextInt();
    int amount = (int) Math.round(total / 1.1); // 금액 (Neto)
    int tax = total - amount;                    // 세금 (IVA)
    System.out.printf("판매금액 : %,d원\n", total);
    System.out.printf("금액 : %,d원\n", amount);
    System.out.printf("세금 : %,d원\n", tax);
    sc.close();
}
