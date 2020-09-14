import java.io.*;
class ShowFile3{
public static void main(String args[])
{
int i;

if(args.length != 1){
System.out.println("Usage: ShowFile File");
return;
}

try (FileInputStream fin = new FileInputStream(args[0])){

do{
i = fin.read();
if(i != -1) System.out.print((char) i);
} while(i != -1);

}catch(IOException exc){
System.out.println("I/O error: " + exc);
}
}
}


