package sort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list={34,3,53,2,23,7,14,10};  
        QuickSort qs=new QuickSort();  
        qs.quick(list); 
        System.out.println("øÏÀŸ≈≈–Ú£∫");
        printArray(list);
       
        int[] list2={34,3,53,2,23,7,14,10}; 
        
        BubbleSort bs=new BubbleSort();
        bs.bubbleSort(list2);
        System.out.println("√∞≈›≈≈–Ú£∫");
        printArray2(list2);
        
        SelectSort ss=new SelectSort();
        ss.selectSort(list2);
        System.out.println("—°‘Ò≈≈–Ú£∫");
        printArray2(list2);
        
        InsertSort is=new InsertSort();
        is.insertSort(list2);
        System.out.println("≤Â»Î≈≈–Ú£∫");
        printArray2(list2);
        
        ShellSort Ss=new ShellSort();
        Ss.shellSort(list2);
        System.out.println("œ£∂˚≈≈–Ú£∫");
        printArray2(list2);
	}
	 public static void printArray(Integer[] array){  
         System.out.print("{");  
         for (int i = 0; i < array.length; i++) {  
             System.out.print(array[i]);  
             if (i < array.length - 1) {  
                 System.out.print(", ");  
             }  
         }  
         System.out.println("}");  
     } 
     
     
     public static void printArray2(int[] array) {  
         System.out.print("{");  
         for (int i = 0; i < array.length; i++) {  
             System.out.print(array[i]);  
             if (i < array.length - 1) {  
                 System.out.print(", ");  
             }  
         }  
         System.out.println("}"); 
     } 
}
