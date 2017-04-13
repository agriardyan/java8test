package com.java8test.main;

import com.java8test.parser.FileParser;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by trainee on 13/04/2017.
 */
public class Main {

    public enum NewsTopicEnum {
        Tech,
        Medic,
        Politics
    }

    public static void main(String[] args) {
        // find all news about tech

        final String FILE_URI = "resource.txt";

        List<String> tech = null;
        try {
            tech = FileParser.parse(FILE_URI, x -> x.split("[|||]")[0].equals("Techs"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Write the content of topic ");
        String content = sc.nextLine();
        System.out.println("Select new topic : 1. Tech | 2. Medic | 3. Politics"  + "\nPress Enter to submit.");
        int topic = sc.nextInt();


        FileParser.write(FILE_URI, NewsTopicEnum.values()[topic - 1] + "|||" + content);


    }

}
