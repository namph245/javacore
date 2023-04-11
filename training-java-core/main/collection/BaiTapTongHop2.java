package collection;

import collection.student.Student;

import java.util.*;

public class BaiTapTongHop2 {

    public static void main(String[] args) {

        // B1: Viết chương trình tạo một danh sách (List) các số nguyên từ 1 đến 10, sau đó sử dụng Iterator để in giá trị của danh sách.
        List<Integer> listNumber = new ArrayList<>();
        for (int i=0; i<= 10; i++){
            listNumber.add(i);
        }

        useIterator(listNumber);

        // B2: Viết chương trình tìm kiếm trong một danh sách (List) các chuỗi và trả về các phần tử chứa từ khóa tìm kiếm
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("PineApple");
        fruit.add("Kiwi");
        fruit.add("WaterMelon");
        fruit.add("okla");

        List<String> listKeyword = new ArrayList<>();
        listKeyword.add("Apple");
        listKeyword.add("Kiwi");
        searchKeyWord(fruit, listKeyword);

        // B3: Viết chương trình tạo ra một Map lưu trữ thông tin của một số học sinh (mã học sinh, tên học sinh, điểm trung bình),
        // sau đó in ra thông tin của toàn bộ học sinh trong Map.

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("HS001", "Nguyen Van A", 8.5));
        studentMap.put(2, new Student("HS002", "Tran Thi B", 7));
        studentMap.put(3, new Student("HS003", "Le Van C", 9));
        showStudent(studentMap);

        // B4:  Viết chương trình nhập vào một danh sách (List) các số nguyên và tìm phần tử lớn nhất tại vị trí chẵn trong danh sách.
        List<Integer> listNumber2 = new ArrayList<>();
        listNumber2.add(33);
        listNumber2.add(55);
        listNumber2.add(77);
        listNumber2.add(100);
        listNumber2.add(200);
        listNumber2.add(300);
        timSoChanLe(listNumber2);

        // B5: Viết chương trình tạo ra một Set lưu trữ các tên bài hát, sau đó hỏi người dùng tên bài hát muốn xóa và xóa bài hát đó khỏi Set
        Set<String> set = new HashSet<String>();
        // Thêm các phần tử vào Set
        set.add("John");
        set.add("Mary");
        set.add("Tom");
        set.add("Mary"); // Set không cho phép lưu trữ các phần tử trùng
        listSetBaiHat(set, "John");
    }

    public static void useIterator(List<Integer> listNumber) {

        Iterator<Integer> iterator = listNumber.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void searchKeyWord(List<String> list, List<String> listKeyword) {

        List<String> result = new ArrayList<>();
        for (int i=0; i<listKeyword.size(); i++) {
            for(String str : list) {
                if (str.contains(listKeyword.get(i))) {
                    result.add(str);
                }
            }
        }
        // in kết quả tìm kiếm được
        System.out.println("kết quả tìm kiếm được");
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void showStudent(Map<Integer, Student> mapStudent) {

        for (Map.Entry<Integer, Student> entry : mapStudent.entrySet()) {
            System.out.println("Thong tin hoc sinh " + entry.getKey() + ":");
            System.out.println("Ma hoc sinh: " + entry.getValue().getMaHocSinh());
            System.out.println("Ten hoc sinh: " + entry.getValue().getTenHocSinh());
            System.out.println("Diem trung binh: " + entry.getValue().getDiemTrungBinh());
            System.out.println();
        }
    }

    public static void timSoChanLe(List<Integer> list) {

        List<Integer> listSoChan = new ArrayList<>();
        List<Integer> listSoLe = new ArrayList<>();
        int totalSoChan = 0;
        int totalSoLe = 0;

        for (Integer i : list) {
            if (i % 2 == 0) {
                listSoChan.add(i);
                totalSoChan ++;

            }else{
                listSoLe.add(i);
                totalSoLe++;
            }
        }

        System.out.println("tổng số chẵn tìm được là : " + totalSoChan);
        for (Integer i : listSoChan) {
            System.out.println(i);
        }

        System.out.println("tổng số lẻ tìm được là : " + totalSoLe);
        for (Integer i : listSoLe) {
            System.out.println(i);
        }
    }

    public static void listSetBaiHat(Set<String> list, String nameOfElement) {
        list.remove(nameOfElement);

        System.out.println("list bài hát sau khi remove là : ");
        for (String nameSong : list) {
            System.out.println(nameSong);
        }
    }
}
