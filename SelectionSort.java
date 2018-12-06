public class SelectionSort {
	 //private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    
       
    public int[] basicSelectionSort(int[] arr) {
    	for (int i = 0; i < arr.length - 1; i++)
    		{
    		    int index = i;
    		    for (int j = i + 1; j < arr.length; j++){
    		        if (arr[j] < arr[index]) 
    		            index = j;
    		    }// end of inner for loop
    		    int smallerNumber = arr[index];  
    		    arr[index] = arr[i];
    		    arr[i] = smallerNumber;
    		}// end of outer for loop
    		return arr;
    }// end of basicSelectionSort method
}

