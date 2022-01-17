public class ZadaniePierwsze {
    public static void main(String[] args) {
//// 1. 4 zmienne int
//// 2. Sprawdzić czy suma dwóch pierwszych jest parzysta
//// 3. Sprawdzić czy suma dwóch pierwszych jest parzysta
//// 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste
//
//        int numberOne = 2;
//        int numberTwo = 2;
//        int numberThree = 4;
//        int numberFour = 4;
//
//
//        if ((numberOne + numberTwo) % 2 == 0) {
//            System.out.println("Jest to liczba parzysta");
//        } else {
//            System.out.println("Nie jest to liczba parzytsa");
//        }
//
//        if ((numberThree + numberFour) % 2 == 0) {
//            System.out.println("Jest to liczba parzysta");
//        } else {
//            System.out.println("Nie jest to liczba parzytsa");
//        }
//
//        if ((numberOne + numberTwo) % 2 == 0 && (numberThree + numberFour) % 2 == 0) {
//            System.out.println("Wszystkie liczby są parzyste");
//        } else {
//            System.out.println("Nie wszytskie liczby są parzyste");
//        }

    // Rozwiązanie Bartka
        int a1 = 24587;
        int a2 = 4522;
        int a3 = 1212;
        int a4 = 1418;

        int sumA = a1 + a2;
        int sumB = a3 + a4;

        System.out.println(sumA);
        System.out.println(sumB);

        if (sumA % 2 == 0 && sumB % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Nie wszytskie liczby są parzyste");
        }
    }
}
