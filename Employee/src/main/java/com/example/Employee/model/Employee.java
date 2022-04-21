package com.example.Employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="emp_id")
            private Long id;
        
        @Column(name="first_name")
        private String firstName;
        
        @Column(name="last_name")
        private String lastName;
        
        @Column(name="email_id")
        private String emailId;

		public Object getFirstName() {
			
			return null;
		}

		public void setLastName(Object firstName2) {
		
			
		}

		public Object getEmailId() {
			
			return null;
		}

		public void setEmailId(Object emailId2) {
			
		}

		public void setFirstName(Object firstName2) {
			
			
		}
}

