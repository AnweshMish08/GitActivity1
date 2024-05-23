package com.acc.lkm.JavaDay1;

public class EncapsulationDemo {
	private String account_holder;
	private int CVV;
	private double balance;
	private int OTP;

	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getOTP() {
		return OTP;
	}

	public void setOTP(int oTP) {
		OTP = oTP;
	}

	public static void main(String[] args) {
		EncapsulationDemo encap = new EncapsulationDemo();
		encap.setAccount_holder("Aarav");
		encap.setBalance(10000.00);
		encap.setCVV(611);
		encap.setOTP(189);
		System.out.println(encap.getAccount_holder()+ "\n" + encap.getBalance() + "\n" + encap.getCVV() + "\n" + encap.getOTP());
		
	}
}
