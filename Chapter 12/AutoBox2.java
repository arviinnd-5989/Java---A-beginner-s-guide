class AutoBox2{
static void m(Integer v){
System.out.println("m() received" + v);
}

static int m2(){
return 10;
}

static Integer m3(){
return 99;
}

public static void main(String args[]){
m(199);
Integer iOb = m2();
System.out.print(iOb);

int i = m3();
System.out.println(i);

iOb = 100;
System.out.println(Math.sqrt(iOb));

}
}

