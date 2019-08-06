package queueOperation;

import java.util.Comparator;
import java.util.PriorityQueue;

import javax.management.RuntimeErrorException;

public class solution {

	/**�󶥶ѵ��������ݶ�С��С���ѣ�����������������
	 * ������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
	������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
	 * @param num
	 */
	int count;
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
	});
	
	public void Insert(Integer num) { //��ȡ������
		count++;
		if((count & 1) == 0){  //ż��
			if(!maxHeap.isEmpty() && num < maxHeap.peek()){
				maxHeap.offer(num);
				num = maxHeap.poll();
			}
			minHeap.offer(num);
		}else{
			if(!minHeap.isEmpty() && num > minHeap.peek()){
				minHeap.offer(num);
				num = minHeap.poll();
			}
			maxHeap.offer(num);
		}
    }

    public Double GetMedian() {   //��ȡ��ǰ��ȡ���ݵ���λ��
        if(count == 0) throw new RuntimeErrorException(null, "����Ӧ�ô���0");
        double result; 
        if((count & 1) == 1){ //����
        	result = maxHeap.peek();
        }else{
        	result = (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
