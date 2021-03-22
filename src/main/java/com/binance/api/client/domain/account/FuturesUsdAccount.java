package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.general.Asset;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class FuturesUsdAccount {
    private Long feeTier;
    private Boolean canTrade;
    private Boolean canDeposit;
    private Boolean canWithdraw;
    private Long updateTime;
    private String totalInitialMargin;
    private String totalMaintMargin;
    private String totalWalletBalance;
    private String totalUnrealizedProfit;
    private String totalMarginBalance;
    private String totalPositionInitialMargin;
    private String totalOpenOrderInitialMargin;
    private String totalCrossWalletBalance;
    private String totalCrossUnPnl;
    private String availableBalance;
    private String maxWithdrawAmount;
    private List<AssetFutures> assets;
    private List<Position> positions;

    public Long getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(Long feeTier) {
        this.feeTier = feeTier;
    }

    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public Boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(Boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getTotalInitialMargin() {
        return totalInitialMargin;
    }

    public void setTotalInitialMargin(String totalInitialMargin) {
        this.totalInitialMargin = totalInitialMargin;
    }

    public String getTotalMaintMargin() {
        return totalMaintMargin;
    }

    public void setTotalMaintMargin(String totalMaintMargin) {
        this.totalMaintMargin = totalMaintMargin;
    }

    public String getTotalWalletBalance() {
        return totalWalletBalance;
    }

    public void setTotalWalletBalance(String totalWalletBalance) {
        this.totalWalletBalance = totalWalletBalance;
    }

    public String getTotalUnrealizedProfit() {
        return totalUnrealizedProfit;
    }

    public void setTotalUnrealizedProfit(String totalUnrealizedProfit) {
        this.totalUnrealizedProfit = totalUnrealizedProfit;
    }

    public String getTotalMarginBalance() {
        return totalMarginBalance;
    }

    public void setTotalMarginBalance(String totalMarginBalance) {
        this.totalMarginBalance = totalMarginBalance;
    }

    public String getTotalPositionInitialMargin() {
        return totalPositionInitialMargin;
    }

    public void setTotalPositionInitialMargin(String totalPositionInitialMargin) {
        this.totalPositionInitialMargin = totalPositionInitialMargin;
    }

    public String getTotalOpenOrderInitialMargin() {
        return totalOpenOrderInitialMargin;
    }

    public void setTotalOpenOrderInitialMargin(String totalOpenOrderInitialMargin) {
        this.totalOpenOrderInitialMargin = totalOpenOrderInitialMargin;
    }

    public String getTotalCrossWalletBalance() {
        return totalCrossWalletBalance;
    }

    public void setTotalCrossWalletBalance(String totalCrossWalletBalance) {
        this.totalCrossWalletBalance = totalCrossWalletBalance;
    }

    public String getTotalCrossUnPnl() {
        return totalCrossUnPnl;
    }

    public void setTotalCrossUnPnl(String totalCrossUnPnl) {
        this.totalCrossUnPnl = totalCrossUnPnl;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(String maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public List<AssetFutures> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetFutures> assets) {
        this.assets = assets;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .appendAsObjectToString(this)
                .build();
    }
}
