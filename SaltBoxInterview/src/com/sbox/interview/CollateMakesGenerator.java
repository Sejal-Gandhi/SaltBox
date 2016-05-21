package com.sbox.interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollateMakesGenerator {
	private static final String COMMON = "1";
	private final Map<String, CollateMakes> collateMakeMap = new HashMap<String, CollateMakes>();

	public Collection<CollateMakes> generateCollateMakes(
			final CollateData inputData) {

		for (final CollateDataRecord dataRecord : inputData.records) {
			final String makeCountry = dataRecord.makeCountry;
			final CollateMakes makeRecord = collateMakeMap
					.containsKey(makeCountry) ? collateMakeMap.get(makeCountry)
					: new CollateMakes(makeCountry);
			if (COMMON.equals(dataRecord.makeIsCommon)) {
				makeRecord.incrementCommon_makes();
			} else {
				makeRecord.incrementUncommon_makes();
			}
			collateMakeMap.put(makeCountry, makeRecord);
		}
		return collateMakeMap.values();
	}
}
