package com.sbox.interview;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollateData {
	@JsonProperty("Makes")
	public Collection<CollateDataRecord> records;
}
