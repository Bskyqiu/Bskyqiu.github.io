package sort;
public class ShellSort{  
    static void sort(int[] array) {  
        int out, in, tmp;  
        int len = array.length;  
        int h = 1;   
        while(h < len / 3) // ������h���ֵ  
            h = h * 3 + 1;  
          
        while(h > 0){ // �ܷ����ͨ����С���h���ָ������е��ж�  
           
            for(out = h; out < len; out++){ // ���ͨ��outȷ��ÿ���������ĵڶ���������  
                // ���´�����Ƕ������н��еĲ��������㷨  
                tmp = array[out];  
                in = out;  
               
                while(in > h -1 && array[in - h] >= tmp){  
                    array[in] = array[in - h];  
                    in -= h;  
                }  
                array[in] = tmp;  
            }  
              
            // ��С���  
            h = (h - 1) / 3;  
        }  
    }  
}  
