public class Yildizlar {
    public static void main(String[] args) {
            String[][] stars = new String[7][4];

            for (int i = 0; i<stars.length; i++){
                for (int j = 0; j<stars[i].length; j++){
                    if(i == 0 || i == 3|| i == 6){
                        stars[i][j] = " * ";
                    } else if (j == 0 || j ==3) {
                        stars[i][j] = " * ";
                    }else {
                        stars[i][j] = "   ";
                    }
                }
            }
            for (String[] star : stars){
                for (String str : star){
                    System.out.print(str);
                }
                System.out.println();
            }
    }
}
