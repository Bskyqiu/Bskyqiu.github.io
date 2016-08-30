package sort;

public class SelectSort {
	//选择排序核心代码
	public void selectSort(int[]array){
	for(int i=0;i<array.length;i++){
		for(int j=i+1;j<array.length;j++){
			if(array[i]>array[j]){
				swap(i,j,array);
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
