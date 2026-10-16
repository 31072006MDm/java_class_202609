//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int height;
    int age;
    boolean guardian;

    System.out.print("키를 입력하세요(cm): ");
    height = keyboard.nextInt();

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();

    System.out.print("보호자와 동반했습니까?(true/false): ");
    guardian = keyboard.nextBoolean();

    if (height >= 120 && (age >= 10 || guardian)) {
        System.out.println("탑승 가능합니다.");
    } else {
        System.out.println("탑승할 수 없습니다.");

    }

}
