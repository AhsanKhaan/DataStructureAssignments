/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort_main;

/**
 *
 * @author Ramish
 */
public class MergeSort { 

    public MergeSort() {
    }
    public int a[]={1,2,0,3,8,9,4};
 public void sorting(){
     merge_sort(0, a.length-1);
 
 }   
public void merge_sort(int low,int high)
{
 int mid;
 if(low<high)
 {
  mid=(low+high)/2;
       System.out.println("after mid("+low+","+mid+","+high);
  merge_sort(low,mid);
     System.out.println("after merge sort 1("+low+","+mid+","+high);
  merge_sort(mid+1,high);
     System.out.println("after merge sort 2("+low+","+mid+","+high);
  merge(low,mid,high);
       System.out.println("after merge("+low+","+mid+","+high);
 }
}
public void merge(int low,int mid,int high)
{
 int h,i,j,k;
 int b[]=new int[50];
 h=low;
 i=low;
 j=mid+1;

 while((h<=mid)&&(j<=high))
 {
  if(a[h]<=a[j])
  {
   b[i]=a[h];
   h++;
  }
  else
  {
   b[i]=a[j];
   j++;
  }
  i++;
 }
 if(h>mid)
 {
     System.out.println("i am not in problem 1");
  for(k=j;k<=high;k++)
  {
   b[i]=a[k];
   i++;
  }
 }
 else
 {
     
     System.out.println("i am not in problem 2");
  for(k=h;k<=mid;k++)
  {
   b[i]=a[k];
   i++;
  }
 }
 for(k=low;k<=high;k++) a[k]=b[k];
}
public void display(){
    for (int i = 0; i < a.length-1; i++) {
        System.out.println("items is"+a[i]);
    }


}
    
}
