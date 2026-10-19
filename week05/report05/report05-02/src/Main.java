//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    int level;
    char grade;
    char sign;

    System.out.print("당신의 JAVA 점수 입력 : ");
    score = keyboard.nextInt();

    level = score >= 95 ? 0 :
            (score >= 90 ? 0 :
                    (score >= 85 ? 1 :
                            (score >= 80 ? 1 :
                                    (score >= 75 ? 2 :
                                            (score >= 70 ? 2 :
                                                    (score >= 65 ? 3 :
                                                            (score >= 60 ? 3 : 4)))))));

    grade = (char) ('A' + level);
    sign = score >= 95 || (score >= 85 && score < 90) ||
            (score >= 75 && score < 80) || (score >= 65 && score < 70) ? '+' : '0';

    System.out.printf("입력 점수 : %d\n", score);
    System.out.printf("학점 : %c%c\n", grade, sign);

}
