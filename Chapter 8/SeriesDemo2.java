class ByTwos implements Series{
int start;
int val;
int prev;

ByTwos() {
start = 0;
val = 0;
prev = -2;
}

public int getNext(){
prev = val;
val += 2;
return val;
}

public void reset(){
val = start;
prev = start - 2;
}

public void setStart(int x){
start = x;
val = x;
prev = x-2;
}

int getPrevious(){
return prev;
}
}

class ByThrees implements Series{
int start;
int val;
int prev;

ByThrees(){
start = 0;
val = 0;
prev = -3;
}

public int getNext(){
prev = val;
val += 3;
return val;
}

public void reset(){
val = start;
prev = start - 3;
}

public void setStart(int x){
start = x;
val = x;
prev = x-3;
}

int getPrevious(){
return prev;
}
}

class SeriesDemo2{
public static void main (String args[]){
ByTwos twoOb = new ByTwos();
ByThrees threeOb = new ByThrees();
Series ob;

for(int i=0; i<5; i++){
ob = twoOb;
System.out.println("next bytwos" + " " + ob.getNext());
ob = threeOb;
System.out.println("next bythrees" + " " + ob.getNext());
}
}
}

