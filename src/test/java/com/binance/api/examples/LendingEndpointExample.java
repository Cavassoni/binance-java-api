package com.binance.api.examples;

import java.util.List;
import java.util.stream.Collectors;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiLendingRestClient;
import com.binance.api.client.BinanceApiSpotRestClient;
import com.binance.api.client.domain.StatusFlexibleProduct;
import com.binance.api.client.domain.WalletType;
import com.binance.api.client.domain.account.*;

public class LendingEndpointExample {

	public static String API_KEY = "";
	public static String SECRET_KEY = "";

	public static void main(String[] args) {

		BinanceApiClientFactory binanceApiClientFactory = BinanceApiClientFactory.newInstance(API_KEY, SECRET_KEY);
		BinanceApiLendingRestClient lendingClient = binanceApiClientFactory.newLendingRestClient();

//		List<FlexibleProduct> detail = lendingClient.getFlexibleProductList(StatusFlexibleProduct.ALL);
//		System.out.println(detail);

		LendingAccount l = lendingClient.getLendingAccount();

		List<AllCoinsInformation> futuresAccount = lendingClient.getAllCoinsInformation();

		System.out.println(l);
	}

}
