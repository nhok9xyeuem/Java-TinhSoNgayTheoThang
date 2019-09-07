import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int thang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap vao thang :");
        thang = scanner.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("thang " + thang + "co 30 ngay");
                break;
            case 2:
                System.out.println("thang" + thang + "co 28 ngay");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("thang" + thang + "co 31 ngay");
                break;
            default:
                System.out.println(" thang ban  nhap khong dung");
        }

    }
}
