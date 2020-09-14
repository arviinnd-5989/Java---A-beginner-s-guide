interface MyIntNumPredicate{
boolean test(MyIntNum mv, int n);
}

class MyIntNum{
private int v;
MyIntNum(int x) { v = x;}
int getNum() { return v;}

boolean isFactor(int n){
return (v%n) == 0;
}
}

class MethodRefDemo3{
public static void main(String args[])
{ boolean result;
MyIntNum myNum = new MyIntNum(12);
MyIntNum myNum2 = new MyIntNum(16);

MyIntNumPredicate inp = MyIntNum::isFactor;
result = inp.test(myNum,3);
System.out.println(result);
}
}




