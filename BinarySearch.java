class BinarySearch
{
  public static void binarySearch(int arr[], int beg, int end, int key)
  {
      int mid = (beg + end)/2;  
      while( beg <= end )
      {
          if ( arr[mid] < key )
          {
            beg = mid + 1;     
          }
          else if( arr[mid] == key )
          {
            System.out.println("Element found at index: " + mid);  
            break;  
          }
          else
          {
            end = mid - 1;  
          }
          mid = (beg + end)/2;  
      }
      if ( beg > end )
      {
          System.out.println("Element not found!");
      }
  }  
 public static void main(String args[])
 {
        int arr[] = {1,2,3,4,5};  
        int key = 4;  
        int end=arr.length-1;  
        binarySearch(arr,0,end,key);
      }  
}  