public class BinarySearch {
  private int a [];
  private int elements;
  public BinarySearch(int max) {
    a = new int[max];
    elements = 0;
   }
  int size() {
   return elements;
   }
  int find(int found) {
     return Locate(found, 0, elements-1);
    }
  
  int Locate(int found, int first, int last) {
      int middle;
      middle = (first + last) / 2;
    
      if(a[middle] == found)
        return middle;
       else if(first > last)
         return elements;
    
    else {
      if(a [middle] < found)
        return Locate(found, middle + 1, last);
      } 
      else {
          return Locate(found, first, middle - 1);
         }
     }
  
  public void insert(int, value) {
       int i;
       for(i = 0; < elements; i++)
         if(a[i] > value) // (linear search)
           break;
       for(int j = elements; j > i; j --)
      a[j] = a[j-1];
      a[i] = value;
      elements ++;
     }
  
  public void display() {
      for(int i = 0; i < elements; i+ +)
        System.out.println(a[i] + "");
    System.out.println("");
     }
  
  public static void main(String args []) {
       int maxSize = 20;
       BinarySearch arr = new BinarSearch(maxSize);
       arr.insert(5);
       arr.insert(7);
       arr.insert(9);
       arr.insert(11);
       arr.insert(15);
       arr.insert(20);
       arr.insert(30);
       arr.insert(45);
       arr.insert(89);
       arr.insert(97);
       int found = -2;
    
       if(arr.find(found)
          System.out.println("Element" + found)
       else {
         System.out.println("Element doesnt exist" + found);
         }
     }
 }
