class Ipl{

static String[] iplTeamName = new String[8];
static String[]  iplTeamCaptains = new String[8];
public static void main(String[] args){


 

iplTeamName[0] = "RCB";
iplTeamName[1] = "CSK";
iplTeamName[2] = "MI";
iplTeamName[3] = "KKR";
iplTeamName[4] = "SRH";
iplTeamName[5] = "DC";
iplTeamName[6] = "KXP";
iplTeamName[7] = "RR";



iplTeamCaptains[0] = "Virat Kohli";
iplTeamCaptains[1] = "MS Dhoni";
iplTeamCaptains[2] = "Rohit sharma";
iplTeamCaptains[3] = "Eoin Margan";
iplTeamCaptains[4] = "Kane Williamson";
iplTeamCaptains[5] = "Rishabh pant";
iplTeamCaptains[6] = "KL Rahul";
iplTeamCaptains[7] = "Sanju samson";
getIplTeamName();
getIplTeamCaptains();   

}

public static void getIplTeamName(){

for( int z=0; z<iplTeamName.length ; z++)
{
System.out.println(iplTeamName[z]);
}

}

public static void getIplTeamCaptains(){
 for (int k=0; k<iplTeamCaptains.length ; k++)
{
System.out.println(iplTeamCaptains[k]);
}



}

}