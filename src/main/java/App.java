import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is code Caesar cipher");

        for( ;; ){
            System.out.println("choice\n 1.Encrypt\n 2.Decrypt\n 3.Exit");
            int choice = scanner.nextInt();
            Caesar caesar =new Caesar();
            if(choice == 1){
                System.out.println("Enter a word or sentence to Encrypt:");
                String message = new String();
                message = scanner.next();
                System.out.println("Enter Key");
                int shift = scanner.nextInt();
                System.out.println(caesar.encrypt(message, shift));
            }else if (choice == 2){
                System.out.println("Enter a word or sentence to Decrypt:");
                String message = new String();
                message = scanner.next();
                System.out.println("Enter Key");
                int shift = scanner.nextInt();
                System.out.println(caesar.decrypt(message, shift));
            }else if (choice == 3) {
                System.exit(0);
            }else {
                System.out.println("Invalid choice");
            }
        }
    }
}
