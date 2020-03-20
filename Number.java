// 入力される変数に関するJAVABEANS

package average;

import java.io.Serializable;

public class Number implements Serializable {

	private double firstNumber;
	private double secondNumber;
	private double thirdNumber;
	private double average;



	public double getFirstNumber() {
		return firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public double getThirdNumber() {
		return thirdNumber;
	}
	public double getAverage() {
		return average;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public void setThirdNumber(double thirdNumber) {
		this.thirdNumber = thirdNumber;
	}
	public void setAverage(double average) {
		this.average = average;
	}
}
