package selectsort;

import java.util.Arrays;

public class selectSort {
	public static void main(String[] args) {
		/*
		 * ѡ�����򣺴ӵ�һ��Ԫ�ؿ�ʼ�����κͺ����ÿ��Ԫ�رȽϣ�С�ķŵ�ǰ�ߣ�
		��һ�αȽ���ɣ���Сֵ���֣��Դ�����
		select����Сֵ����ǰ��bobble�����ֵ�ź�
		*/
		int[] arrays = {98,97,96,95,94,93,92,91};
		for(int i=0;i<arrays.length-1;i++) {
			for(int j=i+1;j<arrays.length;j++) {
				if(arrays[i]>arrays[j]) {
					int temp = arrays[j];
					arrays[j] = arrays[i];
					arrays[i] = temp;
				}
			}
			System.out.println(Arrays.toString(arrays));
		}
		
	}

}
/*���
[91, 92, 98, 97, 96, 95, 94, 93]
[91, 92, 93, 98, 97, 96, 95, 94]
[91, 92, 93, 94, 98, 97, 96, 95]
[91, 92, 93, 94, 95, 98, 97, 96]
[91, 92, 93, 94, 95, 96, 98, 97]
[91, 92, 93, 94, 95, 96, 97, 98]*/