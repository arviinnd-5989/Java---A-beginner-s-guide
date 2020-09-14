enum Transport{
CAR, TRUCK, AIRPLANE, TRAIN, BOAT;
}

class EnumDemo4{
public static void main(String args[])
{ Transport tp, tp2, tp3;

System.out.println("tp and ordinal values");
Transport allTransports[] = Transport.values();	
for(Transport t: allTransports)
System.out.println(t + " " +  t.ordinal());

tp = Transport.AIRPLANE;
tp2 = Transport.TRAIN;
tp3 = Transport.AIRPLANE;
System.out.println();

if(tp.compareTo(tp2) < 0)
System.out.println(tp + " " + tp2);

if(tp.compareTo(tp2) > 0)
System.out.println(tp2 + " " + tp);

if(tp.compareTo(tp3) == 0)
System.out.println(tp + " " + tp3);

}
}

