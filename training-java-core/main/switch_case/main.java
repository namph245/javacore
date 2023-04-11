package switch_case;

public class main {

    // Khi chúng ta có số trường hợp cần xử lý lớn hơn 3 thì
    // chúng ta nên sử dụng switch - case để dễ dàng kiểm tra và xử lý, giúp cho chương trình dễ quan sát hơn.

    public static void main(String[] args) {

        /*
            Nếu:
            - Số nguyên là 0 thì thông báo "Số 0".
            - Số nguyên là 1, 2 thì thông báo "Số nhỏ".
            - Số nguyên là 3, 4, 5 thì thông báo "Số trung bình".
            - Số nguyên lớn hơn 5 thì thông báo "Số lớn".
        */

        int number = 6;

        switch (number) {
            case 0:
                System.out.println("Số 0");
                break;
            case 1:
                case 2:
                    System.out.println("Số nhỏ");
                    break;
            case 3:
            case 4:
            case 5:
                System.out.println("Số trung bình");
                break;
            default:
                System.out.println("Số lớn");
        }

        int thang = 1;
        String thangTuongUng = "";

        switch (thang) {
            case 1:
                thangTuongUng = "Tháng 1";
                break;
            case 2:
                thangTuongUng = "Tháng 2";
                break;
            case 3:
                thangTuongUng = "Tháng 3";
                break;
            case 4:
                thangTuongUng = "Tháng 4";
                break;
            case 5:
                thangTuongUng = "Tháng 5";
                break;
            case 6:
                thangTuongUng = "Tháng 6";
                break;
            case 7:
                thangTuongUng = "Tháng 7";
                break;
            case 8:
                thangTuongUng = "Tháng 8";
                break;
            case 9:
                thangTuongUng = "Tháng 9";
                break;
            case 10:
                thangTuongUng = "Tháng 10";
                break;
            case 11:
                thangTuongUng = "Tháng 11";
                break;
            case 12:
                thangTuongUng = "Tháng 12";
                break;
            default:
                System.out.println("Số nhập vào phải nằm trong khoảng từ 1 đến 12.");
        }
        System.out.println(thangTuongUng);

    }
}
