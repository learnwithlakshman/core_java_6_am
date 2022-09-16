package com.careerit.cj.day8;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExampleWithNames {

    public static void main(String[] args) throws URISyntaxException, IOException {

        List<String> list = Files.readAllLines(
                Path.of(ListExampleWithNames.class.getResource("/names.txt").toURI())
        );

        for(String name:list){
            System.out.println(name.toUpperCase());
        }

        List<Integer> evenList = new ArrayList<>();
        evenList.add(1002);
        evenList.add(1004);
        evenList.add(1006);

        List<Integer> oddList = new ArrayList<>();
        oddList.add(1001);
        oddList.add(1003);
        oddList.add(1005);
        oddList.add(1007);

        List<Integer> newList = new ArrayList<>();
        newList.addAll(evenList);
        newList.addAll(oddList);
        Collections.sort(newList);
        System.out.println(newList);

        System.out.println(newList.containsAll(oddList));



    }
}
