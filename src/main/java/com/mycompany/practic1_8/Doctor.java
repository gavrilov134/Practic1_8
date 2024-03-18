/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_8;

class Doctor {
    String fullName;
    String specialization;
    int id;
    int shiftsPerMonth;
    boolean certification;

    public Doctor(String fullName, String specialization, int id, int shiftsPerMonth, boolean certification) {
        this.fullName = fullName;
        this.specialization = specialization;
        this.id = id;
        this.shiftsPerMonth = shiftsPerMonth;
        this.certification = certification;
    }

    @Override
    public String toString() {
        return fullName + ", " + specialization + ", " + id + ", " + shiftsPerMonth + ", " + certification;
    }
}
