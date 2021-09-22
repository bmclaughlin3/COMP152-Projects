package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var Names = new ArrayList<String>();
        var Numbers = new ArrayList<Integer>();
        var fileName = "TestData.txt";
        var filePath = Paths.get(fileName);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines){
            var splitline= line.split(",");
            Names.add(splitline[0]);
            Numbers.add(Integer.parseInt(splitline[1]));
        }
        for(int i = 0; i< Names.size(); i++){
            System.out.println("Student "+ Names.get(i)+ " has Jersey Number "+ Numbers.get(i));
        }
    }
}
