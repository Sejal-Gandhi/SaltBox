package com.sbox.interview;

import java.io.File;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Executor {
	public static void main(String[] args) {
		final ObjectMapper mapper = new ObjectMapper();
		try {
			generateMakes(mapper);
			testMakes(mapper);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testMakes(ObjectMapper mapper) throws Exception {
		final CollateMakesTester tester = new CollateMakesTester();
		final File inputTestFile = new File(".//data//SampleInput.json");
		final CollateData inputTestData = mapper.readValue(inputTestFile,
				CollateData.class);
		final File outputTestFile = new File(".//data//ExpectedOutput.json");
		final Collection<CollateMakes> outputTestData = mapper.readValue(
				outputTestFile, Collection.class);
		final boolean testResult = tester.testCollateMakes(inputTestData,
				outputTestData);
		System.out.println("The result of the test is " + testResult);
	}

	private static void generateMakes(ObjectMapper mapper) throws Exception {
		final File inputFile = new File(".//data//FullCarsData.json");
		final CollateData inputData = mapper.readValue(inputFile,
				CollateData.class);
		final CollateMakesGenerator generator = new CollateMakesGenerator();
		final Collection<CollateMakes> result = generator
				.generateCollateMakes(inputData);
		System.out.println(mapper.writeValueAsString(result));
	}
}
