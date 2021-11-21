package com.company.belarusbank;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class parser {
    public static void parseBelarusBank(String city){
        String path = new String("C:\\Users\\ASUS\\IdeaProjects\\TryParse\\src\\com\\company\\belarusbank" + city + ".json");
        URL url = null;
        File file = new File(path);
        try {
            url = new URL("https://belarusbank.by/api/kursExchange?city=".concat(city));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(bufferedInputStream.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
