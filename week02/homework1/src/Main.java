//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    double height;
    float weight;

    System.out.print("Whats your name");
    name = keyboard.nextLine();
    System.out.printf("%s, Whats your age", name);
    age = keyboard.nextInt();
    System.out.printf("%s, Whats your height",name);
    height = keyboard.nextDouble();
    System.out.printf("%s, Whats your weight",name);
    weight = keyboard.nextFloat();
    System.out.printf("%s age is %d\n",name,age);
    System.out.printf("%s height is %.1f Cm\n",name,height);
    System.out.printf("%s weight is %.1f kg\n",name,weight);



    }

