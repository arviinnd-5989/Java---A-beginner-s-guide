class GenericMethodDemo{
static <T extends Comparable<T>, V extends T> boolean arraysEqual(T [] x, V[] y){
if(x.length!= y.length) return false;

for(int i=0; i<x.length; i++)
if(!x[i].equals(y[i])) return false;

return true;
}
public static void main(String args[]){
Integer nums[] = {1,2,3,4,5};
Integer nums2[] = {1,2,3,4,5};

if(arraysEqual(nums,nums2))
System.out.println("nums equals nums2");
}
}
