package org.example.DesignPatterns.StructuralPatterns.Adapter;

import java.util.Arrays;

/*
    This is a database class of an old backend application.
    We have to use it with our modern application, but it's incompatible with the interface.
 */
public class OldDataBaseAccessClass {
    private DataBaseRecord[] records;

    public DataBaseRecord getRecord(Integer id) {
        for (DataBaseRecord record : records) {
            if (record.getId().equals(id)) {
                return record;
            }
        }

        return null;
    }

    public DataBaseRecord[] getAllRecords() {
        return records.clone();
    }
}
