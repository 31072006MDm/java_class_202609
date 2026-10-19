//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;
    char membership;
    boolean flag;
    String result;

    System.out.print("구매 금액 입력 : ");
    price = keyboard.nextInt();
    System.out.print("멤버십 회원 여부 입력 (Y, N) : ");
    membership = keyboard.next().charAt(0);

    flag = price >= 50000 || (membership == 'Y' && price >= 30000);

    result = price < 0 ? "Data 오류 입니다" :
            (flag == true ? "무료배송 가능" : "배송비 부과");

    System.out.println(result);

}
