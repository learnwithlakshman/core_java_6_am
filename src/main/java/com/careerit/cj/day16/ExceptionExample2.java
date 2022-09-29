package com.careerit.cj.day16;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionExample2 {
    public static void main(String[] args)  {
        try {
            List<String> list = Files.readAllLines(Paths.get(ExceptionExample2.class.getResource("/emp_data.csv").toURI()));
            System.out.println(list);
        }catch (IOException e){
            System.out.println("File is not found/check permissions "+e);
        }catch (URISyntaxException e){
            System.out.println("Please check uri syntax "+e);
        }
    }
}
