class VarArgs2{
static void vaTest(String msg,int...v){
System.out.println(msg + v.length);
for(int i=0; i<v.length; i++)
System.out.println(v[i]);
System.out.println();
}

public static void main(String args[])
{vaTest("One",10);
vaTest("Three", 1,2,3);
vaTest("No");
}
}

