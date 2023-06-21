public class main04 {
    public static void main(String[] args) {
        String str = "221432485";
        String str1 = "B14DCCN340";
        String str2 = "N14LTVT340";
        String regex = "^(B|N)\\d{2}(DC||CC||LT)(CN|MR|VT|DT|AT)\\d{3}";

        System.out.println(str.matches(regex));
    }


}
