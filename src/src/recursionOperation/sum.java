package recursionOperation;

public class sum {

	//���õݹ���1+2...n�ĺ�
	/**
	 * ˼·���ݹ���ʵ��������˼·�ķ�ʽ�෴��
	 * ʵ�������мӷ��Ǵ�1+n���ڵݹ��У��Ǵ�n+1
	 * �����еݹ�ĳ����ǵ�n�ӵ�1,0��ʱ��
	 * @param n
	 * @return
	 */
	public static int Sum_Solution(int n){
		int sum = n;
		if(n <= 0) return 0;
		if(n == 1) return 1;
		return sum + Sum_Solution(n-1);
	}
	public static void main(String[] args) {
		int n = Sum_Solution(5);
		System.out.println(n);

	}

}
