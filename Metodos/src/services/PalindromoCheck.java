package services;

public class PalindromoCheck {
    public static boolean verificarPalindromo(String palavra) {
        String palavraLimpa = palavra.replaceAll("\\s+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(palavraLimpa);
        String palavraReverso = sb.reverse().toString();
        return palavraLimpa.equals(palavraReverso);
    }
}
