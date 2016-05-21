package com.sbox.interview;

import java.util.Collection;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CollateMakesTester {
	public boolean testCollateMakes(final CollateData input,
			final Collection<CollateMakes> expectedOutput) throws Exception {
		final ObjectMapper mapper = new ObjectMapper();
		final CollateMakesGenerator generator = new CollateMakesGenerator();
		final Collection<CollateMakes> result = generator
				.generateCollateMakes(input);
		final String resultValue = mapper.writeValueAsString(result);
		final String expectedValue = mapper.writeValueAsString(expectedOutput);
		return resultValue.equals(expectedValue);
	}
}
