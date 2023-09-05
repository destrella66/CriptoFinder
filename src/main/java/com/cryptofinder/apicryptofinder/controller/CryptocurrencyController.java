package com.cryptofinder.apicryptofinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cryptofinder.apicryptofinder.client.CryptocurrencyClient;
import com.cryptofinder.apicryptofinder.response.CryptocurrencyResponse;
import com.cryptofinder.apicryptofinder.response.ListOfCryptocurrencyResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class CryptocurrencyController {
	private final CryptocurrencyClient client;

	@Autowired
	public CryptocurrencyController(CryptocurrencyClient client) {
		this.client = client;
	}

	@GetMapping("/coin/{id}")
	public Mono<CryptocurrencyResponse> getCryptocurrencyById(@PathVariable String id) {
		return this.client.findCryptocurrencyById(id);
	}

	@GetMapping("/coins")
	public Flux<ListOfCryptocurrencyResponse> getAllCryptocurrencies(@RequestParam String currency,
			@RequestParam(name = "order") String sortingAttribute, @RequestParam(name = "per_page") int itemsPerPage,
			@RequestParam int page) {
		return this.client.findAllCryptocurrencies(currency, sortingAttribute, itemsPerPage, page);
	}
}
