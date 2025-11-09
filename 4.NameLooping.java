public class NameLooping {
    public static void main(String[] args) {
        String name = "NUGRAHA";
        name = name.toUpperCase();

        for (int i = 1; i <= name.length(); i++) {
            System.out.println(name.substring(0, i));
        }
    }
}