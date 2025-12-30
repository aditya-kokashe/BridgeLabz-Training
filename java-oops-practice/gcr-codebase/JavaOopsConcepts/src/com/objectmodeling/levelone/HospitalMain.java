package com.objectmodeling.levelone;

public class HospitalMain {

    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor(301, "Bhola");
        Doctor d2 = new Doctor(302, "Bikaner");

        Patient p1 = new Patient(401, "Abhinav manga");
        Patient p2 = new Patient(402, "Mohit pinga");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.showHospitalData();

        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}
