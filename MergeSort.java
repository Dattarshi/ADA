public class MergeSort
{
    void merge(int arr[], int beg, int mid, int end){  
    
        int l = mid - beg + 1;  
    int r = end - mid;  
    int LeftArr[] = new int [l];  
    int RightArr[] = new int [r];  
    
    for (int i=0; i<l; ++i)
    {
        LeftArr[i] = arr[beg + i];  
    } 
    for (int j=0; j<r; ++j)
    {
        RightArr[j] = arr[mid + 1+ j];  
    }
    int i = 0, j = 0;  
    int k = beg;  
    while (i<l && j<r)
    {
        if (LeftArr[i] <= RightArr[j])
        {
            arr[k] = LeftArr[i];
            i++;
        }  
        else{
            arr[k] = RightArr[j];  
            j++;  
        }  
        k++;  
    }  
    while (i<l)
    {
        arr[k] = LeftArr[i];  
        i++;  
        k++;  
    }  
    while (j<r)
    {
        arr[k] = RightArr[j];  
        j++;  
        k++;  
    }
}  
    void sort(int arr[], int beg, int end)
    {
        if (beg<end)
        {
            int mid = (beg+end)/2;  
            sort(arr, beg, mid);  
            sort(arr , mid+1, end);  
            merge(arr, beg, mid, end);  
        }
    }  
    public static void main(String args[])
    {
        int arr[] = {2,1,14,5,65,199,6,89,34,148};  
        System.out.println("\nUnSorted array");  
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");  
        }
        MergeSort ob = new MergeSort();  
        ob.sort(arr, 0, arr.length-1);  
             
        System.out.println("\nSorted array");  
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");  
        }  
    }  
}  