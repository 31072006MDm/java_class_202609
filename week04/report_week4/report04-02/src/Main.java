//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("직육면체 가로 세로 높이 입력 : ");
    int width = sc.nextInt();   // 가로 (ancho)
    int length = sc.nextInt();  // 세로 (largo)
    int height = sc.nextInt();  // 높이 (alto)

    int vol = width * length * height;

    System.out.println("직육면체 가로 = " + width + " Cm");
    System.out.println("직육면체 세로 = " + length + " Cm");
    System.out.println("직육면체 높이 = " + height + " Cm");
    System.out.println("직육면체 부피 = " + vol + " Cm");
    sc.close();


}
