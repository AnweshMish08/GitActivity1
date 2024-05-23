package com.acc.lkm.Polymorphism;

import java.util.Date;

public class PaymentMode {
	public String Process_Payment(Date Payment_Date, String Mode1, String Mode2) {
		String dt = String.valueOf(Payment_Date);
		return Mode1 + "\n" + Mode2 + "\n" + dt;
	}
	
	public String Process_Payment(Date Payment_Date, String Mode1, String Mode2, String Mode3) {
		String dt = String.valueOf(Payment_Date);
		return Mode1 + "\n" + Mode2 + "\n" + Mode3 + "\n" + dt;
	}
	
	public static void main(String[] args) {
		PaymentMode paymentMode1 = new PaymentMode();
		PaymentMode paymentMode2 = new PaymentMode();
		System.out.println(paymentMode1.Process_Payment(new Date(), "CreditCard", "DebitCard"));
		System.out.println(paymentMode2.Process_Payment(new Date(), "CreditCard", "DebitCard", "Digital Payment : GPay"));
	}
}
