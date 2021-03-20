package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiUsdFuturesRestClient;
import com.binance.api.client.config.BinanceApiConfig;
import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.account.FuturesUsdAccount;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

public class BinanceApiUsdFuturesRestClientImpl implements BinanceApiUsdFuturesRestClient {
    private final BinanceApiService binanceApiService;

    public BinanceApiUsdFuturesRestClientImpl(String apiKey, String secret) {
        binanceApiService = createService(BinanceApiService.class, apiKey, secret, BinanceApiConfig.getFapiBaseUrl());
    }

    @Override
    public FuturesUsdAccount getFuturesUsdAccount() {
        long timestamp = System.currentTimeMillis();
        return executeSync(
                binanceApiService.getFuturesUsdAccount(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW, timestamp));
    }
}
