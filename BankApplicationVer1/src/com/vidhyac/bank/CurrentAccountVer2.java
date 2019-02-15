package com.vidhyac.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan Bima";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

}
