import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=0;int min=1000;
        int piece,number,other=0;
        System.out.println("Please enter the amount of numbers:");
        piece= scanner.nextInt();
        for(int i=1;i<=piece;i++){
            System.out.println("Please enter the"+" "+i+"."+" "+"number");
            number= scanner.nextInt();

            if(max<number){max=number;}else if(number<min){min=number;}
 if(min==1000){min=number;}


        }
        System.out.println("Maximum number:"+max+" "+"Minimum number:"+min);

    }
}