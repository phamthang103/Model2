package BaiTap.helper;

import BaiTap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static List<String> readFile(String path) {
        List<String> result = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;

            while ((line = reader.readLine()) != null) {
                if(!line.isEmpty()){
                    result.add(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeFile(List<Product> list) throws IOException {
        FileWriter fileWriter = new FileWriter(Product.FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "";

        for (Product product: list){
            str += product.getId()  + "," + product.getName() + "," + product.getCost() + "\n";
        }
        if (str != null && !str.isEmpty()){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

