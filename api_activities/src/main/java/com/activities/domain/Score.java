package com.activities.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "scores")
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "score_id")
	private int idScore;
	
	@Column(name = "score")
	private double score;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "creation_date")
	private LocalDateTime creationDate;
	
	@Column(name = "update_date")
	private LocalDateTime updateDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "competition_id")
	private Competition competition;
	
	public int getIdScore() {
		return idScore;
	}
	public void setIdScore(int idScore) {
		this.idScore = idScore;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

}
