package com.binance.api.client.impl;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

import com.binance.api.client.BinanceApiSpotRestClient;
import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.WalletType;
import com.binance.api.client.domain.account.DailyAccountDetail;

/**
 * Implementation of Binance's SWAP REST API using Retrofit method calls.
 */
public class BinanceApiSpotRestClientImpl implements BinanceApiSpotRestClient {

	private final BinanceApiService binanceApiService;

	public BinanceApiSpotRestClientImpl(String apiKey, String secret) {
		binanceApiService = createService(BinanceApiService.class, apiKey, secret);
	}

	@Override
	public DailyAccountDetail dailyAccountSnapshot(WalletType type) {
		return dailyAccountSnapshot(type, null, null, null);
	}

	@Override
	public DailyAccountDetail dailyAccountSnapshot(WalletType type, Long startTime, Long endTime, Integer limit) {
		long timestamp = System.currentTimeMillis();
		return executeSync(binanceApiService.getDailyAccountSnapshot(type, startTime, endTime, limit,
				BinanceApiConstants.DEFAULT_RECEIVING_WINDOW, timestamp));
	}

}