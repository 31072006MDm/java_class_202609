//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    System.out.print("What is your name?:");//prompt 문장
    name = keyboard.nextLine();
    System.out.printf("%s,What is your age?:", name);//prompt 문장
    age = keyboard.nextInt();

    System.out.printf("name: %s \n age: %d%n", name, age);

    }

