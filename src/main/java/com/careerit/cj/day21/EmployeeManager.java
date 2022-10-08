package com.careerit.cj.day21;


import com.careerit.cj.day21.assignment.domain.Employee;
import com.careerit.cj.day21.assignment.util.CsvReaderUtil;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManager {

  public static void main(String[] args) {

    List<Employee> empList = CsvReaderUtil.loadEmployees();

    empList.sort(Comparator.comparing(Employee::getDeptno).thenComparing(Comparator.comparing(Employee::getSalary)));


    // Get employee names who are working for deptno 10 and name must contain "A"

    empList.stream().filter(e -> e.getDeptno() == 10).map(ele -> ele.getName())
        .filter(name -> name.toLowerCase().contains("a")).forEach(ele -> {
          System.out.println(ele);
        });
    // Get the deptno and all the employees

    Map<String, Integer> map = new HashMap<>();
    map.put("Java", 1);
    map.put("Python", 1);
    map.put("Java", 2);
    map.put(".Net", 1);
    map.put("Python", 2);
    map.put("PHP", 1);
    System.out.println(map);
    System.out.println(map.get("Jaa"));

    String data = "Java,Python,Java,.Net,Python,Java,C,CPP,C,CPP,.Net,Java,Java,Python";
    String[] arr = data.split(",");
    Map<String,Integer> wordCount = new HashMap<>();
    for(String word:arr){
        wordCount.putIfAbsent(word,0);
        wordCount.put(word,wordCount.get(word)+1);
    }
    System.out.println(wordCount);

    wordCount.entrySet().forEach(ele->{
      System.out.println(ele.getKey()+" "+ele.getValue());
    });

    Set<String> keys = wordCount.keySet();
    for(String key:keys){
      Integer value = wordCount.get(key);
      System.out.println(key+" => "+value);
    }

    Map<Integer,List<Employee>> empMap = new HashMap<>();
    empList.forEach(emp->{
          int deptno = emp.getDeptno();
          empMap.putIfAbsent(deptno,new ArrayList<>());
          List<Employee> tempList = empMap.get(deptno);
          tempList.add(emp);
          empMap.put(deptno,tempList);
    });
    empMap.entrySet().forEach(ele->{
      System.out.println("The department "+ele.getKey()+" has "+ele.getValue().size()+" employees");
    });

    Map<Integer, List<Employee>> emap = empList.stream().collect(Collectors.groupingBy(Employee::getDeptno));
    emap.entrySet().forEach(ele->{
      System.out.println("The department "+ele.getKey()+" has "+ele.getValue().size()+" employees");
    });
  }
}
