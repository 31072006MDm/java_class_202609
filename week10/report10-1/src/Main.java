//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    float[] score = new float[7];
    float total = 0.0f;
    float max;
    float min;
    float avg;
    for (int i = 0; i < score.length; i++) {
        System.out.printf("%d번째 심사위원 점수 입력 : ", i + 1);
        score[i] = keyboard.nextFloat();
        total += score[i];
    }
    max = score[0];
    min = score[0];
    for (int i = 1; i < score.length; i++) {
        if (score[i] > max)
            max = score[i];
        if (score[i] < min)
            min = score[i];
    }
    avg = (total - max - min) / 5.0f;
    System.out.printf("최고 점수 : %.1f 점\n", max);
    System.out.printf("최저 점수 : %.1f 점\n", min);
    System.out.printf("최종 점수 : %.1f 점\n", avg);
}
