package servicies;

public class Matriz {
    public static void maiorMenor(int[][] matriz) {
        int maior = matriz[0][0], menor = matriz[0][0];
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j< matriz[i].length; j++) {
                if(maior < matriz[i][j]) {
                    maior = matriz[i][j];
                }
                if(menor > matriz[i][j]) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Maior: " + maior + " Menor: " + menor);
    }

    public static void diagonais(int[][] matriz) {
        int diagonalP = 0, diagonalS =0;
        for(int i=0; i<matriz.length; i++) {
            diagonalP += matriz[i][i];
            diagonalS += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Diagonal Principal: " + diagonalP);
        System.out.println("Diagonal Secundária: " + diagonalS);
    }
}
