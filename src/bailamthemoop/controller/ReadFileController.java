package bailamthemoop.controller;

import bailamthemoop.model.HocVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileController {
    public static void main(String[] args) throws IOException {
        File file = new File(" bailamthemoop/data/GiangVien.txt");
         FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] info;

        List<HocVien> hocViens = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
        }
         bufferedReader.close();
    }
}
