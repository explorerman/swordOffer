package queueOperation;

import java.util.Comparator;
import java.util.PriorityQueue;

import javax.management.RuntimeErrorException;

public class solution {

	/**大顶堆的所有数据都小于小顶堆，这样就满足了排序
	 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
	如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
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
	
	public void Insert(Integer num) { //读取数据流
		count++;
		if((count & 1) == 0){  //偶数
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

    public Double GetMedian() {   //获取当前读取数据的中位数
        if(count == 0) throw new RuntimeErrorException(null, "数字应该大于0");
        double result; 
        if((count & 1) == 1){ //奇数
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
