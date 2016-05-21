package com.sbox.interview;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollateDataRecord {
	@JsonProperty("make_id")
	public String makeId;

	@JsonProperty("make_display")
	public String makeDisplay;

	@JsonProperty("make_is_common")
	public String makeIsCommon;

	@JsonProperty("make_country")
	public String makeCountry;
}
