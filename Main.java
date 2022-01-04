import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhập vào tháng muốn kiểm tra: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+ month + " có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+ month + " có 30 ngày.");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 ngày nếu là năm thường, 29 ngày nếu là năm nhuận.");
                break;
            default:
                System.out.println("Số bạn nhập không phải là một tháng trong năm!");
        }
    }
}
