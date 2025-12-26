import java.util.Scanner;
public class SelectionSort{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int [] a = newInt[n];
for(int i = 0;i < n;i++){
a[i] = sc.nextInt();
}
for(int i = 0;i < n-1;i++)
{
int min = i;
for(j = i+1;j < n;j++)
{
if(a[j]<a[min]){
min=j;
}
}
if(min!=i){
int temp = a[i];
a[i] = a[min];
a[min] = temp;
}
}
for(int i=0;i<n;i++){
System.out.println(a[i]+" ");
}
}
} 