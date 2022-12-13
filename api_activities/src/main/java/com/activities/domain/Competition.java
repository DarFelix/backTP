package com.activities.domain;

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

import com.activities.enums.Advantage;
import com.activities.enums.Status;

@Entity
@Table(name = "competitions")
public class Competition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "competition_id")
	private int idCompetition;

	@Column(name = "name")
	private String name;

	@Column(name = "date_perform")
	private LocalDateTime datePerform;

	@Column(name = "limit_participants")
	private int limitParticipants;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender_advantage")
	private Advantage genderAdvantage;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Status status;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "update_date")
	private LocalDateTime updateDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "campus_id")
	private Campus campus;

	public int getIdCompetition() {
		return idCompetition;
	}

	public void setIdCompetition(int idCompetition) {
		this.idCompetition = idCompetition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDatePerform() {
		return datePerform;
	}

	public void setDatePerform(LocalDateTime datePerform) {
		this.datePerform = datePerform;
	}

	public int getLimitParticipants() {
		return limitParticipants;
	}

	public void setLimitParticipants(int limitParticipants) {
		this.limitParticipants = limitParticipants;
	}

	public Advantage getGenderAdvantage() {
		return genderAdvantage;
	}

	public void setGenderAdvantage(Advantage genderAdvantage) {
		this.genderAdvantage = genderAdvantage;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}
}
