package arrays2;
public class Array2Dim {
    // Todimensjonale arrays = arrays inne i arrays
    public static void main(String[] args) {
        int[][] tabell = new int[4][4];
        tabell[0][0] = 23;
        tabell[1][0] = 24;
        tabell[2][3] = 45;
        for (int i=0; i<tabell.length;i++){
            for(int j=0; j<tabell[i].length;j++) {
                System.out.print(tabell[i][j] +"");
            }
        }
        System.out.println();
        for (int[] liste : tabell) {
            for(int tall:liste) {
                System.out.print(tall+"");
            }
        }
    }

}
