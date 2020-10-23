import java.util.*;
public class Task
{
  public static void main(String[]args)
  {
    Scanner k=new Scanner(System.in);
    int a[]=new int [10];
    for(int c=0;c<a.length;c++) //loop for taking input
    {
      a[c]=k.nextInt();
    }
    for(int e=0;e<a.length;e++) //loop for printing the first array
    {
      System.out.print(a[e]+" ");
    }
    System.out.println();
    int max=0;
    int maxPos=0;
    for(int i=0;i<a.length;i++)  //loop for seeking max value and max position on array
    {
      if(max>a[i])
      {
        max=max;
        maxPos=maxPos;
      }
      else
      {
        max=a[i];
        maxPos=i;
      }
    }
    int min=0;
    int minPos=0;
    for(int j=0;j<a.length;j++) //loop for seeking min value and min position on array
    {
      if(min<a[j])
      {
        min=min;
        minPos=minPos;
      }
      else
      {
        min=a[j];
        minPos=j;
      }
    }
    a[minPos]=max;
    a[maxPos]=min;
    for(int g=0;g<a.length;g++) //loop for printing the swapped array
    {
      System.out.print(a[g]+" ");
    }
    System.out.println();
  }
}
      
      