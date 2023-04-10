import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        SinglyLinkedList prime = new SinglyLinkedList();
        SinglyLinkedList primeThree = new SinglyLinkedList();

        for (int i = 0; i <= n; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                prime.append(new Node(i));

                boolean hasThree = false;
                int temp = i;
                while (temp > 0) {
                    if (temp % 10 == 3) {
                        hasThree = true;
                        break;
                    }
                    temp /= 10;
                }

                if (hasThree) {
                    primeThree.append(new Node(i));
                }
            }
        }

        int sum = primeThree.sumList();


        System.out.println("Sum of primes from 0-" + n + ": " + sum);
    }
}
