package chuoi_string;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BaiTapTongHop2 {

    public static void main(String[] args) {

        /* Bài 1: Character duplicate
        Tìm và in ra các ký tự xuất hiện nhiều hơn một lần trong String cho trước không phân biệt chữ hoa hay chữ thường.
        */

        String text = "Bắt phó trưởng phòng Báo Điện Biên Phủ cưỡng đoạt tiền doanh nghiệp";
        text = text.toLowerCase(Locale.ROOT);
        findRepeatedChars(text);
        findRepeatedChars2(text);

        /* Bài 2: Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
         Nếu có xuất ra “OK” ngược lại “KO”. Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
        */

        String str1 = "word";
        String str2 = "drow";

        boolean result = isReverse(str1, str2);
        if (result == true) {
            System.out.println("chuỗi :" + str1 + " là chuỗi đảo ngược của chuỗi " + str2);
            System.out.println("OK");
        }else {
            System.out.println("chuỗi :" + str1 + " không phải là chuỗi đảo ngược của chuỗi " + str2);
            System.out.println("KO");
        }


    }

    // cách 1 sử dụng Map
    public static void findRepeatedChars(String str) {
        // Tạo một Map để đếm số lần xuất hiện của mỗi ký tự
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Vòng lặp để duyệt từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Nếu ký tự đã có trong Map, tăng số lần xuất hiện lên 1
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            }
            // Nếu ký tự chưa có trong Map, thêm vào với số lần xuất hiện ban đầu bằng 1
            else {
                charCountMap.put(c, 1);
            }
        }

        // Lặp lại Map để hiển thị các ký tự lặp lại
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println("'" + c + "' là lặp lại " + count + " lần.");
            }
        }
    }

    // cách 2 sử dụng vòng lặp
    public static void findRepeatedChars2(String str) {
        // Chuyển đổi chuỗi thành mảng ký tự
        char[] chars = str.toCharArray();

        // Vòng lặp để lặp lại các ký tự của chuỗi
        for (int i = 0; i < chars.length; i++) {
            // Biến dem để đếm số ký tự lặp lại
            int count = 0;

            // Vòng lặp để so sánh ký tự hiện tại với các ký tự khác trong chuỗi
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }
            }

            // Nếu số ký tự lặp lại lớn hơn 0, hiển thị ký tự và số lần lặp lại
            if (count > 0) {
                System.out.println("'" + chars[i] + "' is repeated " + (count + 1) + " times.");
            }
        }
    }


    public static boolean isReverse(String str1, String str2) {

        // yêu cầu 2 chuỗi cho phải bằng nhau
        if (str1.length() != str2.length()) {
            System.out.println("2 chuỗi cung cấp phải có chiều dài bằng nhau");
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }


}
