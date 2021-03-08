
package Arrays;

import java.util.Scanner;


class Insertion 
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
            Insertion insert = new Insertion();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Limit of Array");
            int limit = scan.nextInt();
            System.out.println("Enter No of Elements ");
            int no = scan.nextInt();
            insert.array = new int[limit];
            for(int i=0;i<no;i++)
            {
                System.out.println("enter element "+(i+1));
                insert.array[i] = scan.nextInt();
            }
            
            System.out.println("Enter element You want to Insert");
            int element = scan.nextInt();
            System.out.println("Enter Index on which You want to Insert");
            int index = scan.nextInt();
           
            //Logic for Insertion
            if(index>no)
            {
                insert.array[no] = element;
                no++;
                insert.print_array(insert.array,no);
            }
            else
            {
                for(int i = no;i>=index;i--)
                {
                    insert.array[i+1] = insert.array[i];
                }
                  insert.array[index] = element;
                  no++;
                 insert.print_array(insert.array,no);
            }
        }
}
