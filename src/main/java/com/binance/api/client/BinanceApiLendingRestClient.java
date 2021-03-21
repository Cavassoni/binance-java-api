package com.binance.api.client;

import java.util.List;

import com.binance.api.client.domain.StatusFlexibleProduct;
import com.binance.api.client.domain.account.AllCoinsInformation;
import com.binance.api.client.domain.account.FlexibleProduct;
import com.binance.api.client.domain.account.LendingAccount;

public interface BinanceApiLendingRestClient {

	/**
	 * Get Flexible Product List
	 *
	 * @return
	 */
	List<FlexibleProduct> getFlexibleProductList(StatusFlexibleProduct status, String featured);

	List<FlexibleProduct> getFlexibleProductList(StatusFlexibleProduct status);

	List<FlexibleProduct> getFlexibleProductList();

	LendingAccount getLendingAccount();

	List<AllCoinsInformation> getAllCoinsInformation();

}
