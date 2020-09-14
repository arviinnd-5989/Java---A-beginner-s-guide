enum Transport{
CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
private int speed;

Transport(int s){speed=s;}
int getSpeed(){return speed;}
}

class EnumDemo3{
public static void main(String args[])
{ //Transport tp;

System.out.println("Airplane speed" + Transport.AIRPLANE.getSpeed());
System.out.println("All speeds");
Transport allTransports[] = Transport.values();	
Transport tp = Transport.CAR;
System.out.println(tp);

for(Transport t: allTransports)
System.out.println(t + " " +  t.getSpeed() + "miles/hour");

}
}

