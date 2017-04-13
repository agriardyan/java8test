package com.java8test.parser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by trainee on 13/04/2017.
 */
public class FileParser {

    /**
     * Read file with File IO
     * @param uri URI of file to be read
     * @return Stream of String from file
     * @throws IOException
     */
    private static Stream<String> read(String uri) throws IOException {
        return Files.lines(Paths.get(uri));
    }

    /**
     * Read file onto stream and collect it into list of string
     * @param uri URI of file to be read
     * @return List of String from file
     * @throws IOException
     */
    public static List<String> parse(String uri) throws IOException {
        return read(uri).collect(Collectors.toList());
    }

    /**
     * Filter stream based on user Predicate, and collect it into list
     * @param uri URI of file to be read
     * @param p Predicate input from user
     * @return List of String that match the predicate
     * @throws IOException
     */
    public static List<String> parse(String uri, Predicate<String> p) throws IOException {
        return read(uri).filter(p).collect(Collectors.toList());
    }

    /**
     * We use FileIO concept here and new exception handling, which is try-catch with resource
     */
    public static void write(String uri, String content) {
        try (Writer pw = new BufferedWriter(new FileWriter(uri, true))) {
            pw.append("\n"+content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
