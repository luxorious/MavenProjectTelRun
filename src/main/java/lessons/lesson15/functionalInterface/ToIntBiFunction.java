package lessons.lesson15.functionalInterface;

@FunctionalInterface
public interface ToIntBiFunction<T, U>{
    int applyAsInt(T t, U u);
}
