//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a = 5;
    int b = 2;
    double c = a/b; //2.5 (2.0) //overflow
    double d = (float) a/b; //double or float

    System.out.printf("a = %d, b = %d, c= %.2f, d= %.2f", a,b ,c, d);

}
