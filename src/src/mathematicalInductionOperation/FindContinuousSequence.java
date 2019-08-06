package mathematicalInductionOperation;

import java.util.ArrayList;

public class FindContinuousSequence {

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		//������㣬�䵱�������ڵı߽磬���ݴ����ڵ�ֵ�ĺ���ȷ�����ڵ�λ�úʹ�С
		int pLow = 1, pHigh = 2;
		while(pHigh > pLow){
			//�����������ģ���Ϊ1�ĵȲ����У���͹�ʽΪ����a0+an��* (an-a0 + 1) / 2
			int cur = (pHigh + pLow) * (pHigh - pLow + 1) / 2; 
			//�����������ڵ�ֵ�ĺ͵��ڽ�����򽫸û��������ڵ�ֵ��ӵ�һά�б��У����ӵ�result��ά�б��С�
			if(cur == sum){
				ArrayList<Integer> list = new ArrayList<>();
				for(int i = pLow; i <= pHigh; i++){
					list.add(i);
				}
				result.add(list);
				pLow++;   
			}else if(cur < sum){ //�����ǰ�����ڵ�ֵС��sum�����λ����һλ��
				pHigh++;
			}else if(cur > sum){  //�����ǰ���ڵ�ֵ����sum�����λ�ƶ�һλ
				pLow++;
			}
		}
		return result;
    }
	public static void main(String[] args) {
	}
}
