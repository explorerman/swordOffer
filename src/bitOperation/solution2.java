package bitOperation;

public class solution2 {

	/**
	 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
	 * @param base
	 * @param exponent
	 * @return
	 */
	//传统公式，只是x^y==y个x相乘
	public double Power(double base, int exponent) {
        double result = 1;
        for(int i = 0; i < Math.abs(exponent); i++){
        	result *= base;
        }
        if(exponent < 0){
        	result = 1 / result;
        }
        return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
