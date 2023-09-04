package com.cryptofirer.apicryptofirer.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.cryptofirer.apicryptofirer.response.CryptocurrencyResponse;
import com.cryptofirer.apicryptofirer.response.ListOfCryptocurrencyResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CryptocurrencyClient {
	private final WebClient webClient;
	
	public CryptocurrencyClient(WebClient.Builder builder) {
		this.webClient = builder.baseUrl("https://api.coingecko.com/api/v3").build();
	}

	public Mono<CryptocurrencyResponse> findCryptocurrencyById(String id) {
		return this.webClient
				.get()
				.uri("/coins/" + id)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(CryptocurrencyResponse.class);
	}
	
	public Flux<ListOfCryptocurrencyResponse> findAllCryptocurrencies(String currency, String sortingAttribute, int itemsPerPage, int page) {
		return this.webClient
				.get()
				.uri("/coins/markets?vs_currency=" + currency + 
						"&order=" + sortingAttribute +
						"_desc&per_page=" + itemsPerPage + 
						"&page=" + page)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToFlux(ListOfCryptocurrencyResponse.class);
	}
}
