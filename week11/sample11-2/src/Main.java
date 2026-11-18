//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[][][] villa = new int[3][5][4];
    String[] dong = {"가동", "나동", "다동"};
    int[] total = new int[villa.length];

    for (int i = 0; i < villa.length; i++) {
        for (int j = 0; j < villa[i].length; j++) {
            for (int k = 0; k < villa[i][j].length - 1; k++) {
                System.out.printf("%s %d층 %d호 가족수 : ",
                        dong[i], j + 1, k + 1);
                villa[i][j][k] = (int) ((Math.random() * 6) + 1);
            }
        }
    }

    for (int i = 0; i < villa.length; i++) {
        for (int j = 0; j < villa[i].length; j++) {
            villa[i][j][villa[i][j].length - 1] =
                    villa[i][j][0] + villa[i][j][1] + villa[i][j][2];

            total[i] += villa[i][j][villa[i][j].length - 1];
        }
    }

    int sum = 0;
    for (int i = 0; i < total.length; i++)
        sum += total[i];

    System.out.println("\n\t 소망빌라 주민 집계표");
    for (int i = 0; i < villa.length; i++) {
        System.out.printf("\n\t%s\n", dong[i]);
        System.out.println("******************************");
        System.out.println("   1호  2호  3호 총합");
        System.out.println("******************************");

        for (int j = 0; j < villa[i].length; j++) {
            for (int k = 0; k < villa[i][j].length; k++) {
                System.out.printf(" %4d", villa[i][j][k]);
            }
            System.out.println();
        }

        System.out.println("******************************");
        System.out.printf("%s 총원 : %d 명\n", dong[i], total[i]);
    }

    System.out.printf("\n소망빌라 총원 : %,d 명\n", sum);
}