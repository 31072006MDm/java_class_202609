void main() {
    final int START = 1;
    final int TARGET = 200000000;
    int total = 0;
    int today = 1;

    for (int i = START; true; i *= 2) {
        total += i;

        System.out.printf("오늘 저축 금액  = %,11d 원,   %3d 일 = %,11d 원\n", i, today++, total);
        if (total >= TARGET)
            break;
    }
}