package com.cryptofirer.apicryptofirer.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CryptocurrencyResponse {
	@JsonProperty("id")
	private String id;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("name")
	private String name;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("image")
	private ImageInfo image;

	@JsonProperty("market_data")
	private MarketData marketData;

	@JsonProperty("genesis_date")
	private String genesisDate;

	@JsonProperty("description")
	private Description description;

	public String getId() {
		return id;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public List<String> getCategories() {
		return categories;
	}

	public ImageInfo getImage() {
		return image;
	}

	public MarketData getMarketData() {
		return marketData;
	}

	public String getGenesisDate() {
		return genesisDate;
	}

	public Description getDescription() {
		return description;
	}
}

class ImageInfo {
	@JsonProperty("thumb")
	private String thumb;

	@JsonProperty("small")
	private String small;

	@JsonProperty("large")
	private String large;

	public String getThumb() {
		return thumb;
	}

	public String getSmall() {
		return small;
	}

	public String getLarge() {
		return large;
	}
}

class MarketData {
	@JsonProperty("current_price")
	private CoinInfo currentPrice;

	@JsonProperty("ath")
	private CoinInfo ath;

	@JsonProperty("ath_change_percentage")
	private CoinInfo athChangePercentage;

	@JsonProperty("market_cap")
	private CoinInfo marketCap;

	@JsonProperty("market_cap_rank")
	private int marketCapRank;

	@JsonProperty("price_change_24h_in_currency")
	private CoinInfo priceChange24HInCurrency;

	@JsonProperty("price_change_percentage_1h_in_currency")
	private CoinInfo priceChangePercentage1HInCurrency;

	@JsonProperty("price_change_percentage_24h_in_currency")
	private CoinInfo priceChangePercentage24HInCurrency;

	@JsonProperty("price_change_percentage_7d_in_currency")
	private CoinInfo priceChangePercentage7DInCurrency;

	@JsonProperty("price_change_percentage_14d_in_currency")
	private CoinInfo priceChangePercentage14DInCurrency;

	@JsonProperty("price_change_percentage_30d_in_currency")
	private CoinInfo priceChangePercentage30DInCurrency;

	@JsonProperty("price_change_percentage_60d_in_currency")
	private CoinInfo priceChangePercentage60DInCurrency;

	@JsonProperty("price_change_percentage_200d_in_currency")
	private CoinInfo priceChangePercentage200DInCurrency;

	@JsonProperty("price_change_percentage_1y_in_currency")
	private CoinInfo priceChangePercentage1YInCurrency;

	public CoinInfo getCurrentPrice() {
		return currentPrice;
	}

	public CoinInfo getAth() {
		return ath;
	}

	public CoinInfo getAthChangePercentage() {
		return athChangePercentage;
	}

	public CoinInfo getMarketCap() {
		return marketCap;
	}

	public int getMarketCapRank() {
		return marketCapRank;
	}

	public CoinInfo getPriceChange24HInCurrency() {
		return priceChange24HInCurrency;
	}

	public CoinInfo getPriceChangePercentage14DInCurrency() {
		return priceChangePercentage14DInCurrency;
	}

	public CoinInfo getPriceChangePercentage1HInCurrency() {
		return priceChangePercentage1HInCurrency;
	}

	public CoinInfo getPriceChangePercentage1YInCurrency() {
		return priceChangePercentage1YInCurrency;
	}

	public CoinInfo getPriceChangePercentage200DInCurrency() {
		return priceChangePercentage200DInCurrency;
	}

	public CoinInfo getPriceChangePercentage24HInCurrency() {
		return priceChangePercentage24HInCurrency;
	}

	public CoinInfo getPriceChangePercentage30DInCurrency() {
		return priceChangePercentage30DInCurrency;
	}

	public CoinInfo getPriceChangePercentage60DInCurrency() {
		return priceChangePercentage60DInCurrency;
	}

	public CoinInfo getPriceChangePercentage7DInCurrency() {
		return priceChangePercentage7DInCurrency;
	}
}

class CoinInfo {
	@JsonProperty("usd")
	private double usd;

	@JsonProperty("eur")
	private double eur;

	@JsonProperty("brl")
	private double brl;

	public double getUsd() {
		return usd;
	}

	public double getEur() {
		return eur;
	}

	public double getBrl() {
		return brl;
	}
}

class Description {
	@JsonProperty("en")
	private String en;

	public String getEn() {
		return en;
	}
}