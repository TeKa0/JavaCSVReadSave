/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csvzadanie;

import com.mycompany.csvzadanie.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.mycompany.csvzadanie.CSVReaderExample;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author TeKa
 */

public class CsvZadanie {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
       
        String csvFile = "src\\main\\java\\com\\mycompany\\csvzadanie\\osoby.csv";
        String csvDelimiter = ",";

        DataReader dataReader = new CSVReaderExample(csvDelimiter);
        List<Person> persons = dataReader.readData(csvFile);

        DataAnalyzer analyzer = new DataAnalyzer();

        double averageAge = analyzer.calculateAverageAge(persons);
        Person personWithLongestSurname = analyzer.findPersonWithLongestSurname(persons);
        List<Person> sortedPersons = analyzer.sortPersonsByAgeDescending(persons);

        System.out.println("Średni wiek: " + averageAge);
        System.out.println("Osoba z najdłuższym nazwiskiem: " + personWithLongestSurname);
        System.out.println("Osoby posortowane według wieku (malejąco):");
        sortedPersons.forEach(System.out::println);

//        String outputFilePath = "E:\\_4 semestr\\java\\csvZadanie\\output.txt";
//        try (FileWriter writer = new FileWriter(outputFilePath)) {
//            writer.write("Średni wiek: " + averageAge + "\n");
//            writer.write("Osoba z najdłuższym nazwiskiem: " + personWithLongestSurname + "\n");
//            writer.write("Osoby posortowane według wieku (malejąco):\n");
//            for (Person person : sortedPersons) {
//                writer.write(person.toString() + "\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj nazwę do pliku wyjściowego:");
        String outputFilePath = "src\\main\\java\\com\\mycompany\\csvzadanie\\" + scanner.nextLine();
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write("Średni wiek: " + averageAge + "\n");
            writer.write("Osoba z najdłuższym nazwiskiem: " + personWithLongestSurname + "\n");
            writer.write("Osoby posortowane według wieku (malejąco):\n");
            for (Person person : sortedPersons) {
                writer.write(person.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}    
