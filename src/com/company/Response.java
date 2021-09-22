package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Response {
    public class Ex_3 {
        public static void main(String[] args){
            var studentNames = new ArrayList<String>();
            var reader = new Scanner(System.in);
            var userResponse = "";
            while (!userResponse.equals("done")){
                System.out.print("Enter next name or 'done' to end:");
                userResponse = reader.nextLine();
                if (!userResponse.equals("done")){
                    studentNames.add(userResponse);
                }
            }
            System.out.println("The students in your class are:");
            for (var Name: studentNames){
                System.out.println(Name);
            }
        }
    }
}
