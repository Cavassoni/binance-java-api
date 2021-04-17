package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllCoinsInformation {
    public String coin;
    public Boolean depositAllEnable;
    public String free;
    public String freeze;
    public String ipoable;
    public String ipoing;
    public Boolean isLegalMoney;
    public String locked;
    public String name;
    public List<NetworkList> networkList;
    public String storage;
    public Boolean trading;
    public Boolean withdrawAllEnable;
    public String withdrawing;

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public Boolean getDepositAllEnable() {
        return depositAllEnable;
    }

    public void setDepositAllEnable(Boolean depositAllEnable) {
        this.depositAllEnable = depositAllEnable;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getFreeze() {
        return freeze;
    }

    public void setFreeze(String freeze) {
        this.freeze = freeze;
    }

    public String getIpoable() {
        return ipoable;
    }

    public void setIpoable(String ipoable) {
        this.ipoable = ipoable;
    }

    public String getIpoing() {
        return ipoing;
    }

    public void setIpoing(String ipoing) {
        this.ipoing = ipoing;
    }

    public Boolean getLegalMoney() {
        return isLegalMoney;
    }

    public void setLegalMoney(Boolean legalMoney) {
        isLegalMoney = legalMoney;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NetworkList> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<NetworkList> networkList) {
        this.networkList = networkList;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Boolean getTrading() {
        return trading;
    }

    public void setTrading(Boolean trading) {
        this.trading = trading;
    }

    public Boolean getWithdrawAllEnable() {
        return withdrawAllEnable;
    }

    public void setWithdrawAllEnable(Boolean withdrawAllEnable) {
        this.withdrawAllEnable = withdrawAllEnable;
    }

    public String getWithdrawing() {
        return withdrawing;
    }

    public void setWithdrawing(String withdrawing) {
        this.withdrawing = withdrawing;
    }
}
