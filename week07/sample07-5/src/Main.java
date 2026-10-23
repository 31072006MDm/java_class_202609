//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner keyboard = new Scanner(System.in);
        int year;
        String result = "";
        System.out.print("태어난 년도 입력 : ");
        year = keyboard.nextInt();
        switch (year % 12) {
            case 0:
                result = "원숭이";
                break;
            case 1:
                result = "닭";
                break;
            case 2:
                result = "개";
                break;
            case 3:
                result = "돼지";
                break;
            case 4:
                result = "쥐";
                break;
            case 5:
                result = "소";
                break;
            case 6:
                result = "호랑이";
                break;
            case 7:
                result = "토끼";
                break;
            case 8:
                result = "용";
                break;
            case 9:
                result = "뱀";
                break;
            case 10:
                result = "말";
                break;
            case 11:
                result = "양";
        }
        System.out.println("당신은 " + year + "생으로 " + result + "띠 입니다");
    }