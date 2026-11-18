//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String text;
    char[] isbn = new char[12];
    int total = 0;
    int check;

    System.out.print("ISBN 앞 12자리 입력 : ");
    text = keyboard.nextLine();

    if (text.length() == 12) {
        for (int i = 0; i < isbn.length; i++) {
            isbn[i] = text.charAt(i);

            if (isbn[i] < '0' || isbn[i] > '9')
                total = -1;
        }

        if (total != -1) {
            total = 0;

            for (int i = 0; i < isbn.length; i++) {
                if (i % 2 == 0)
                    total += (isbn[i] - '0');
                else
                    total += (isbn[i] - '0') * 3;
            }

            check = (10 - total % 10) % 10;

            System.out.printf("완성된 ISBN : %s%d\n", text, check);
        } else {
            System.out.println("ISBN 입력 오류입니다.");
        }
    } else {
        System.out.println("ISBN은 숫자 12자리로 입력하세요.");
    }
}

