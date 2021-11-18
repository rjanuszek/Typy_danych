public class Operatory {
    public static void main(String[] args)
    {
//        -> operatory matematyczne
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        double a = 10;
        double b = 4;
        System.out.println(a / b);

//       -> operatory porównia
        int numOne = 1;
        int numTwo = 2;

        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

//        -> operatory logiczne lub/ i
//        || lub
        System.out.println(numOne > numTwo || numOne == 1); // fałsz || prawda = prawda
        System.out.println(numOne == numTwo || numOne != 1); // fałsz || fałsz = fałsz
        System.out.println(numOne < numTwo || numOne != 1); // prawda || brak sprawdzenia = prawda
//        && i
        System.out.println(numOne < numTwo && numOne == 1); // prawda && prawda = prawda
        System.out.println(numOne > numTwo && numOne == 1); // fałsz && prawda = fałsz
        System.out.println(numOne > numTwo && numOne != 1); // fałsz && fałsz = fałsz
    }
}
