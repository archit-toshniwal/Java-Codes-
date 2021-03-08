
package Arrays;

import java.util.Scanner;


class Searching 
{
        int array[];
        void print_array(int arr[],int no)
        {
            for(int i=0;i<no;i++)
            {
                System.out.println("Element at index "+i+" is : "+arr[i]);
            }
        }
        
        void linear(int arr[],int no,int element)
        {
            int flag=0;
            int pos=-1;
            for(int i=0;i<no;i++)
            {
                if(arr[i] == element)
                {
                    flag = 1;
                    pos = i;
                }
            }
            
            if(flag==0)
            {
                System.out.println("Element not Found " );
            }
            else
            {
                System.out.println("Element Found"+pos);
            }
        }
        
        
        void binary(int arr[],int no,int element)
        {
                int left = 0;
                int right = no;
                int mid;
                int flag = 0;
                int steps=0;
                while(left<=right)
                {
                    mid = (left+right)/2;
                    if(arr[mid] == element)
                    {
                        steps++;
                        flag = 1;
                        break;
                    }
                    else if(arr[mid]>element)
                    {
                        right = mid-1;
                        steps++;
                    }
                    else if(arr[mid]<element)
                    {
                        left = mid+1;
                        steps++;
                    }
                }
                
                if(flag==0)
                {
                    System.out.println("Not Found");
                }
                else
                {
                    System.out.println("Founded"+steps);
                }
        }
        public static void main(String[] args) {
            Searching search = new Searching();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Limit of Array");
            int limit = scan.nextInt();
            System.out.println("Enter No of Elements ");
            int no = scan.nextInt();
            search.array = new int[limit];
            for(int i=0;i<no;i++)
            {
                System.out.println("enter element "+(i+1));
                search.array[i] = scan.nextInt();
            }
            System.out.println("Enter element to Search");
            int element = scan.nextInt();
            search.linear(search.array, no,element);
            search.binary(search.array, no,element);
    }
}
