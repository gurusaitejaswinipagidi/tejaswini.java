 public class LinearSearch{
 public static int LinearSearch(int arr[],int key){
 for(int i=0;i<arr.length;i++){
 if(arr[i]==key){
 return 1;}
 } return -1;
 }
 public static void main(String [] args){
 int arr[]={10,20,30,40,50};
 int key=30;
 int result=LinearSearch(arr,key);
 if(result==-1){
 System.out.println("Element not found.");
 }
 else{
 System.out.println("element found at index:"+result);
 }
 }
 }