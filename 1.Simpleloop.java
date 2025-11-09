public class Simpleloop {
    public static void main(String[] args) throws Exception {
        int diff1 = 4;
        int result = 6;
        
        System.out.print("\n"+result + " ");
        for (int diff2 = 1; diff2<9; diff2++) {
            result += Math.pow(-1, diff2) * diff1;
            System.out.print(result + " ");
            diff1++;
        }
    }
}