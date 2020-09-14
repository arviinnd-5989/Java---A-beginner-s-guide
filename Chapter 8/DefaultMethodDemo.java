interface MyIF{
int getUserID();
default int getAdminID(){
return 1;
}
}

class MyIFImp implements MyIF{
public int getUserID(){
return 100;
}

public int getAdminID(){
return 42;
}
}

class DefaultMethodDemo{
public static void main(String args[]){
MyIFImp obj = new MyIFImp();
System.out.println(obj.getUserID());
System.out.println(obj.getAdminID());
}
}
