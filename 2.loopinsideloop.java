public class loopinsideloop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("A");
                } else {
                    System.out.print("B");
                }
            }
            System.out.println(); 
        }

        System.out.println();
        
        for (int i = 1; i <= 6; i++) { 
            for (int j = 1; j <= 6; j++) { 
                if (j <= i) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}