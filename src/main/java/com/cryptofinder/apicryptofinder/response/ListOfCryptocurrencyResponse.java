package com.cryptofinder.apicryptofinder.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListOfCryptocurrencyResponse {
	@JsonProperty("id")
	private String id;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("name")
	private String name;

	@JsonProperty("image")
	private String image;

	@JsonProperty("current_price")
	private double currentPrice;

	@JsonProperty("market_cap")
	private long marketCap;

	@JsonProperty("market_cap_rank")
	private int marketCapRank;

	@JsonProperty("fully_diluted_valuation")
	private long fullyDilutedValuation;

	@JsonProperty("total_volume")
	private long totalVolume;

	@JsonProperty("high_24h")
	private double high24h;

	@JsonProperty("low_24h")
	private double low24h;

	@JsonProperty("price_change_24h")
	private double priceChange24h;

	@JsonProperty("price_change_percentage_24h")
	private double priceChangePercentage24h;

	@JsonProperty("market_cap_change_24h")
	private double marketCapChange24h;

	@JsonProperty("market_cap_change_percentage_24h")
	private double marketCapChangePercentage24h;

	@JsonProperty("circulating_supply")
	private double circulatingSupply;

	@JsonProperty("total_supply")
	private double totalSupply;

	@JsonProperty("max_supply")
	private double maxSupply;

	@JsonProperty("ath")
	private double ath;

	@JsonProperty("ath_change_percentage")
	private double athChangePercentage;

	@JsonProperty("ath_date")
	private String athDate;

	@JsonProperty("atl")
	private double atl;

	@JsonProperty("atl_change_percentage")
	private double atlChangePercentage;

	@JsonProperty("atl_date")
	private String atlDate;

	@JsonProperty("roi")
	private Roi roi;

	@JsonProperty("last_updated")
	private String lastUpdated;

	public String getId() {
		return id;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public long getMarketCap() {
		return marketCap;
	}

	public int getMarketCapRank() {
		return marketCapRank;
	}

	public long getFullyDilutedValuation() {
		return fullyDilutedValuation;
	}

	public long getTotalVolume() {
		return totalVolume;
	}

	public double getHigh24h() {
		return high24h;
	}

	public double getLow24h() {
		return low24h;
	}

	public double getPriceChange24h() {
		return priceChange24h;
	}

	public double getPriceChangePercentage24h() {
		return priceChangePercentage24h;
	}

	public double getMarketCapChange24h() {
		return marketCapChange24h;
	}

	public double getMarketCapChangePercentage24h() {
		return marketCapChangePercentage24h;
	}

	public double getCirculatingSupply() {
		return circulatingSupply;
	}

	public double getTotalSupply() {
		return totalSupply;
	}

	public double getMaxSupply() {
		return maxSupply;
	}

	public double getAth() {
		return ath;
	}

	public double getAthChangePercentage() {
		return athChangePercentage;
	}

	public String getAthDate() {
		return athDate;
	}

	public double getAtl() {
		return atl;
	}

	public double getAtlChangePercentage() {
		return atlChangePercentage;
	}

	public String getAtlDate() {
		return atlDate;
	}

	public Roi getRoi() {
		return roi;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}
}

class Roi {
	@JsonProperty("times")
	private double times;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("percentage")
	private double percentage;

	public double getTimes() {
		return times;
	}

	public String getCurrency() {
		return currency;
	}

	public double getPercentage() {
		return percentage;
	}
}
