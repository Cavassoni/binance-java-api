package com.binance.api.examples;

import java.util.List;
import java.util.stream.Collectors;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiSpotRestClient;
import com.binance.api.client.domain.WalletType;
import com.binance.api.client.domain.account.DailyAccountDetail;
import com.binance.api.client.domain.account.Data;
import com.binance.api.client.domain.account.SnapshotVo;

public class SpotEndpointExample {

	public static String API_KEY = "";
	public static String SECRET_KEY = "";

	public static void main(String[] args) {

		BinanceApiClientFactory binanceApiClientFactory = BinanceApiClientFactory.newInstance(API_KEY, SECRET_KEY);
		BinanceApiSpotRestClient spotClient = binanceApiClientFactory.newSpotRestClient();

		DailyAccountDetail detail = spotClient.dailyAccountSnapshot(WalletType.SPOT);
		System.out.println(detail);

		detail.getSnapshotVos() //
				.forEach(item -> {
					item.getData().setBalances(item.getData() //
							.getBalances() //
							.stream() //
							.filter(t -> (!t.getFree().equals("0") || !t.getLocked().equals("0")))
							.collect(Collectors.toList()));
				});
		System.out.println(detail);

		List<String> l = detail.getSnapshotVos().stream() //
				.map(SnapshotVo::getData) //
				.map(Data::getTotalAssetOfBtc) //
				.collect(Collectors.toList());
		l.forEach(System.out::println);
	}

}
