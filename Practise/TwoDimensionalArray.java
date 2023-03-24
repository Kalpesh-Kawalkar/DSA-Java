public class TwoDimensionalArray {
    int arr[][] = null;

    // Constructor
    public TwoDimensionalArray(int noofrows, int noofcolumns) {
        this.arr = new int[noofrows][noofcolumns];
        for(int row=0; row < arr.length; row++) {
            for(int col=0; col < arr.length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value into the array
    public void insertValue(int row, int col, int val) {
        try {
            if(arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = val;
                System.out.println("The value " + val + " is successfully inserted");
            }
            else {
                System.out.println("This cell is already occupied !");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for the 2D array");
        }
    }
    // Accessing array elements
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row " + row + ", Col " + col);
        try {
           System.out.println("Cell value is" + " "+ arr[row][col]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array..!");
        }
    }

    //Traversing 2D array
    public void traverse2DArray() {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr.length; col++) {
                System.out.println(arr[row][col] + " ");
            }
        }
        System.out.println();
    }

    // Searching a single value in the array
    public void searchArray(int value) {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr.length; col++) {
                if(arr[row][col] == value) {
                    System.out.println("Value is found at row " + row + " col" + " " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    // Deleting an element from array
    public void deleteArray(int row, int col) {
        try {
         System.out.println("Successfully deleted : " + arr[row][col]);  
         arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index value !");
        }
    }
}
