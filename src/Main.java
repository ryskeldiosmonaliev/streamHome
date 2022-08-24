import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6,7,8,10,11};

        List<Integer> list =  Arrays.asList(arr);
         list.stream()
                 .filter(x->x%2==0)
                 .map(x->x*x)
                 .max((x,y)->Integer.compare(x,y))
                         .stream().forEach(x-> System.out.println(x));


    }
}