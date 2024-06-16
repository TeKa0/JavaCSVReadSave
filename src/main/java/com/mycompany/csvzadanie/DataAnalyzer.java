/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csvzadanie;

/**
 *
 * @author TeKa
 */
import java.util.Comparator;
import java.util.List;

public class DataAnalyzer {
    public double calculateAverageAge(List<Person> persons) {
        return persons.stream()
                      .mapToInt(Person::getWiek)
                      .average()
                      .orElse(0);
    }

    public Person findPersonWithLongestSurname(List<Person> persons) {
        return persons.stream()
                      .max(Comparator.comparingInt(p -> p.getNazwisko().length()))
                      .orElse(null);
    }

    public List<Person> sortPersonsByAgeDescending(List<Person> persons) {
        persons.sort(Comparator.comparingInt(Person::getWiek).reversed());
        return persons;
    }
}

