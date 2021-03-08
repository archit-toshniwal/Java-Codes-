
package Arrays;

import java.util.Scanner;

class Deletion 
{
    int array[];
        void print_array(int arr[],int no)
        {
            for(int i=0;i<no;i++)
            {
                System.out.println("Element at index "+i+" is : "+arr[i]);
            }
        }
        public static void main(String[] args) 
        {
            Deletion delete = new Deletion();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Limit of Array");
            int limit = scan.nextInt();
            System.out.println("Enter No of Elements ");
            int no = scan.nextInt();
            delete.array = new int[limit];
            for(int i=0;i<no;i++)
            {
                System.out.println("enter element "+(i+1));
                delete.array[i] = scan.nextInt();
            }
            System.out.println("Enter Index on which You want to Insert");
            int index = scan.nextInt();
            System.out.println("Before Deletion");
            delete.print_array(delete.array, no);
            System.out.println("After Deletion");
            //logic
            for(int i=index;i<no;i++)
            {
                delete.array[i] = delete.array[i+1];
            }
            delete.print_array(delete.array, --no);
        }
}
