package OpgaverRekursion1;

public class Opgave1 {


    //opgave 1
    public static int factorial(int n) {
        int resultat = 0;
        if (n <= 1) {
            resultat = n;
        } else {
            resultat = n * factorial(n - 1);
        }
        return resultat;
    }

    //Opgave 2
    public static int power(int n, int p) {
        int result = 0;
        if (p == 1) {
            result = 1;
        } else {
            result = power(n, p - 1) * n;
        }
        return result;
    }

    //Opgave 3 - Måske ikke 100% menneskeskabt.
    public static int product(int a, int b) {
        if (a == 0) {
            return 0;
        } else {
            return product(a - 1, b) + b;
        }
    }

    public static int productRus(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a % 2 == 1) { // Hvis a er ulige
            return productRus(a - 1, b) + b;
        } else { // Hvis a er lige
            return productRus(a / 2, b * 2);
        }
    }

    //Opgave 4 - omvend bogstavsrækkefølgen
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char last = s.charAt(s.length() - 1);
        String remainingWord = s.substring(0, s.length() - 1);
        return last + reverse(remainingWord);
    }

    //Opgave 5 - Euclids algoritme
    public static int SFD(int a, int b) {
        if (b <= a && (a % b == 0)) {
            return b;
        }
        if (a < b) {
            return SFD(b, a);
        }
        return SFD(b, a%b);
    }

    public static int domino(int n){
if(n <= 0){
    return 0;
}if(n == 1){
    return 1;
        }else{
    return domino(n-2) + domino(n-1);
        }
    }
}
