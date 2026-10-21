//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final double RADIUS = 6378137.0;
    final double PI = 3.141592;

    final double KOREA_AREA = 99720 * 1000000.0;
    final double PARAGUAY_AREA = 406752 * 1000000.0;

    double surface;
    double korea;
    double paraguay;

    System.out.println("지구의 표면적을 구해보자");

    surface = 4 * PI * RADIUS * RADIUS;

    korea = (KOREA_AREA / surface) * 100;
    paraguay = (PARAGUAY_AREA / surface) * 100;

    System.out.printf("지구의 표면적 : %,.2f m²%n", surface);
    System.out.printf("한국의 면적 : %,.2f m²%n", KOREA_AREA);
    System.out.printf("지구의 표면적 중 대한민국은 %.6f%%를 차지하고 있다.%n",
            korea);

    System.out.printf("파라과이의 면적 : %,.2f m²%n", PARAGUAY_AREA);
    System.out.printf("지구의 표면적 중 파라과이는 %.6f%%를 차지하고 있다.%n",
            paraguay);
}
