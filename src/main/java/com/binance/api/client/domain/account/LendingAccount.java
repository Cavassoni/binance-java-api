package com.binance.api.client.domain.account;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LendingAccount {

	private List<PositionAmountVo> positionAmountVos = null;
	private String totalAmountInBTC;
	private String totalAmountInUSDT;
	private String totalFixedAmountInBTC;
	private String totalFixedAmountInUSDT;
	private String totalFlexibleInBTC;
	private String totalFlexibleInUSDT;

	public List<PositionAmountVo> getPositionAmountVos() {
		return positionAmountVos;
	}

	public void setPositionAmountVos(List<PositionAmountVo> positionAmountVos) {
		this.positionAmountVos = positionAmountVos;
	}

	public String getTotalAmountInBTC() {
		return totalAmountInBTC;
	}

	public void setTotalAmountInBTC(String totalAmountInBTC) {
		this.totalAmountInBTC = totalAmountInBTC;
	}

	public String getTotalAmountInUSDT() {
		return totalAmountInUSDT;
	}

	public void setTotalAmountInUSDT(String totalAmountInUSDT) {
		this.totalAmountInUSDT = totalAmountInUSDT;
	}

	public String getTotalFixedAmountInBTC() {
		return totalFixedAmountInBTC;
	}

	public void setTotalFixedAmountInBTC(String totalFixedAmountInBTC) {
		this.totalFixedAmountInBTC = totalFixedAmountInBTC;
	}

	public String getTotalFixedAmountInUSDT() {
		return totalFixedAmountInUSDT;
	}

	public void setTotalFixedAmountInUSDT(String totalFixedAmountInUSDT) {
		this.totalFixedAmountInUSDT = totalFixedAmountInUSDT;
	}

	public String getTotalFlexibleInBTC() {
		return totalFlexibleInBTC;
	}

	public void setTotalFlexibleInBTC(String totalFlexibleInBTC) {
		this.totalFlexibleInBTC = totalFlexibleInBTC;
	}

	public String getTotalFlexibleInUSDT() {
		return totalFlexibleInUSDT;
	}

	public void setTotalFlexibleInUSDT(String totalFlexibleInUSDT) {
		this.totalFlexibleInUSDT = totalFlexibleInUSDT;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
}