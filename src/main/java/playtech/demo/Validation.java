package playtech.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Validation {
    public static List<String> getCharacters (String person) {
        System.out.print(person + " ::: ");
        Scanner line = new Scanner(System.in);
        String userName = line.nextLine();
        List<String> listOfPersons = new ArrayList<>();
        listOfPersons.addAll(Arrays.asList(userName.split(", ")));
        return listOfPersons;
    }
    public static List<String> getRelationsFromFile (String fileName) {
        Pattern p = Pattern.compile("\\w+ : \\w+ = \\d+[RL] x \\d+[RL]");
        List<String> patterns = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                Matcher m = p.matcher(line);
                if (m.matches()) {
                    patterns.add(line);
                } else {
                    System.out.println("Invalid input");
                }
            }

        } catch (IOException fileException) {
            fileException.printStackTrace();
            return new ArrayList<>();
        }
        return patterns;
    }
    public static List<String[]> getEntity (String regex, List<String> input) {

        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
                String a [] = input.get(i).split(regex);
                list.add(a);
            }
        return list;
        }
}
