public class Strings {
    public static void main(Strings[] args) {
        String str = "     Tran    Dat     ";
        str = str.trim();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 160) {

            }
        }
    }

    private static String removeRedundantSpace(String str) {
        if (str == null || str.trim() == " ") {
            return null;
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                result += c;
                continue;
            }

        }
    }

}
