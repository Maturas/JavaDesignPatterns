package org.example.SOLID.DependencyInversionPrinciple.GoodExample;

public interface DaoInterface<T> {
    T get(Integer id);
    Boolean exists(Integer id);
}
