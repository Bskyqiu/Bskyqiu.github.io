package sort;

public class BubbleSort {
	//冒泡排序的核心代码:冒泡排序的方法
		public void bubbleSort(int[]array){
			for(int i=0;i<array.length-1;i++){
				for(int j=0;j<array.length-i-1;j++){
					if(array[j]>array[j+1]){
						swap(j,j+1,array);
					}
				}
			}
		}
		//交换数组的代码
		private void swap(int oneIndex,int anotherIndex,int[]array){
			int temp = array[oneIndex];
			array[oneIndex]=array[anotherIndex];
			array[anotherIndex] = temp;
		}
}
