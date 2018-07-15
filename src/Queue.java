public class Queue {
   // your code is here
 private int maxSize=3;
 private int[] Storage=new int[maxSize];
 private int top = -1;
 static int  indx=-1;

 public void push(int pushedElement) {
  if(indx<maxSize) {
   Storage[++indx] = pushedElement;
  }
 }
 public long pop() {
  int temp=Storage[0];
  for(int i=1;i<Storage.length;i++){
   Storage[i-1]=Storage[i];
  }
  Storage[Storage.length-1]=0;
  indx--;
  return temp;
 }

 public void display(){
  for(int i = 0;i <Storage.length;i++){
   System.out.println(Storage[i]);
  }
 }

}