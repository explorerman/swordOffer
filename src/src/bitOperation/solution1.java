package bitOperation;

public class solution1 {

	/**
	 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
	 * @param args
	 */
	public int NumberOf1(int n) {
		int count = 0;
		while(n != 0){
			if((n & 1) > 0){
				count++;
			}
			//����һ��Ҫ��Ԫ������
			n = n >>> 1;
		}
		return count;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
