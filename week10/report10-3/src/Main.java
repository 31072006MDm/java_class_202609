//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner keyboard = new Scanner(System.in);
        String text;
        char[] number = new char[13];
        int count = 0;
        int total = 0;
        int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int check;
        boolean flag = true;

        System.out.print("주민등록번호 입력 (예 660510-1321611) : ");
        text = keyboard.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '-') {
                if (count < number.length) {
                    number[count] = text.charAt(i);
                    count++;
                } else {
                    flag = false;
                }
            }
        }

        if (count != 13)
            flag = false;

        if (flag) {
            for (int i = 0; i < number.length; i++) {
                if (number[i] < '0' || number[i] > '9')
                    flag = false;
            }
        }

        if (flag) {
            if (number[6] < '0' || number[6] > '8')
                flag = false;
        }

        if (flag) {
            for (int i = 0; i < weight.length; i++)
                total += (number[i] - '0') * weight[i];

            check = (11 - total % 11) % 10;

            if (check == number[12] - '0')
                System.out.println("올바른 주민등록번호입니다.");
            else
                System.out.println("올바르지 않은 주민등록번호입니다.");
        } else {
            System.out.println("올바르지 않은 주민등록번호입니다.");
        }
    }

