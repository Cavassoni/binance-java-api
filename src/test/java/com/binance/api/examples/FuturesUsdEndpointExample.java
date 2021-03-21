package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiUsdFuturesRestClient;
import com.binance.api.client.domain.account.FuturesUsdAccount;

public class FuturesUsdEndpointExample {

    public static String API_KEY = "";
    public static String SECRET_KEY = "";

    public static void main(String[] args) {

        BinanceApiClientFactory binanceApiClientFactory = BinanceApiClientFactory.newInstance(API_KEY, SECRET_KEY);
        BinanceApiUsdFuturesRestClient futuresCoin = binanceApiClientFactory.newUsdFuturesRestClient();

//		List<FlexibleProduct> detail = lendingClient.getFlexibleProductList(StatusFlexibleProduct.ALL);
//		System.out.println(detail);

        FuturesUsdAccount res = futuresCoin.getFuturesUsdAccount();
        System.out.println(res);
    }

}
