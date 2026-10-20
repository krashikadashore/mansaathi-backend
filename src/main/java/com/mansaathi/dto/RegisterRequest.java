package com.mansaathi.dto;

import com.mansaathi.model.Role;

public class RegisterRequest 
{
	 private String name;
	    private String email;
	    private String password;
	    private String phone;
	    private Role role; // PATIENT / DOCTOR

	    private String specialization;
	    private Integer experienceYears;
	    private Double consultationFees;
	    private String city;
		
	    public RegisterRequest() {
			super();
		}

		public RegisterRequest(String name, String email, String password, String phone, Role role,
				String specialization, Integer experienceYears, Double consultationFees, String city) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.phone = phone;
			this.role = role;
			this.specialization = specialization;
			this.experienceYears = experienceYears;
			this.consultationFees = consultationFees;
			this.city = city;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public Integer getExperienceYears() {
			return experienceYears;
		}

		public void setExperienceYears(Integer experienceYears) {
			this.experienceYears = experienceYears;
		}

		public Double getConsultationFees() {
			return consultationFees;
		}

		public void setConsultationFees(Double consultationFees) {
			this.consultationFees = consultationFees;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	    
	    

}
