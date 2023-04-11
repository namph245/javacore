package bien_va_hangso;

public class main {

    // 1. Biến (Variable) trong Java.
    // Giữa biến và kiểu dữ liệu có một mối liên hệ mật thiết với nhau, một kiểu dữ liệu phải có một biến để lưu trữ nó.
    //? Trong Java có 3 loại biến thường gặp đó là: Local variable (biến cục bộ), Instance variable (thuộc tính) và Static variable (biến tĩnh).

    int age; // Khai báo biến kiểu int.
    String name = "Freetuts";   // Khai báo biến kiểu String và có khởi tạo giá trị

    // 2. Local variable (biến cục bộ).
    //? Là biến được khai báo bên trong thân hàm, trong hàm tạo hoặc bên trong các khối lệnh và chỉ có phạm vi trong nội bộ
    public void LocalVariable() {
        int age;
        String name = "Freetuts";
    }

    // 3. Hằng số (Constant)
    //? Trong đời sống hằng ngày, có những giá trị không bao giờ thay đổi chẳng hạn như: Một ngày có 24 giờ, một năm có 12 tháng
    public static final int HOUR_OF_DAY = 24;
    public static final String CHUOI = "Hello Freetuts!";

    public static void main(String[] args) {
        System.out.println("Một ngày có " + HOUR_OF_DAY + " giờ");
        System.out.println(CHUOI);
    }
}
