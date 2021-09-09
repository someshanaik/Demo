import java.util.Scanner;
class TelecomUtil1{

static String[] simCard= new String[3];


public static void main(String a[]){
System.out.println("main method started");
Scanner sc= new Scanner(System.in);
System.out.println("Enter candidate age");
String candidateName=sc.next();
System.out.println("Enter the phone no");
String no=sc.next();
System.out.println("Enter the adress");
String adress=sc.next();

simCard[0]=candidateName;
simCard[1]=no;
simCard[2]=adress;

Telecom.eligible(simCard);
System.out.println("main method ended");

}

}