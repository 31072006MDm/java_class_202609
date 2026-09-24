//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    double celsius = scanner.nextDouble();
    double fahrenheit = celsius * 9 / 5 + 32;
    System.out.println(fahrenheit);
    scanner.close();
}
