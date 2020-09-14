class Trial{
static char ch;
public static void input()
throws java.io.IOException{
System.out.println("Enter character");
ch = (char) System.in.read();
System.out.println(ch);
}
}

class FinDemo{
public static void main(String args[]){
try{Trial.input();}
catch(java.io.IOException exc){}

}
}
