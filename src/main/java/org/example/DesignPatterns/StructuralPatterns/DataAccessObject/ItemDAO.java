package org.example.DesignPatterns.StructuralPatterns.DataAccessObject;

import java.util.HashSet;
import java.util.Optional;
import java.util.function.Predicate;

public class ItemDAO implements DataAccessObjectInterface<Item> {
    private Integer lastId;
    private HashSet<Item> items;

    @Override
    public Boolean create(Item object) {
        object.setId(lastId + 1);
        lastId++;
        return items.add(object);
    }

    @Override
    public Optional<Item> read(Integer id) {
        return items.stream().filter(item -> item.getId().equals(id)).findFirst();
    }

    @Override
    public Item[] read() {
        return items.toArray(Item[]::new);
    }

    @Override
    public Item[] read(Predicate<Item> predicate) {
        return items.stream().filter(predicate).toArray(Item[]::new);
    }

    @Override
    public Boolean update(Integer id, Item updatedObject) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        Optional<Item> optionalItem = read(id);
        optionalItem.ifPresent(item -> items.remove(item));
        return optionalItem.isPresent();
    }
}
