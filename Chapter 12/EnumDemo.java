enum Transport{
CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo{
public static void main(String args[])
{ Transport tp;
tp = Transport.AIRPLANE;

System.out.println(tp);
System.out.println();

tp = Transport.TRAIN;

if(tp == Transport.TRAIN)
System.out.println("tp contains TRAIN");

switch(tp){
case CAR:
System.out.println("Car");
break;
case TRUCK:
System.out.println("truck");
break;
case AIRPLANE:
System.out.println("Airplane flies");
break;
case TRAIN:
System.out.println("Train");
break;
case BOAT:
System.out.println("boat");
break;
}
}
}

