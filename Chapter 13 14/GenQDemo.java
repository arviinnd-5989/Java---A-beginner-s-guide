class GenQDemo{
public static void main(String args[]){
Integer iStore[]= new Integer[10];
GenQueue<Integer> q = new GenQueue<Integer>(iStore);


Integer iVal;
System.out.println("Queue");

try{
for(int i=0;i<5;i++){
System.out.print("Adding" + i + "to q");
q.put(i);
}
}
catch (QueueFullException exc){
System.out.println(exc);
} 
System.out.println();

try{
for(int i=0;i<5;i++){
System.out.print("getting next integer");
iVal = q.get();
System.out.println(iVal);
}
}
catch (QueueEmptyException exc){
System.out.println(exc);
}
System.out.println();

Double dStore[]= new Double[10];
GenQueue<Double> q2 = new GenQueue<Double>(dStore);


Double dVal;
System.out.println("Queue");

try{
for(int i=0;i<5;i++){
System.out.print("Adding" + (double)i/2 + "to q2");
q2.put((double)i/2);
}
}
catch (QueueFullException exc){
System.out.println(exc);
} 
System.out.println();

try{
for(int i=0;i<5;i++){
System.out.print("getting next integer from q2");
dVal = q2.get();
System.out.println(dVal);
}
}
catch (QueueEmptyException exc){
System.out.println(exc);
}
}
}

