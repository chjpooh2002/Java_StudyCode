import java.util.Scanner;

public class ch2_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("[필수 정보 입력]");
        System.out.println("1. 이름: ");
        String name = a.nextLine();
        System.out.println(name);
        System.out.println("2. 주민번호 앞 6자리: ");
        String number = a.nextLine();
        System.out.println(number);
        System.out.println("3. 전화번호: ");
        String phonenumber = a.nextLine();
        System.out.println(phonenumber);
    }
}
