package dpOperation;

public class solution1 {

	/**
	 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
	 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
	 * @param n
	 * @return
	 */
	int climbStairs(int n){
		if(n <= 2) return n;
		//�߽�����
		int a = 1;
		int b = 2;
		int result = 0;
		for(int i = 3; i < n; i++){
			result = a + b;
			a = b;
			b = result;
		}
		return result;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
