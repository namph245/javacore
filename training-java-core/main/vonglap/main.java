package vonglap;

public class main {


    public static void main(String[] args) {
        int i = 0;

        /* Vòng lặp while

            trong khi i < 5 thì tiếp tục tăng giá trị của biến i;
        */
        while(i < 5) {
            System.out.println("giá trị của i là: " + i);
            i++;
        }

        /* Vòng lặp do while

            trong khi sum < 100 thì tiếp tục + sum với 10;
        */

        int sum = 0;

        do {
            sum+=10;
        } while(sum < 100);

        System.out.println("sum = " + sum); // 100;

        /* Từ khóa break
            - từ khóa break được dùng để thoát ra khỏi vòng lặp chứa nó ngay lập tức
            - Thông thường, từ khóa break thường được dùng với một lệnh if bên trong vòng lặp để kiểm tra điều kiện dừng của vòng lặp.
        */

        for(int y = 0; y < 5; y++) {

            if (y == 3) {
                System.out.println("nếu y = " + y + " thì dừng vòng lặp ngay lập tức");
                break;
            }
        }

        /* Từ khóa continue
            - Từ khóa continue được sử dụng để nhảy qua việc thực thi các câu lệnh trong vòng lặp hiện tại và chuyển đến vòng lặp tiếp theo.
            - Khi sử dụng continue, các câu lệnh bên dưới nó sẽ không được thực hiện và tiếp tục với vòng lặp tiếp theo.
        */

        // in ra các số lẻ từ 1 đến 10
        for(int z = 0; z <= 10; z++) {
            if (z % 2 == 0) {
                continue; // bỏ qua các số chẵn
            }
            System.out.println(z); // 1, 3, 5, 7, 9
        }
    }

}
