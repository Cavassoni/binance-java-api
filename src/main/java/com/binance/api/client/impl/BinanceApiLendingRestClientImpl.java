package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiLendingRestClient;
import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.StatusFlexibleProduct;
import com.binance.api.client.domain.account.AllCoinsInformation;
import com.binance.api.client.domain.account.FlexibleProduct;
import com.binance.api.client.domain.account.LendingAccount;

import java.util.List;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

/**
 * Implementation of Binance's SWAP REST API using Retrofit method calls.
 */
public class BinanceApiLendingRestClientImpl implements BinanceApiLendingRestClient {

    private final BinanceApiService binanceApiService;

    public BinanceApiLendingRestClientImpl(String apiKey, String secret) {
        binanceApiService = createService(BinanceApiService.class, apiKey, secret);
    }

    @Override
    public List<FlexibleProduct> getFlexibleProductList(StatusFlexibleProduct status, String featured) {
        long timestamp = System.currentTimeMillis();
        return executeSync(binanceApiService.getFlexibleProductList(status, featured,
                BinanceApiConstants.DEFAULT_RECEIVING_WINDOW, timestamp));
    }

    @Override
    public List<FlexibleProduct> getFlexibleProductList(StatusFlexibleProduct status) {
        return getFlexibleProductList(status, null);
    }

    @Override
    public List<FlexibleProduct> getFlexibleProductList() {
        return getFlexibleProductList(null, null);
    }

    @Override
    public LendingAccount getLendingAccount() {
        long timestamp = System.currentTimeMillis();
        return executeSync(
                binanceApiService.getLendingAccount(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW, timestamp));
    }

    @Override
    public List<AllCoinsInformation> getAllCoinsInformation() {
        long timestamp = System.currentTimeMillis();
        return executeSync(
                binanceApiService.getAllCoinsInformation(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW, timestamp));
    }

}