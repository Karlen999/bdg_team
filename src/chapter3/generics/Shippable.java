package chapter3.generics;


public interface Shippable<T> {
    void ship(T t);
}