package com.basketball.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stats implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // incrementation will use auto increment
	private Long id;
	
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

	@ManyToOne
	@JoinColumn(name = "player_id")
	private Player player;
	
	public Stats() {
		
	}


	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getLg() {
		return lg;
	}

	public void setLg(String lg) {
		this.lg = lg;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}

	public int getGamesStarted() {
		return gamesStarted;
	}

	public void setGamesStarted(int gamesStarted) {
		this.gamesStarted = gamesStarted;
	}

	public double getMinutesPlayed() {
		return minutesPlayed;
	}

	public void setMinutesPlayed(double minutesPlayed) {
		this.minutesPlayed = minutesPlayed;
	}

	public double getFieldGoalsMade() {
		return fieldGoalsMade;
	}

	public void setFieldGoalsMade(double fieldGoalsMade) {
		this.fieldGoalsMade = fieldGoalsMade;
	}

	public double getFieldGoalsAtt() {
		return fieldGoalsAtt;
	}

	public void setFieldGoalsAtt(double fieldGoalsAtt) {
		this.fieldGoalsAtt = fieldGoalsAtt;
	}

	public double getFieldGoalPct() {
		return fieldGoalPct;
	}

	public void setFieldGoalPct(double fieldGoalPct) {
		this.fieldGoalPct = fieldGoalPct;
	}

	public double getThreePointsMade() {
		return threePointsMade;
	}

	public void setThreePointsMade(double threePointsMade) {
		this.threePointsMade = threePointsMade;
	}

	public double getThreePointsAtt() {
		return threePointsAtt;
	}

	public void setThreePointsAtt(double threePointsAtt) {
		this.threePointsAtt = threePointsAtt;
	}

	public double getThreePointsPct() {
		return threePointsPct;
	}

	public void setThreePointsPct(double threePointsPct) {
		this.threePointsPct = threePointsPct;
	}

	public double getTwoPointsMade() {
		return twoPointsMade;
	}

	public void setTwoPointsMade(double twoPointsMade) {
		this.twoPointsMade = twoPointsMade;
	}

	public double getTwoPointsAttempted() {
		return twoPointsAttempted;
	}

	public void setTwoPointsAttempted(double twoPointsAttempted) {
		this.twoPointsAttempted = twoPointsAttempted;
	}

	public double getTwoPointsPct() {
		return twoPointsPct;
	}

	public void setTwoPointsPct(double twoPointsPct) {
		this.twoPointsPct = twoPointsPct;
	}

	public double geteFieldGoalPct() {
		return eFieldGoalPct;
	}

	public void seteFieldGoalPct(double eFieldGoalPct) {
		this.eFieldGoalPct = eFieldGoalPct;
	}

	public double getFreeThrowsMade() {
		return freeThrowsMade;
	}

	public void setFreeThrowsMade(double freeThrowsMade) {
		this.freeThrowsMade = freeThrowsMade;
	}

	public double getFreeThrowsAtt() {
		return freeThrowsAtt;
	}

	public void setFreeThrowsAtt(double freeThrowsAtt) {
		this.freeThrowsAtt = freeThrowsAtt;
	}

	public double getFreeThrowsPct() {
		return freeThrowsPct;
	}

	public void setFreeThrowsPct(double freeThrowsPct) {
		this.freeThrowsPct = freeThrowsPct;
	}

	public double getOffRebounds() {
		return offRebounds;
	}

	public void setOffRebounds(double offRebounds) {
		this.offRebounds = offRebounds;
	}

	public double getDefRebounds() {
		return defRebounds;
	}

	public void setDefRebounds(double defRebounds) {
		this.defRebounds = defRebounds;
	}

	public double getTotalRebounds() {
		return totalRebounds;
	}

	public void setTotalRebounds(double totalRebounds) {
		this.totalRebounds = totalRebounds;
	}

	public double getAssists() {
		return assists;
	}

	public void setAssists(double assists) {
		this.assists = assists;
	}

	public double getSteals() {
		return steals;
	}

	public void setSteals(double steals) {
		this.steals = steals;
	}

	public double getBlocks() {
		return blocks;
	}

	public void setBlocks(double blocks) {
		this.blocks = blocks;
	}

	public double getTurnovers() {
		return turnovers;
	}


	public void setTurnovers(double turnovers) {
		this.turnovers = turnovers;
	}

	public double getPersonalFouls() {
		return personalFouls;
	}

	public void setPersonalFouls(double personalFouls) {
		this.personalFouls = personalFouls;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "Stats [season=" + season + ", age=" + age + ", team=" + team + ", lg=" + lg + ", pos=" + pos
				+ ", games=" + games + ", gamesStarted=" + gamesStarted + ", minutesPlayed=" + minutesPlayed
				+ ", fieldGoalsMade=" + fieldGoalsMade + ", fieldGoalsAtt=" + fieldGoalsAtt + ", fieldGoalPct="
				+ fieldGoalPct + ", threePointsMade=" + threePointsMade + ", threePointsAtt=" + threePointsAtt
				+ ", threePointsPct=" + threePointsPct + ", twoPointsMade=" + twoPointsMade + ", twoPointsAttempted="
				+ twoPointsAttempted + ", twoPointsPct=" + twoPointsPct + ", eFieldGoalPct=" + eFieldGoalPct
				+ ", freeThrowsMade=" + freeThrowsMade + ", freeThrowsAtt=" + freeThrowsAtt + ", freeThrowsPct="
				+ freeThrowsPct + ", offRebounds=" + offRebounds + ", defRebounds=" + defRebounds + ", totalRebounds="
				+ totalRebounds + ", assists=" + assists + ", steals=" + steals + ", blocks=" + blocks + ", turnovers="
				+ turnovers + ", personalFouls=" + personalFouls + ", points=" + points + "]";
	}
	
	
}
