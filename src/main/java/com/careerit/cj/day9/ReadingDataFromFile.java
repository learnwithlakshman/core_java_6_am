package com.careerit.cj.day9;

import com.careerit.cj.day8.ListExampleWithNames;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class ReadingDataFromFile {
    public static void main(String[] args) throws URISyntaxException, IOException {
        List<String> list = Files.readAllLines(
                Path.of(ListExampleWithNames.class.getResource("/emp_data.csv").toURI())
        );
        StringBuilder sb = new StringBuilder();
        for(String line:list){
            String name= line.split(",")[1].split(" ")[0].toUpperCase();
            sb.append(name).append(",");
        }
        System.out.println(sb.substring(0,sb.length()-1));
        String name = "Krish";
        String email = "krish@gmail.com";
        String qualification="B.Tech";
        String message=String.format("Hello %s, Please confirm email %s and qualification is %s ?",name,email,qualification);
        System.out.println(message);
    }


}
