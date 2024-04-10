import java.util.Scanner;
class Fifo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Range");
        int range = sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.println(n1+" "+n2);
        for(int i=1;i<=range;i++){
           int n3=n1+n2;
           if(n3<=10){
            System.out.print(" "+n3);
           }else{
            break;
           }
            n1=n2;
            n2=n3;
        }
    }
}
