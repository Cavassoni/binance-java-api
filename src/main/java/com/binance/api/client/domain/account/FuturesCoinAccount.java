package com.binance.api.client.domain.account;

import com.binance.api.client.domain.general.Asset;

import java.util.List;

public class FuturesCoinAccount {
    public List<AssetFutures> assets;
    public List<Position> positions;
    public Boolean canDeposit;
    public Boolean canTrade;
    public Boolean canWithdraw;
    public Long feeTier;
    public Long updateTime;

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

    public Boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(Boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public Long getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(Long feeTier) {
        this.feeTier = feeTier;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
