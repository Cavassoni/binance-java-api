package com.binance.api.client.domain.account;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	private List<Balance> balances;
	private String totalAssetOfBtc;

	public List<Balance> getBalances() {
		return balances;
	}

	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}

	public String getTotalAssetOfBtc() {
		return totalAssetOfBtc;
	}
	
	public void setTotalAssetOfBtc(String totalAssetOfBtc) {
		this.totalAssetOfBtc = totalAssetOfBtc;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
}
