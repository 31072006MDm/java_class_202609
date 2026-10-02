//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int height;
    float area;

    System.out.print("introduce medida");
    base = keyboard.nextInt();
    System.out.print("altura medida");
    height = keyboard.nextInt();

    area = base*height / 2.0f;

    System.out.printf("***** las medidas son*****\n");
    System.out.printf("\t medida base: %d CM\n",base);
    System.out.printf("\t medida altura: %d CM\n", height);
    System.out.printf("\n\t anchura: %.2f cm al cuadrado\n", area);


}


