class Telecom{

public static String[] netWorkName={"jio"};

public static int age=20;

public static void eligible(String[] simCard){
System.out.println("eligible method started");

if(age>18){
System.out.println("Eligible");
if(simCard!=null){
getCardDetails(simCard);
}
else{
System.out.println("Sim card not found");
}
}
else{
System.out.println("Not eligible");
}

System.out.println("eligible method ended");

}


public static void getCardDetails(String[] simCard){
for(int i=0;i<simCard.length;i++)
{
System.out.println(simCard[i]);
}
}

}  
