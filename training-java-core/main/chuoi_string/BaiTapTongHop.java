package chuoi_string;

public class BaiTapTongHop {

    public static void main(String[] args) {

        String text = "học java core";
        String text2 = "học frameWork";
        String text3 = "học frameWork";

        // Tính độ dài chuỗi
        System.out.println("độ dài của text là: " + text.length());

        // Nối 2 chuỗi ký tự
        System.out.println(text + " cùng namph");
        System.out.println(text.concat(" cùng namph"));

        // tìm ký tự trong chuỗi
        char character = text.charAt(4);
        System.out.println("tìm ký tự trong chuỗi theo chỉ mục index =  " + character); // j

        /* so sánh 2 chuỗi
            - hàm này so sánh chuỗi có giống nhau hay không,
            - không phải so sánh độ dài
        */
        int result;
        System.out.println("length of text = " + text.length()); // 13
        System.out.println("length of text2 = " + text2.length()); // 13
        result = text.compareTo(text2);
        System.out.println("result = " + result); // 4
        result = text2.compareTo(text3);
        System.out.println("result = " + result); // 0


        /* Tìm vị trí xuất hiện đầu tiên của một chuỗi khác trong chuỗi
            - nếu không tồn tại trả về (-1)
            - nếu tìm thấy thì trả về vị trí chuỗi tìm thấy
        */
        String chuoi = "học cùng teddy la la";
        String chuoi2 = "teddy";
        String chuoi3 = "ok";

        result = chuoi.indexOf(chuoi2);
        System.out.println("vị trí đầu tiên phát hiện ra chuỗi 2 là: " + result); // 9
        result = chuoi2.indexOf(chuoi3);
        System.out.println("vị trí đầu tiên phát hiện ra chuỗi 3 là : " + result); // -1

        /* replace
            - nếu oldchar không tồn tại thì không replace
        */
        String string1 = "happy new year";

        String newString = string1.replace("l", "r");
        System.out.println("newString : " + newString);

        String newString2 = string1.replace("h", "");
        System.out.println("newString2 : " + newString2);

        /* Trim
            - lưu ý là chỉ bỏ được space ở đầu và cuối
            - nếu xuất hiện các chuỗi ntn a y e n l thì sử dụng replace để bỏ space
        */

        String example = " wonder fully ";
        System.out.println("length of example before trim = " + example.length()); // 14
        example = example.trim();
        System.out.println("chuỗi example sau khi trim : " + example); // đã bỏ khoảng trắng ở đầu và cuối
        System.out.println("length of example after trim = " + example.length()); // 12

        /* SubString
            - tạo một chuỗi con từ vị trí index trong chuỗi cha
            - cú pháp .subString(int startIndex, int endIndex)
        */

        String origin = "Bí mật trong chiếc vali cựu PGĐ Công an Hà Nội đưa cho value = Hoàng Văn Hưng test đấy";
        String valueOf = "";
        if (origin.contains("value")) {

           int beginIndex = origin.indexOf("value");
            valueOf = origin.substring(beginIndex);
//           int endIndex = origin.indexOf("");
//           valueOf = origin.substring(index);
        }
        System.out.println("valueOf new char is " + valueOf);

    }
}
