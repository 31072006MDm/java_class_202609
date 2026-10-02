//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    long a = 3000000000L; //30m
    long b = 4000000000L;
    long c = a * b;

    System.out.printf("a = %,d, b= %,d, c= %,d\n", a ,b,c);

    BigInteger a1 = BigInteger.valueOf(a);
    BigInteger b1= BigInteger.valueOf(b);
    BigInteger c1 = BigInteger.valueOf(c);

    System.out.printf("a = %,d, b= %,d, c= %,d\n", a1 ,b1,c1);
}
