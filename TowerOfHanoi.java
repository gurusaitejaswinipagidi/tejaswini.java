public class TowerOfHanoi{
    public static void solvehanoi(int n,char source,char destination ,char helper)
{
    if(n==1){
        System.out.println("move disk 1 from " +source+ "to" +destination);
        return;
    }
 solvehanoi(n-1,source,destination,helper);
 System.out.println("Move disk "+n+"from"+source+"to" +destination);
 solvehanoi(n-1,helper,source,destination);
}
public static void main(String[] args){
    int n=10;
    solvehanoi(n,'S','H','D');
}    }
