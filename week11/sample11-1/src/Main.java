//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[][] school = new int[3][7];
    school = new int[][]{
            {41, 43, 45, 42, 44, 39, 0},
            {38, 37, 40, 39, 40, 37, 0},
            {35, 37, 41, 38, 38, 37, 0}
    };

    for (int i = 0; i < school.length; i++) {
        for (int j = 0; j < school[i].length - 1; j++) {
            school[i][school[i].length - 1] += school[i][j];
        }
    }

    int total = 0;
    for (int i = 0; i < school.length; i++) {
        total += school[i][school[i].length - 1];
    }

    System.out.println("\n\t 경복고등학교 학생 집계표");
    System.out.println("******************************************");
    System.out.println("   1반  2반  3반  4반  5반  6반 총합");
    System.out.println("******************************************");

    for (int i = 0; i < school.length; i++) {
        for (int j = 0; j < school[i].length; j++) {
            System.out.printf(" %4d", school[i][j]);
        }
        System.out.println();
    }

    System.out.println("******************************************");
    System.out.printf("\n총원 : %d 명\n", total);
}