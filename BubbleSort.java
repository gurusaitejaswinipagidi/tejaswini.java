publuc class BubbleSort{
public static void main(String[] args)
{
int a[]={2,4,3,6,1}
for(int i=0;i<a.length-1;i++){
for(int j=0;j<a.length-1-i;j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(int x:a){
System.out.println(x+"");
}
}
}