package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlexibleProduct {

	private String asset;
	private String avgAnnualInterestRate;
	private Boolean canPurchase;
	private Boolean canRedeem;
	private String dailyInterestPerThousand;
	private Boolean featured;
	private String minPurchaseAmount;
	private String productId;
	private String purchasedAmount;
	private String status;
	private String upLimit;
	private String upLimitPerUser;

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public String getAvgAnnualInterestRate() {
		return avgAnnualInterestRate;
	}

	public void setAvgAnnualInterestRate(String avgAnnualInterestRate) {
		this.avgAnnualInterestRate = avgAnnualInterestRate;
	}

	public Boolean getCanPurchase() {
		return canPurchase;
	}

	public void setCanPurchase(Boolean canPurchase) {
		this.canPurchase = canPurchase;
	}

	public Boolean getCanRedeem() {
		return canRedeem;
	}

	public void setCanRedeem(Boolean canRedeem) {
		this.canRedeem = canRedeem;
	}

	public String getDailyInterestPerThousand() {
		return dailyInterestPerThousand;
	}

	public void setDailyInterestPerThousand(String dailyInterestPerThousand) {
		this.dailyInterestPerThousand = dailyInterestPerThousand;
	}

	public Boolean getFeatured() {
		return featured;
	}

	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	public String getMinPurchaseAmount() {
		return minPurchaseAmount;
	}

	public void setMinPurchaseAmount(String minPurchaseAmount) {
		this.minPurchaseAmount = minPurchaseAmount;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPurchasedAmount() {
		return purchasedAmount;
	}

	public void setPurchasedAmount(String purchasedAmount) {
		this.purchasedAmount = purchasedAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpLimit() {
		return upLimit;
	}

	public void setUpLimit(String upLimit) {
		this.upLimit = upLimit;
	}

	public String getUpLimitPerUser() {
		return upLimitPerUser;
	}

	public void setUpLimitPerUser(String upLimitPerUser) {
		this.upLimitPerUser = upLimitPerUser;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}

}