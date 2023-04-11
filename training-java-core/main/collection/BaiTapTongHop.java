package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class BaiTapTongHop {

    public static void main(String[] args) {
        // B1: Viết chương trình sắp xếp một ArrayList các chuỗi theo thứ tự bảng chữ cái.
        ArrayList<String> listName = new ArrayList<>();
        listName.add("namph");
        listName.add("duydoanh");
        listName.add("haipv");
        listName.add("okla");
        sortArrayList(listName);

        // B2: Viết chương trình loại bỏ các phần tử trùng lặp trong một ArrayList.
        ArrayList<String> listNameDuplicate = new ArrayList<>();
        listNameDuplicate.add("nguyễn");
        listNameDuplicate.add("nguyễn");
        listNameDuplicate.add("hải");
        listNameDuplicate.add("hải");
        listNameDuplicate.add("ok");
        listNameDuplicate.add("ok");
        deleteDuplicate(listNameDuplicate);

        // B3: Viết chương trình tính tổng các phần tử trong một ArrayList.
        ArrayList<Integer> listNumber = new ArrayList<>();
        listNumber.add(10);
        listNumber.add(50);
        listNumber.add(35);
        listNumber.add(25);
        listNumber.add(99);
        sumTotalElement(listNumber);

        // B4: Viết chương trình đảo ngược thứ tự các phần tử trong một ArrayList.
        ArrayList<String> listCar = new ArrayList<>();
        listCar.add("toyota");
        listCar.add("bmw-6");
        listCar.add("vin-fast");
        listCar.add("suzuki");
        reverse(listCar);

    }

    public static void sortArrayList(ArrayList list) {
        Collections.sort(list);
        System.out.println("list sau khi sắp xếp là :");
        for (Object name : list) {
            System.out.println(name);
        }
    }

    public static void deleteDuplicate(ArrayList<String> list) {
        HashSet<String> uniqueNames = new HashSet<>(list);
        ArrayList<String> nonDuplicateNames = new ArrayList<>(uniqueNames);
        System.out.println("list sau khi xóa các phần tử trùng lặp là :");
        for (String name : nonDuplicateNames) {
            System.out.println(name);
        }
    }

    public static void sumTotalElement(ArrayList<Integer> list) {
        int sum = 0;

        for (int i=0; i<list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("tổng của các phần tử là : " + sum);
    }

    public static void reverse(ArrayList<String> list) {
        Collections.reverse(list);
        System.out.println("list sau khi bị đảo ngược là :");
        for (String name : list) {
            System.out.println(name);
        }
    }


}
