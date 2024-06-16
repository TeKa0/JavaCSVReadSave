/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csvzadanie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TeKa
 */
public class CSVReaderExample implements DataReader {
    private String delimiter;

    public CSVReaderExample(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<Person> readData(String filePath) {
        List<Person> persons = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(delimiter);

                Person person = new Person();
                person.setImie(values[0]);
                person.setNazwisko(values[1]);
                person.setWiek(Integer.parseInt(values[2].trim()));
                person.setEmail(values[3]);

                persons.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }
}

