import java.util.function.Predicate;

class UsePredicateInterface{
public static void main(String args[])
{
Predicate<Integer> isEven = (n) -> (n%2) == 0;
if (isEven.test(4)) System.out.println("even");
}
}
