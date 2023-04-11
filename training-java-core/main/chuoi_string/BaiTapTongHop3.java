package chuoi_string;

public class BaiTapTongHop3 {

    public static void main(String[] args) {

        /* Bài 1: Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
              - sử dụng regex
              - Hoặc có thể loop và kiểm tra từng ký tự trong chuỗi.
        */

        String str = "abc123xyz";
        checkIsNumber(str);

        /* Bài 2: Chuyển chuỗi số nguyên sang int value. Ví dụ “5646” thành int = 5646.
         */
        String strNumber = "1234";
        convertStringToInt(strNumber);

        /* Bài 3: Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
         Ví dụ “shareprogramming.net” chuyển ‘e’ sang ‘*’ kết qủa “shar*programming.n*t”.
         */
        String replaceChar = "shareprogramming.net";
        replaceString(replaceChar);

    }

    public static boolean checkIsNumber(String str) {

        String pattern = ".*\\d+.*";
        if (str.matches(pattern)){
            System.out.println("Chuỗi " + str +  " có chứa số ");
            return true;
        }else {
            System.out.println("Chuỗi không chứa số ");
            return false;
        }

    }

    public static int convertStringToInt(String text) {
         int num = Integer.parseInt(text);
        System.out.println("convert text to number " + num);
         return num;
    }

    public static String replaceString(String text) {
        String newStrReplace = text.replace("e", "*");
        System.out.println("chuỗi sau khi replace là " + newStrReplace);
        return newStrReplace;
    }
}
