public class Reduce {
    public static void main(String[] args) {
        int n = 100;

        int steps = doReduce(n);

        System.out.println(steps);

    }

    public static int doReduce(int n) {
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps ++;
        }
        return steps;
    }
}


