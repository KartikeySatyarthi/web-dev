package com.Stocks.DailyAdjusted.Entity;

import org.springframework.stereotype.Component;

@Component
public class StocksEnity {


	//private String value="SBIN.NS";
	private String longName="";
	private Double ask=0.0;
	private Double regularMarketDayHigh=0.0;
	private Double regularMarketDayLow=0.0;
	private Double fiftyTwoWeekLow=0.0;
	private Double fiftyTwoWeekHigh=0.0;
	private Long marketCap=0l;
	private Long sharesOutstanding=0l;
	private Double trailingPE=0.0;
	private Double priceToBook=0.0;
	private Double trailingAnnualDividendYield=0.0;
	private Double bookValue=0.0;
	private Double epsTrailingTwelveMonths=0.0;
	private Double fiftyDayAverage=0.0;
	private Double twoHundredDayAverage=0.0;
	
	
	
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public Double getAsk() {
		return ask;
	}
	public void setAsk(Double ask) {
		this.ask = ask;
	}
	public Double getRegularMarketDayHigh() {
		return regularMarketDayHigh;
	}
	public void setRegularMarketDayHigh(Double regularMarketDayHigh) {
		this.regularMarketDayHigh = regularMarketDayHigh;
	}
	public Double getRegularMarketDayLow() {
		return regularMarketDayLow;
	}
	public void setRegularMarketDayLow(Double regularMarketDayLow) {
		this.regularMarketDayLow = regularMarketDayLow;
	}
	public Double getFiftyTwoWeekLow() {
		return fiftyTwoWeekLow;
	}
	public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
	}
	public Double getFiftyTwoWeekHigh() {
		return fiftyTwoWeekHigh;
	}
	public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
	}
	public Long getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(Long marketCap) {
		this.marketCap = marketCap;
	}
	public Long getSharesOutstanding() {
		return sharesOutstanding;
	}
	public void setSharesOutstanding(Long sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}
	public Double getTrailingPE() {
		return trailingPE;
	}
	public void setTrailingPE(Double trailingPE) {
		this.trailingPE = trailingPE;
	}
	public Double getPriceToBook() {
		return priceToBook;
	}
	public void setPriceToBook(Double priceToBook) {
		this.priceToBook = priceToBook;
	}
	public Double getTrailingAnnualDividendYield() {
		return trailingAnnualDividendYield;
	}
	public void setTrailingAnnualDividendYield(Double trailingAnnualDividendYield) {
		this.trailingAnnualDividendYield = trailingAnnualDividendYield;
	}
	public Double getBookValue() {
		return bookValue;
	}
	public void setBookValue(Double bookValue) {
		this.bookValue = bookValue;
	}
	public Double getEpsTrailingTwelveMonths() {
		return epsTrailingTwelveMonths;
	}
	public void setEpsTrailingTwelveMonths(Double epsTrailingTwelveMonths) {
		this.epsTrailingTwelveMonths = epsTrailingTwelveMonths;
	}
	public Double getFiftyDayAverage() {
		return fiftyDayAverage;
	}
	public void setFiftyDayAverage(Double fiftyDayAverage) {
		this.fiftyDayAverage = fiftyDayAverage;
	}
	public Double getTwoHundredDayAverage() {
		return twoHundredDayAverage;
	}
	public void setTwoHundredDayAverage(Double twoHundredDayAverage) {
		this.twoHundredDayAverage = twoHundredDayAverage;
	}
	
	

}
