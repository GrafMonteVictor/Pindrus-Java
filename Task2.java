import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("������� ���");
        try(Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            if (s.equals("��������")) {
                System.out.println("������, ��������");
            } else {
                System.out.println("��� ������ �����");
            }
        }
    }
}
