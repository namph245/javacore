package array;

import java.util.Arrays;

public class BaiTapTongHop {

    public static void main(String[] args) {
        /*
        Viết chương trình cung cấp một mảng số nguyên có n phần tử và thực hiện các công việc sau:
        - hiển thị giá trị các phần tử của mảng.
        - Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
        - Đếm số phần tử là số chẵn.
        - Sắp xếp mảng tăng dần.
    */
        int soNguyen[] = {32, 2, 0, 4, 98};

        // Xuất giá trị các phần tử của mảng
        System.out.println("\n Mảng ban đầu");
        for (int i =0; i< soNguyen.length; i++) {
            System.out.println(soNguyen[i] + "\t");

        }

        // Tìm phần tử có giá trị lớn nhất, nhỏ nhất
        int max = soNguyen[0]; // khởi tạo phần tử lớn nhất là phần tử đầu tiên
        int min = soNguyen[0]; // khởi tạo phần tử bé nhất là phần tử đầu tiên

        for (int i=0; i< soNguyen.length; i++){
            if (soNguyen[i] < min) {
                min = soNguyen[i];
            }

            if (soNguyen[i] > max) {
                max = soNguyen[i];
            }
        }

        System.out.println("số lớn nhất trong mảng là : " + max);
        System.out.println("Số nhỏ nhất trong mảng là : " + min);

        // Đếm số phần tử là số chẵn
        int soPhanTuChan = 0;
        for (int i=0; i<soNguyen.length; i++) {
            if (soNguyen[i] % 2 == 0) {
                soPhanTuChan++;
            }
        }

        System.out.println("Số phần tử chẵn trong mảng là : " + soPhanTuChan);

        // sắp xếp mảng tăng dần
        Arrays.sort(soNguyen);

        System.out.println("mảng sau khi sắp xếp");
        for (int i=0; i<soNguyen.length; i++){
            System.out.println(soNguyen[i] + "\t");
        }
    }



}
