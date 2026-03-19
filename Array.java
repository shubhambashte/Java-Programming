// Array In Java 
/*
public class Array{
    
    public static void main(String[] args){
        
        // Primitive array
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
    }
}

 */
/*
1] Access Array Elements 
class GFG{
    
    public static void main(String[] args){
        
        int[] arr = {2, 4, 8, 12, 16};

        // Accessing fourth element
        System.out.print(arr[3] + " ");

        // Accessing first element
        System.out.print(arr[0]);
    }
}
     */

// 2] Update Array Elements 
/*
class GFG{
    
    public static void main(String[] args){
        
        int[] arr = {2, 4, 8, 12, 16};

        // Updating first element
        arr[0] = 90;
        System.out.println(arr[0]);
    }
}
     */
// 3]  Traverse Array

/*
public class GFG{
    
    public static void main(String[] args){
        
        int[] arr = {2, 4, 8, 12, 16};

        // Traversing and printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

 */

// 4] Size Array 
/*
public class GFG{
    
    public static void main(String[] args){
        
        int[] arr = {2, 4, 8, 12, 16};
        System.out.println("Size of array: " + arr.length);
    }
}
     */

// Arrays of Objects 
/*
class Student {
    public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Array {
    public static void main(String[] args){
      
        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                               + arr[i].roll_no + " "
                               + arr[i].name+" }");
    }
}
     */

// Passing Array to Methods
/*
public class Array {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }

    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
     */

// Returning Array from Methods 
/*
class Array {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] m1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }
}

 */