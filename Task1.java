import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("������� �����");
        try (Scanner sc = new Scanner(System.in);
        ) {
            String s = sc.nextLine();
            if(Integer.parseInt(s)>7) {
                System.out.println("������");
            }

        }
        catch (Exception e) {
            System.out.println("��� �� �����");
            e.printStackTrace();
        }
    }
}