/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csvzadanie;

/**
 *
 * @author TeKa
 */
public class Person {
    String imie;
    String nazwisko;
    Integer wiek;
    String email;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getWiek() {
        return wiek;
    }

    public String getEmail() {
        return email;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return imie + " " + nazwisko + ", wiek: " + wiek + ", email: " + email;
    }
    
}

