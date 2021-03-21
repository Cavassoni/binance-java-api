package com.binance.api.client.domain.account;

public class NetworkList {
    public String addressRegex;
    public String coin;
    public String depositDesc;
    public Boolean depositEnable;
    public Boolean isDefault;
    public String memoRegex;
    public Long minConfirm;
    public String name;
    public String network;
    public Boolean resetAddressStatus;
    public String specialTips;
    public Long unLockConfirm;
    public String withdrawDesc;
    public Boolean withdrawEnable;
    public String withdrawFee;
    public String withdrawMin;
    public Long updateTime;
    public String withdrawIntegerMultiple;
    public String withdrawMax;

    public String getAddressRegex() {
        return addressRegex;
    }

    public void setAddressRegex(String addressRegex) {
        this.addressRegex = addressRegex;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getDepositDesc() {
        return depositDesc;
    }

    public void setDepositDesc(String depositDesc) {
        this.depositDesc = depositDesc;
    }

    public Boolean getDepositEnable() {
        return depositEnable;
    }

    public void setDepositEnable(Boolean depositEnable) {
        this.depositEnable = depositEnable;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public String getMemoRegex() {
        return memoRegex;
    }

    public void setMemoRegex(String memoRegex) {
        this.memoRegex = memoRegex;
    }

    public Long getMinConfirm() {
        return minConfirm;
    }

    public void setMinConfirm(Long minConfirm) {
        this.minConfirm = minConfirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Boolean getResetAddressStatus() {
        return resetAddressStatus;
    }

    public void setResetAddressStatus(Boolean resetAddressStatus) {
        this.resetAddressStatus = resetAddressStatus;
    }

    public String getSpecialTips() {
        return specialTips;
    }

    public void setSpecialTips(String specialTips) {
        this.specialTips = specialTips;
    }

    public Long getUnLockConfirm() {
        return unLockConfirm;
    }

    public void setUnLockConfirm(Long unLockConfirm) {
        this.unLockConfirm = unLockConfirm;
    }

    public String getWithdrawDesc() {
        return withdrawDesc;
    }

    public void setWithdrawDesc(String withdrawDesc) {
        this.withdrawDesc = withdrawDesc;
    }

    public Boolean getWithdrawEnable() {
        return withdrawEnable;
    }

    public void setWithdrawEnable(Boolean withdrawEnable) {
        this.withdrawEnable = withdrawEnable;
    }

    public String getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(String withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    public String getWithdrawMin() {
        return withdrawMin;
    }

    public void setWithdrawMin(String withdrawMin) {
        this.withdrawMin = withdrawMin;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getWithdrawIntegerMultiple() {
        return withdrawIntegerMultiple;
    }

    public void setWithdrawIntegerMultiple(String withdrawIntegerMultiple) {
        this.withdrawIntegerMultiple = withdrawIntegerMultiple;
    }

    public String getWithdrawMax() {
        return withdrawMax;
    }

    public void setWithdrawMax(String withdrawMax) {
        this.withdrawMax = withdrawMax;
    }
}
