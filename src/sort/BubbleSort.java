package sort;

public class BubbleSort {
	//ð������ĺ��Ĵ���:ð������ķ���
		public void bubbleSort(int[]array){
			for(int i=0;i<array.length-1;i++){
				for(int j=0;j<array.length-i-1;j++){
					if(array[j]>array[j+1]){
						swap(j,j+1,array);
					}
				}
			}
		}
		//��������Ĵ���
		private void swap(int oneIndex,int anotherIndex,int[]array){
			int temp = array[oneIndex];
			array[oneIndex]=array[anotherIndex];
			array[anotherIndex] = temp;
		}
}
