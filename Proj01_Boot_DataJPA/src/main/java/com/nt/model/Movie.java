package com.nt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SPRING_JPA_MOVIE")
public class Movie implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MID")
	private Integer mid ;
	@Column(name = "Movie Name" , length = 20)
	private String mname ;
	@Column(name = "Year of Release" , length = 20)
	private String year ;
	@Column(name = "Rating")
	private Float rating ;
	
}
