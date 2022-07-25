package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

interface Hospital {

	 boolean createPatient(PatientDTO dto);
	 void getPatientDetails();
	 boolean updatePatientAddressById(int id, String address);
	 boolean updatePatientContactNoById(int id, long contactNo);
	 boolean deletePatientByName(String name);
}
