package com.nt.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;



@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "SPRING_JPA_MOVIE")
public class Movie implements Serializable{
	
	@Id
	@NonNull
	@Column(name = "MID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mid ;
	
	@NonNull
	@Column(name = "Movie Name" , length = 20)
	private String mname ;
	
	@NonNull
	@Column(name = "Year of Release" , length = 20)
	private String year ;
	
	@NonNull	
	@Column(name = "Rating")
	private Float rating ;
	
}
