package io.covid.cases.CoronaVirusTracker.Models;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestTotalCases;
	private int oldTotalCases;
	private int diffCases;
	
	
	
	public int getDiffCases() {
		return diffCases;
	}
	public void setDiffCases(int diffCases) {
		this.diffCases = diffCases;
	}
	public int getOldTotalCases() {
		return oldTotalCases;
	}
	public void setOldTotalCases(int oldTotalCases) {
		this.oldTotalCases = oldTotalCases;
	}
	@Override
	public String toString() {
		return " state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	
	

}
