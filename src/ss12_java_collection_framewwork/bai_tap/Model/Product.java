package ss11_java_collection_framewwork.bai_tap.Model;

import java.util.HashMap;
import java.util.Map;

public class Product {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Đồng hồ",1000);
        hashMap.put("Tranh",2000);
        hashMap.put("Bút",1);
        hashMap.put("Bảng",10);
        hashMap.put("Điện thoại",20);
        System.out.println("Hiển thị các mục trong HashMap");
        System.out.println(hashMap+"/n");
    }

}
