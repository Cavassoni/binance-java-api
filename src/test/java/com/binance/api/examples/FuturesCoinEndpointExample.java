package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiCoinFuturesRestClient;
import com.binance.api.client.BinanceApiLendingRestClient;
import com.binance.api.client.domain.account.AllCoinsInformation;
import com.binance.api.client.domain.account.FuturesCoinAccount;
import com.binance.api.client.domain.account.LendingAccount;

import java.util.List;

public class FuturesCoinEndpointExample {

	public static String API_KEY = "";
	public static String SECRET_KEY = "";

	public static void main(String[] args) {

		BinanceApiClientFactory binanceApiClientFactory = BinanceApiClientFactory.newInstance(API_KEY, SECRET_KEY);
		BinanceApiCoinFuturesRestClient futuresCoin = binanceApiClientFactory.newCoinFuturesRestClient();

//		List<FlexibleProduct> detail = lendingClient.getFlexibleProductList(StatusFlexibleProduct.ALL);
//		System.out.println(detail);

		FuturesCoinAccount res = futuresCoin.getFuturesCoinAccount();
		System.out.println(res);
	}

}
