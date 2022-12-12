package com.activities.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.activities.enums.City;
import com.activities.enums.Genre;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int idUser;

	@Column(name = "name")
	private String name;

	@Column(name = "number_doc")
	private String numberDoc;

	@Enumerated(EnumType.STRING)
	@Column(name = "city")
	private City city;

	@Enumerated(EnumType.STRING)
	@Column(name = "genre")
	private Genre genre;

	@Column(name = "birthday")
	private LocalDate birthday;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "update_date")
	private LocalDateTime updateDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberDoc() {
		return numberDoc;
	}

	public void setNumberDoc(String numberDoc) {
		this.numberDoc = numberDoc;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
