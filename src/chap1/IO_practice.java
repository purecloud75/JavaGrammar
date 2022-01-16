package chap1;

import java.util.Scanner;

public class IO_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String tel1 = scanner.nextLine();
        String tel2 = scanner.nextLine();
        String tel3 = scanner.nextLine();

        System.out.println(name);
        System.out.print(age + "\n");
        System.out.printf("%s-%s-%s", tel1, tel2, tel3);
    }
}
