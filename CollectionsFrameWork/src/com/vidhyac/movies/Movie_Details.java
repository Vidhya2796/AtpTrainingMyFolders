package com.vidhyac.movies;

public class Movie_Details {
	//mov_Name,lead_actor, lead_actories, and genre
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	Movie_Details(){
		mov_Name="Robot";
		lead_actor="Rajnikanth";
		lead_actress="Aishwarya";
		genre="Science fiction";
	}
	Movie_Details(String mov_Name,String lead_actor,String lead_actress,String genre){
		this.genre=genre;
		this.mov_Name=mov_Name;
		this.lead_actor=lead_actor;
		this.lead_actress=lead_actress;
	}
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + mov_Name + ", lead_actor="
				+ lead_actor + ", lead_actress=" + lead_actress + "]";
	}
	
	
}
