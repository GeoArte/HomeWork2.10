import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args)
    {
        Predicate<Integer> Checker = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer >= 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
        Predicate<Integer> CheckerL = (a) -> a>= 0;
        Consumer<String> SeyHelloToMyLittleFriend = new Consumer()
        {
            @Override
            public void accept(Object o)
            {
                System.out.println("Hello, " + o + "!");
            }
        };
        Consumer<String> SeyHelloToMyLittleFriendL = (name) ->
        {
            System.out.println("Hello, " + name + "!");
        };
        Function<Double, Long> Transformation = new Function<Double, Long>()
        {
            @Override
            public Long apply(Double o)
            {
                Long a = o.longValue();
                return a;
            }
        };
        Function<Double, Long> TransformationL = (o) ->
        {
            Long a = o.longValue();
            return a;
        };
        Supplier<Integer> CreateRandomNumber = new Supplier() {
            @Override
            public Object get() {
                Random random = new Random();
                Integer r = random.nextInt(101 - 1) + 1;
                return r;
            }
        };
        Supplier<Integer> CreateRandomNumberL = () ->
        {
            Random random = new Random();
            Integer r = random.nextInt(101 - 1) + 1;
            return r;
        };
        int b = 5;
        int c = -6;
        double d = 2.86948;
        System.out.println(Checker.test(b));
        System.out.println(CheckerL.test(c));
        SeyHelloToMyLittleFriend.accept("Georgy");
        SeyHelloToMyLittleFriendL.accept("Lena");
        System.out.println(Transformation.apply(d));
        System.out.println(TransformationL.apply(d));
        System.out.println(CreateRandomNumber.get());
        System.out.println(CreateRandomNumberL.get());
    }
}