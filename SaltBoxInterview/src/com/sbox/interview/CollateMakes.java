package com.sbox.interview;

public class CollateMakes {
	private final String country;
	private int uncommon_makes = 0;
	private int common_makes = 0;

	public CollateMakes(String country) {
		this.country = country;
	}

	public int getUncommon_makes() {
		return uncommon_makes;
	}

	public void incrementUncommon_makes() {
		uncommon_makes++;
	}

	public int getCommon_makes() {
		return common_makes;
	}

	public void incrementCommon_makes() {
		common_makes++;
	}

	public String getCountry() {
		return country;
	}
}
