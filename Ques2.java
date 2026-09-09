package Java_OOPS_Program;

class OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("Total odd numbers = " + count);
        System.out.println("Sum of odd numbers = " + sum);
    }
}
