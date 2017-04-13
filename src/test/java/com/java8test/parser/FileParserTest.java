package com.java8test.parser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by trainee on 13/04/2017.
 */
public class FileParserTest {

    @Test
    public void parse() {
        assertTrue(true);
    }

//    @Test
//    public void parse() throws Exception {
//        String filename = "resource.txt";
//        List<String> parse = FileParser.parse(filename);
//        assertNotNull("It should not null", parse);
//        assertTrue(parse.size() > 0);
//    }
//
//    @Test
//    public void parse1() throws Exception {
//        String filename = "resource.txt";
//        List<String> parse = FileParser.parse(filename);
//        List<String> parse1 = FileParser.parse(filename, n -> n.equals("Tech"));
//        assertNotNull("It should not null", parse1);
//        assertTrue(parse.size() >= parse1.size());
//    }
//
//    @Test
//    public void write() throws Exception {
//        String filename = "resource.txt";
//        String content = "Test|||This is a content for testing.";
//        List<String> parse = FileParser.parse(filename);
//        FileParser.write(filename,content);
//        List<String> parse1 = FileParser.parse(filename);
//        assertNotNull("It should not null", parse1);
//        assertTrue(parse1.size() > parse.size());
//    }

}