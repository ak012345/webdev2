/**
 * 
 */

package edu.westga.cs6312.graphics.model;

/**
 * The Thermometer model class represents the thermometer to be drawn in the
 * windows
 * 
 * @author Alex Kernan
 * @version Apr 5, 2021
 *
 */
public class Thermometer {

	private int minTemperature;
	private int maxTemperature;
	private int currentTemperature;
/**
 *  The Temperature model class' constructor method
 * 
 * @param inputMinTemperature The minimum temperature value to be shown on the thermometer graphic
 * @param inputMaxTemperature The maximum temperature value to be shown on the thermometer graphic
 * @param inputCurrentTemperature The current temperature value to be shown on the thermometer graphic
 */
	public void Thermomenter(int inputMinTemperature,int inputMaxTemperature,int inputCurrentTemperature) {
		this.minTemperature = inputMinTemperature;
		this.maxTemperature = inputMaxTemperature;
		this.currentTemperature = inputCurrentTemperature;
	}
	
	/**
	 * Getter method that returns the minimum temperature to be shown on the graphic.  
	 * 
	 * @return The minimum temperature on the thermometer
	 */
	public int getMinimumTemperature() {
		return this.minTemperature;
	}
	
	/**
	 * 
	 * @return The maximum temperature on the thermometer
	 */
	public int getMaximumTemperature() {
		return this.maxTemperature;
	}

	/**
	 * 
	 * @return the current temperature
	 */
	public int getCurrentTemperature() {
		return this.currentTemperature;
	}

	
}
