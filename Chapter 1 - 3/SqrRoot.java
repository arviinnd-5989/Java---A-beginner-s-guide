class SqrRoot{
public static void main(String args[]){
double num, sroot, rerr;

for (num=1.0; num<100.0; num++){
sroot = Math.sqrt(num);
System.out.println(num + " " + sroot);

rerr = num - (sroot*sroot);
System.out.println(rerr);
System.out.println();
}
}
} 
