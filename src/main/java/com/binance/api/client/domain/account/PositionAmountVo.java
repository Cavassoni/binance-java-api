package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionAmountVo {
	private String amount;
	private String amountInBTC;
	private String amountInUSDT;
	private String asset;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountInBTC() {
		return amountInBTC;
	}

	public void setAmountInBTC(String amountInBTC) {
		this.amountInBTC = amountInBTC;
	}

	public String getAmountInUSDT() {
		return amountInUSDT;
	}

	public void setAmountInUSDT(String amountInUSDT) {
		this.amountInUSDT = amountInUSDT;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
}