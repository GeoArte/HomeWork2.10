import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args)
    {
        Predicate<Integer> checker = new Predicate<Integer>() {
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
        Predicate<Integer> checkerL = (a) -> a>= 0;
        Consumer<String> seyHelloToMyLittleFriend = new Consumer()
        {
            @Override
            public void accept(Object o)
            {
                System.out.println("Hello, " + o + "!");
            }
        };
        Consumer<String> seyHelloToMyLittleFriendL = (name) ->
        {
            System.out.println("Hello, " + name + "!");
        };
        Function<Double, Long> transformation = new Function<Double, Long>()
        {
            @Override
            public Long apply(Double o)
            {
                Long a = o.longValue();
                return a;
            }
        };
        Function<Double, Long> transformationL = (o) ->
        {
            Long a = o.longValue();
            return a;
        };
        Supplier<Integer> createRandomNumber = new Supplier() {
            @Override
            public Object get() {
                Random random = new Random();
                Integer r = random.nextInt(101 - 1) + 1;
                return r;
            }
        };
        Supplier<Integer> createRandomNumberL = () ->
        {
            Random random = new Random();
            Integer r = random.nextInt(101 - 1) + 1;
            return r;
        };
        int b = 5;
        int c = -6;
        double d = 2.86948;
        System.out.println(checker.test(b));
        System.out.println(checkerL.test(c));
        seyHelloToMyLittleFriend.accept("Georgy");
        seyHelloToMyLittleFriendL.accept("Lena");
        System.out.println(transformation.apply(d));
        System.out.println(transformationL.apply(d));
        System.out.println(createRandomNumber.get());
        System.out.println(createRandomNumberL.get());
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse)
    {
        if (condition.equals(true)) {
            return (Function<T, U>) ifTrue;
        } else
        {
            return (Function<T, U>) ifFalse;
        }
    }
}