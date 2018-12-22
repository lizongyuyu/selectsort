package selectsort;

import java.util.Arrays;

public class selectSort {
	public static void main(String[] args) {
		/*
		 * 选择排序：从第一个元素开始，依次和后面的每个元素比较，小的放到前边，
		第一次比较完成，最小值出现，以此类推
		select把最小值放在前，bobble把最大值放后
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
/*结果
[91, 92, 98, 97, 96, 95, 94, 93]
[91, 92, 93, 98, 97, 96, 95, 94]
[91, 92, 93, 94, 98, 97, 96, 95]
[91, 92, 93, 94, 95, 98, 97, 96]
[91, 92, 93, 94, 95, 96, 98, 97]
[91, 92, 93, 94, 95, 96, 97, 98]*/