import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 100; i++){
        int input = scanner.nextInt();
            if (input == 0){
                if (sum >= 1000){
                    System.out.println(sum -1000);
                    break;
                }
                System.out.println(sum);
                break;

            }
            else if (sum >= 1000){
                System.out.println(sum - 1000);
                break;
            }
            else {
                sum += input;
            }
        }
    }
}
