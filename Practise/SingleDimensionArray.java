import java.lang.*;
public class SingleDimensionArray {
    int arr[] = null;
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted..!");
            }
            else {
                System.out.println("The cell is already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array..!");
        }
    }

    // Array Traversal
    public void traverseArray() {
        try {
            for(int i=0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array No Longer Exists");
        }
        
    }

    //Search for an element in Array
    public void searchinArray(int valueToSearch) {
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
            }
            return;
        }
        System.out.println(valueToSearch + " is not found");
    }

    //Deleting Array elements
    public void deleteArrayValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The Value has been deleted successfully..!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The provided value is not in the range of the array");
        }
    }
}