public class ChceckPalindrome {
    public static void main(String[] args) {
    String[] examples = {"katak", "Kodok", "Wkwkwkw", "Nugraha"};

        System.out.println("=== NOMOR 6 : CEK PALINDROME ===");
        for (String s : examples) {
            if (isPalindrome(s)) {
                System.out.println(s + " -> palindrome");
            } else {
                System.out.println(s + " -> not palindrome");
            }
        }
    }
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        int i = 0;
        int j = cleaned.length() - 1;

        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}