package org.example.DesignPatterns.StructuralPatterns.Adapter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    This is an Adapter class, which allows us to use the Old Class with the New Interface
 */
public class DataBaseAccessAdapter extends OldDataBaseAccessClass implements NewDataBaseAccessInterface<DataBaseRecord> {

    @Override
    public Optional<DataBaseRecord> read(String id) {
        Integer intId = Integer.parseInt(id);
        return Optional.ofNullable(getRecord(intId));
    }

    @Override
    public List<DataBaseRecord> readAll() {
        return Arrays.stream(getAllRecords()).toList();
    }

    @Override
    public Boolean exists(String id) {
        Integer intId = Integer.parseInt(id);
        return getRecord(intId) == null;
    }
}
