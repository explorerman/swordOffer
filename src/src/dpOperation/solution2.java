package dpOperation;

public class solution2 {

	/**
	 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,
	 * ���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,
	 * ������ȫΪ������ʱ��,����ܺý��������,��������а�������,
	 * �Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
	 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
	 * ��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
	 * @param array
	 * @return
	 */
	public int FindGreatestSumOfSubArray(int[] array) {
        int res = Integer.MIN_VALUE;  //�������ս��
        int max = 0; 				//���浱ǰ�ֲ����ֵ
        for(int i = 0; i < array.length; i++){
        	max = Math.max(array[i] + max, array[i]);
        	res = Math.max(max, res);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
