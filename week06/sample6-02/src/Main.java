//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /*UNFINISHED CODE BC IM TIRED
    I didnt paid attention n i lost the point and i have no energy to think jaja*/

    Scanner keyboard = new Scanner(System.in);

    float weight;
    final int GOLD = 775000;
    final float DON = 3.75f;

    System.out.print("당신의 몸무게는? ");
    weight = keyboard.nextFloat();

    float gram = weight * 1000;
   double donofweight = gram / DON;
   double money = Math.round(donofweight * GOLD);


    System.out.printf("%.1f Kg = %,.2f gram%n", weight, gram);
    System.out.printf("%.1f Kg = %,.2f 돈%n", weight, donofweight);
    System.out.printf("%.1f Kg = %,d 원 (금 1돈 가격 = %,d원)%n",
            weight, money, GOLD);
}
