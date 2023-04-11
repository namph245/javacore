package file;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Json {

    public static void main(String[] args) {

        maHoaObjectJson();
        maHoaObjectJson2();
        maHoaObjectJson3();
        maHoaObjectJson4();

        String jsonStr = "{\"name\":\"Vinh\",\"salary\":1200.0,\"age\":27}";
        giaiMaJson(jsonStr);


    }

    // mã hóa object json
    public static void maHoaObjectJson() {
        JSONObject obj = new JSONObject();
        obj.put("name", "Vinh");
        obj.put("age", new Integer(27));
        obj.put("salary", new Double(1200));
        System.out.print("\n" + obj.toJSONString());
    }

    // Mã hóa JSON bằng đối tượng Map
    public static void maHoaObjectJson2() {
        Map obj = new HashMap();
        obj.put("name", "Nam");
        obj.put("age", new Integer(26));
        obj.put("salary", new Double(1500));
        String jsonText = JSONValue.toJSONString(obj);
        System.out.print("\n" + jsonText);
    }

    // Mã hóa JSON Array
    public static void maHoaObjectJson3() {
        JSONArray arr = new JSONArray();
        arr.add("Mười");
        arr.add(new Integer(22));
        arr.add(new Double(1200));
        System.out.print("\n" + arr);
    }

    // Mã hóa JSON Array sử dụng List
    public static void maHoaObjectJson4() {
        List arr = new ArrayList();
        arr.add("Lân");
        arr.add(new Integer(31));
        arr.add(new Double(1300));
        String jsonText = JSONValue.toJSONString(arr);
        System.out.print("\n" + jsonText);
    }

    // Giải mã json
    public static void giaiMaJson(String jsonStr) {

        Object obj = JSONValue.parse(jsonStr);
        JSONObject jsonObject = (JSONObject) obj;

        String name = (String) jsonObject.get("name");
        double salary = (Double) jsonObject.get("salary");
        long age = (Long) jsonObject.get("age");
        System.out.println("\n Giải mã json:");
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("age: " + age);
    }
}
