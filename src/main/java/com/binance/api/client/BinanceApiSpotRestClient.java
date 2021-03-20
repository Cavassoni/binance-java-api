package com.binance.api.client;

import com.binance.api.client.domain.WalletType;
import com.binance.api.client.domain.account.DailyAccountDetail;

public interface BinanceApiSpotRestClient {

	/**
	 * Daily Account Snapshot
	 *
	 * @return
	 */
	DailyAccountDetail dailyAccountSnapshot(WalletType type, Long startTime, Long endTime, Integer limit);
	
	DailyAccountDetail dailyAccountSnapshot(WalletType type);

}
