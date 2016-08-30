package sort;
public class ShellSort{  
    static void sort(int[] array) {  
        int out, in, tmp;  
        int len = array.length;  
        int h = 1;   
        while(h < len / 3) // 计算间隔h最大值  
            h = h * 3 + 1;  
          
        while(h > 0){ // 能否继续通过缩小间隔h来分割数据列的判定  
           
            for(out = h; out < len; out++){ // 外层通过out确定每组插入排序的第二个数据项  
                // 以下代码就是对子序列进行的插入排序算法  
                tmp = array[out];  
                in = out;  
               
                while(in > h -1 && array[in - h] >= tmp){  
                    array[in] = array[in - h];  
                    in -= h;  
                }  
                array[in] = tmp;  
            }  
              
            // 缩小间隔  
            h = (h - 1) / 3;  
        }  
    }  
}  
