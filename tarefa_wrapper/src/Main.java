public class Main {
    public static void main(String[] args) {
        int num = 10;
        Integer numWrapper = num;
        System.out.println(numWrapper);
        // Ou:

        int num2 = 77;
        Integer numWrapper2 = Integer.valueOf(num2);
        System.out.println(numWrapper2);

    }



}