//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    final int ID = 0;
    final int NAME = 1;
    final int BASE = 0;
    final int OVERTIME = 1;
    final int SALARY = 2;
    final int TAX = 3;
    final int NET = 4;
    final float CREDIT = 15.0f / 100; // 세금 공제 비율

    String[][] employee = {
            {"1234", "홍길동"}, {"1278", "이순신"},
            {"1356", "임정섭"}, {"1489", "경복대"},
            {"1590", "현수막"}, {"1690", "추석선물"},
            {"1795", "전정운"}, {"1889", "하이승"},
            {"1921", "한아름"}, {"2045", "이난나"}
    };

    char[] grade = {'1', '3', '2', '5', '4', '3', '5', '1', '3', '2'};

    int[][] salary = {
            {0, 1000000, 0, 0, 0},
            {0, 900000, 0, 0, 0},
            {0, 805500, 0, 0, 0},
            {0, 800000, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1000000, 0, 0, 0},
            {0, 900000, 0, 0, 0},
            {0, 865400, 0, 0, 0},
            {0, 806000, 0, 0, 0},
            {0, 956000, 0, 0, 0}
    };

    // int[][] salary = new int[employee.length][5];

    int[] base = {1650000, 1680000, 1700000, 1720000, 1750000};
    int[] taxRate = {1600000, 2300000};

    for (int i = 0; i < employee.length; i++) {
        if (grade[i] == '1') salary[i][BASE] = base[1];
        else if (grade[i] == '2') salary[i][BASE] = base[2];
        else if (grade[i] == '3') salary[i][BASE] = base[3];
        else if (grade[i] == '4') salary[i][BASE] = base[4];
        else if (grade[i] == '5') salary[i][BASE] = base[5];
    }

    for (int i = 0; i < employee.length; i++)
        salary[i][SALARY] = salary[i][BASE] + salary[i][OVERTIME];

    for (int i = 0; i < employee.length; i++) {
        int temp = salary[i][SALARY] - (int) (salary[i][SALARY] * CREDIT);

        if (temp < taxRate[0])
            salary[i][TAX] = (int) (temp * 3.3f / 100);
        else if (temp < taxRate[1])
            salary[i][TAX] = (int) (temp * 7.5f / 100);
        else
            salary[i][TAX] = (int) (temp * 10.2f / 100);

        salary[i][TAX] = salary[i][TAX] / 100 * 100;
        salary[i][NET] = salary[i][SALARY] - salary[i][TAX];
    }

    for (int i = 0; i < employee.length - 1; i++) {
        for (int j = i + 1; j < employee.length; j++) {
            if (salary[i][NET] < salary[j][NET]) {
                String[] temp = employee[i];
                employee[i] = employee[j];
                employee[j] = temp;

                char ch = grade[i];
                grade[i] = grade[j];
                grade[j] = ch;

                int[] money = salary[i];
                salary[i] = salary[j];
                salary[j] = money;
            }
        }
    }

    System.out.println("\n\t\t\t급여 계산");
    System.out.println("************************************************************");
    System.out.println(" 이 름    사번    호봉    기본급    초과근무    급여    세금    지급액");
    System.out.println("************************************************************");

    for (int i = 0; i < employee.length; i++) {
        System.out.printf("%5s %5s %3s %9d %9d %10d %8d %10d\n",
                employee[i][NAME], employee[i][ID], grade[i],
                salary[i][BASE], salary[i][OVERTIME],
                salary[i][SALARY], salary[i][TAX], salary[i][NET]);
    }

    System.out.println("************************************************************");
}