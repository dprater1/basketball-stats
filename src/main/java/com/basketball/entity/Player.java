package com.basketball.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Player implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // incrementation will use auto increment
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private List<String> nicknames;
	
	@Column(nullable = false)
	private String position;
	
	@Column(nullable = false)
	private String born;
	
	@Column(nullable = false)
	private String died;
	
	@Column(nullable = false)
	private String shootingHand;
	
	@OneToMany(mappedBy = "player", targetEntity = Stats.class)
	private List<Stats> stats;
	
	
	
}
