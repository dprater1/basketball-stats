package com.basketball.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Stats implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String season;
	
	@Column(nullable = false)
	private String age;
	
	@Column(nullable = false)
	private String team;
	
	@Column(nullable = false)
	private String lg;

	@Column(nullable = false)
	private String pos;

	@Column(nullable = false)
	private int games;
	
	@Column(nullable = false)
	private int gamesStarted;
	
	@Column(nullable = false)
	private double minutesPlayed;
	
	@Column(nullable = false)
	private double fieldGoalsMade;
	
	@Column(nullable = false)
	private double fieldGoalsAtt;
	
	@Column(nullable = false)
	private double fieldGoalPct;
	
	@Column(nullable = false)
	private double threePointsMade;
	
	@Column(nullable = false)
	private double threePointsAtt;
	
	@Column(nullable = false)
	private double threePointsPct;
	
	@Column(nullable = false)
	private double twoPointsMade;
	
	@Column(nullable = false)
	private double twoPointsAttempted;
	
	@Column(nullable = false)
	private double twoPointsPct;
	
	@Column(nullable = false)
	private double eFieldGoalPct;
	
	@Column(nullable = false)
	private double freeThrowsMade;
	
	@Column(nullable = false)
	private double freeThrowsAtt;
	
	@Column(nullable = false)
	private double freeThrowsPct;
	
	@Column(nullable = false)
	private double offRebounds;
	
	@Column(nullable = false)
	private double defRebounds;
	
	@Column(nullable = false)
	private double totalRebounds;
	
	@Column(nullable = false)
	private double assists;
	
	@Column(nullable = false)
	private double steals;
	
	@Column(nullable = false)
	private double blocks;
	
	@Column(nullable = false)
	private double turnovers;
	
	@Column(nullable = false)
	private double personalFouls;
	
	@Column(nullable = false)
	private double points;
	
	
}
