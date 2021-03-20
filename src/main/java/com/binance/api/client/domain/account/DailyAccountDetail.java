package com.binance.api.client.domain.account;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DailyAccountDetail {
	private Long code;
	private String msg;
	private List<SnapshotVo> snapshotVos;

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<SnapshotVo> getSnapshotVos() {
		return snapshotVos;
	}

	public void setSnapshotVos(List<SnapshotVo> snapshotVos) {
		this.snapshotVos = snapshotVos;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}

}
