//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"학생1", "학생2", "학생3", "학생4", "학생5",
            "학생6", "학생7", "학생8", "학생9", "학생10"};
    float[] weight = new float[name.length];
    final float MIN = 30.0f;
    final float MAX = 120.0f;
    float total = 0.0f;
    float avg;
    int count = 0;
    boolean swapped = false;

    for (int i = 0; i < weight.length; i++) {
        System.out.printf("%s 몸무게 입력 : ", name[i]);
        weight[i] = keyboard.nextFloat();

        if (weight[i] < MIN || weight[i] > MAX) {
            System.err.printf("ERROR : %.1f ~ %.1f\n", MIN, MAX);
            i--;
        }
    }

    for (int i = 0; i < weight.length; i++)
        total += weight[i];

    avg = total / weight.length;

    for (int i = 0; i < weight.length; i++) {
        if (weight[i] >= avg)
            count++;
    }

    for (int i = 0; i < weight.length - 1; i++) {
        swapped = false;

        for (int j = 0; j < weight.length - 1 - i; j++) {
            if (weight[j] > weight[j + 1]) {
                float temp = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = temp;

                String text = name[j];
                name[j] = name[j + 1];
                name[j + 1] = text;

                swapped = true;
            }
        }

        if (!swapped) break;
    }

    System.out.printf("평균 몸무게 : %.1f Kg\n", avg);
    System.out.printf("평균 이상자 비율 : %.1f %%\n",
            count / (float) weight.length * 100);

    System.out.println("몸무게 하위 2명");
    for (int i = 0; i < 2; i++)
        System.out.printf("%s : %.1f Kg\n", name[i], weight[i]);

    System.out.println("몸무게 상위 2명");
    for (int i = weight.length - 2; i < weight.length; i++)
        System.out.printf("%s : %.1f Kg\n", name[i], weight[i]);
}
