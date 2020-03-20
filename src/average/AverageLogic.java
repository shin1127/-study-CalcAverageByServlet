// 受け取った変数から平均値を算出するクラス
package average;

public class AverageLogic {
	public void execute(Number number) {

		// 平均値を算出して設定
		double firstNumber = number.getFirstNumber();
		double secondNumber = number.getSecondNumber();
		double thirdNumber = number.getThirdNumber();
		double average = (firstNumber + secondNumber + thirdNumber) / 3;
		number.setAverage(average);
	}
}

