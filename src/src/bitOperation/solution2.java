package bitOperation;

public class solution2 {

	/**
	 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
	 * @param base
	 * @param exponent
	 * @return
	 */
	//��ͳ��ʽ��ֻ��x^y==y��x���
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
