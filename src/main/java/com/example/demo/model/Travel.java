package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Entity
@Table(name="Travel")
public class Travel {

	//name of destination
//	possible dates of destination
//	things to do at destination
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column
		private String name; 
		 
		@Column
		private String dates;
		
		@Column
		private String thingstodo;

		public Travel() {
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDates() {
			return dates;
		}

		public void setDates(String dates) {
			this.dates = dates;
		}

		public String getThingstodo() {
			return thingstodo;
		}

		public void setThingstodo(String thingstodo) {
			this.thingstodo = thingstodo;
		}

		
	}
