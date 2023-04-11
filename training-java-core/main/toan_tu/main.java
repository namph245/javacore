package toan_tu;

import java.util.Scanner;

public class main {

    // 1. Các toán tử cơ bản (Basic Operators)
    /* Toán tử gán
        =	Gán giá trị từ các toán hạng bên phải cho toán hạng bên trái => a = 1 sẽ gán giá trị 1 cho a.
        +=	Cộng hoặc nối chuỗi toán hạng bên phải vào toán hạng bên trái và gán lại kết quả cho toán hạng bên trái => a += 1 (tương đương với a = a + 1).
        -=	Trừ toán hạng bên phải khỏi toán hạng trái và gán lại kết quả cho toán hạng bên trái. => a -=1 (tương đương với a = a - 1).
        *=	Nhân toán hạng bên phải với toán hạng bên trái và gán lại kết quả cho toán hạng bên trái => a *= 2 (tương đương với a = a * 2).
        /=	Chia toán hạng bên phải cho toán hạng bên trái và gán lại kết quả cho toán hạng bên trái => a /= 2 (tương đương với a = a / 2).
        %=	Chia toán hạng bên phải cho toán hạng bên trái và lấy phần dư gán cho toán hạng bên trái => a %= 2 (tương đương với a = a % 2).
    */

    /* Toán tử số học.
        + Toán tử cộng.
        - 	Toán tử trừ.
        * Toán tử nhân.
        /	Toán tử chia.
        %	Toán tử chia lấy phần dư.
    */

    /* Toán tử 1 ngôi.
       +	Chỉ định giá trị không âm.
       -	Chỉ định giá trị âm.
       ++	Tăng giá trị của toán hạng đó lên 1 đơn vị.
       --	Giảm giá trị của toán hạng đó đi 1 đơn vị.
       !	Phép toán phủ định trên một giá trị luận lý. Nếu một điều kiện đang nhận giá trị là true thì toán tử này sẽ thay đổi giá trị đó thành false và ngược lại.
    */

    public static void main(String[] args) {

        // Đối với toán tử ++ và -- thì trong Java có 2 loại đó là Prefix (tiền tố) và Postfix (hậu tố).
        // Đối với Postfix thì toán tử ++ hoặc -- sẽ nằm đằng sau toán hạng đó. Ví dụ: a++ hoặc a--.
        // Đối với Prefix thì toán tử ++ hoặc -- sẽ đứng đằng trước toán hạng đó. Ví dụ: ++a hoặc --a.

        int a = 5, b = 10;
        int result = a++ + ++b -1;
        System.out.println("a = " + a); //6
        System.out.println("b = " + b); // 11
        System.out.println("result = " + result); // 15

        /*
            Dựa theo các bước trên, chúng ta giải bài toán trên như sau:
            Bước 1: Xử lý Prefix trước: ++b = 10 + 1 = 11;
            Bước 2: Xử lý các phép toán còn lại: 5 + 11 - 1 = 15;
            Bước 3: Gán kết quả vừa có cho toán hạng bên trái: result = 15;
            Bước 4: Xử lý Postfix : a++ = 5 + 1 = 6;
        */

        /* Toán tử so sánh
            == (So sánh bằng): So sánh giá trị của toán hạng bên trái và toán hạng bên phải có bằng nhau hay không.
            Nếu có thì kết quả trả về true, ngược lại trả về false.

            != (So sánh không bằng): So sánh giá trị của toán hạng bên trái và toán hạng bên phải có không bằng nhau hay không.
            Nếu có thì kết quả trả về true, ngược lại trả về false.

            > (So sánh lớn hơn). So sánh giá trị của toán hạng bên trái có lớn hơn toán hạng bên phải hay không.
            Nếu có thì kết quả trả về true, ngược lại trả về false.

            >= (So sánh lớn hơn hoặc bằng) So sánh giá trị của toán hạng bên trái có lớn hơn hoặc bằng toán hạng bên phải hay không.
            Nếu có thì kết quả trả về true, ngược lại trả về false.

            < (So sánh nhỏ hơn) So sánh giá trị của toán hạng bên trái có nhỏ hơn toán hạng bên phải hay không.
            Nếu có thì kết quả trả về true, ngược lại trả về false.

            <= (So sánh nhỏ hơn hoặc bằng) So sánh giá trị của toán hạng bên trái có nhỏ hơn hoặc bằng toán hạng bên phải hay không.
            Nếu có thì kết quả trả về true, ngược lại trả về false.
        */

        int fist = 10, second = 15;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số thứ nhất: ");
//        fist = scanner.nextInt();
//        System.out.println("Nhập vào số thứ hai: ");
//        second = scanner.nextInt();

        System.out.println("Kết quả của so sánh == " + fist + " và " +
                second + " là: " + (fist == second));

        System.out.println("Kết quả của so sánh != " + fist + " và " +
                second + " là: " + (fist != second));

        System.out.println("Kết quả của so sánh > " + fist + " và " +
                second + " là: " + (fist > second));

        System.out.println("Kết quả của so sánh >= " + fist + " và " +
                second + " là: " + (fist >= second));

        System.out.println("Kết quả của so sánh < " + fist + " và " +
                second + " là: " + (fist < second));

        System.out.println("Kết quả của so sánh <= " + fist + " và " +
                second + " là: " + (fist <= second));


        /* Toán tử luận lý điều kiện.

            &&	Phép toán luận lý VÀ (AND) trên 2 giá trị, Kết quả trả về true khi cả hai đều đúng.
            ||	Phép toán luận lý HOẶC (OR) trên 2 giá trị. Kết quả trả về false khi cả hai đều sai.
            ?:	Toán tử điều kiện 3 ngôi.
        */

        int soA = 8, soB = 20;

        // toán tử AND
        System.out.println("Kết quả của (firstNumber < 10) && (secondNumber < 10) là " +
                ((soA < 10) && (soB < 10))); // false

        // toán tử OR
        System.out.println("Kết quả của (firstNumber < 10) || (secondNumber < 10) là " +
                ((soA < 10) || (soB < 10))); // true

        // toán tử 3 ngôi
        int c = soA > soB ? soA:soB; // nếu số A > số B thì gán c là số A ngược lại gán c là số B
        System.out.println("giá trị của c là: " + c);
    }



}
