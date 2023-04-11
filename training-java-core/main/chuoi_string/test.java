package chuoi_string;

public class test {

    public static void main(String[] args) {
        String pattern = "^\\d+$";
        String input = "123456";
        String input2 = "masd@1234";

        if (input.matches(pattern)) {
            System.out.println("input match pattern");
        }

        if (input2.matches(pattern)) {
            System.out.println("input2 match pattern");
        }
    }
}
