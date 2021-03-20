package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiCoinFuturesRestClient;
import com.binance.api.client.BinanceApiUsdFuturesRestClient;
import com.binance.api.client.config.BinanceApiConfig;
import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.account.FuturesCoinAccount;
import com.binance.api.client.domain.account.FuturesUsdAccount;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

public class BinanceApiCoinFuturesRestClientImpl implements BinanceApiCoinFuturesRestClient {
    private final BinanceApiService binanceApiService;

    public BinanceApiCoinFuturesRestClientImpl(String apiKey, String secret) {
        binanceApiService = createService(BinanceApiService.class, apiKey, secret, BinanceApiConfig.getDapiBaseUrl());
    }

    @Override
    public FuturesCoinAccount getFuturesCoinAccount() {
        long timestamp = System.currentTimeMillis();
        return executeSync(
                binanceApiService.getFuturesCoinAccount(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW, timestamp));
    }
}
