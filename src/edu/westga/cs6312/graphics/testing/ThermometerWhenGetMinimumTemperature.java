package edu.westga.cs6312.graphics.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.westga.cs6312.graphics.model.Thermometer;

public class ThermometerWhenGetMinimumTemperature {
	public void createThermometerObjectAndReturnMinimumTemperature0() {
		int minTemperature = 0;
		int currentTemperature = 50;
		int maximumTemperature = 100;
		Thermometer testTemometer = new Thermometer(minTemperature, currentTemperature, maximumTemperature);
		assertEquals(currentTemperature, testTemometer.getMinimumTemperature());
	}

	public void createThermometerObjectAndReturnMinimumTemperatureNegative45() {
		int minTemperature = -45;
		int currentTemperature = 50;
		int maximumTemperature = 100;
		Thermometer testTemometer = new Thermometer(minTemperature, currentTemperature, maximumTemperature);
		assertEquals(minTemperature, testTemometer.getMinimumTemperature());
	}

	public void createThermometerObjectAndReturnMinimumTemperature25() {
		int minTemperature = 25;
		int currentTemperature = 50;
		int maximumTemperature = 100;
		Thermometer testTemometer = new Thermometer(minTemperature, currentTemperature, maximumTemperature);
		assertEquals(minTemperature, testTemometer.getMinimumTemperature());
	}
}
