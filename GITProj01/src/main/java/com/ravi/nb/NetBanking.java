package com.ravi.nb;

public class NetBanking {

	public String transferMoney(long srcAccno,long decAccno,double amount,String getWay) {
		return amount+" amount is transfered from "+srcAccno+" to "+decAccno+" using getway "+getWay;
	}
}
