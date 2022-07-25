package bailamthemoop.util;

import bailamthemoop.model.HocVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();
        return strings;
    }

    public static List<HocVien> readHocVienFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<HocVien> hocviens = new ArrayList<>();
        String[] infor;
        for (String line : strings) {
            infor = line.split(",");
            hocviens.add(new HocVien(Integer.parseInt(infor[0]), infor[1], infor[2], infor[3], infor[4], Double.parseDouble(infor[5])));
        }
        return hocviens;
    }
}

