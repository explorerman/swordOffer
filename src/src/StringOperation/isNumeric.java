package StringOperation;

public class isNumeric {
		/*
		���¶�������н���:
		[\\+\\-]?            -> ���򸺷��ų������
		\\d*                 -> ���������Ƿ���֣���-.34 �� +3.34������
		(\\.\\d+)?           -> �������С���㣬��ôС���������������֣�
		                        ����һ�𲻳���
		([eE][\\+\\-]?\\d+)? -> �������ָ�����֣���ôe��E�϶����֣�+��-���Բ����֣�
		                        �����ű�����������������������ֶ�������
		*/
	public boolean isNumeric(char[] str) {

		String string = String.valueOf(str);
		return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
	}

	public static void main(String[] args) {
	}

}
