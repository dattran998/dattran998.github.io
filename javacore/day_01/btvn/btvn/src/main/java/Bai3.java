public class Bai3 {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4};
        int max = 0;

        for(int i = 0; i < 4; i++) {
            if(a[i] > max)
                max = a[i];
        }

        System.out.println("Số lớn nhất trong 4 số là: " + max);
    }
}
