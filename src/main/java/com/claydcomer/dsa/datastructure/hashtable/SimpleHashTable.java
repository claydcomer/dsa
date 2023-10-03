package com.claydcomer.dsa.datastructure.hashtable;

import com.claydcomer.dsa.model.Employee;
import com.claydcomer.dsa.model.StoredEmployee;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if(occupied(hashedKey)) {
            int stopIndex = hashedKey;

            if(hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(occupied(hashedKey)) {
            System.out.println("There's already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);

        return hashedKey == -1 ? null : hashtable[hashedKey].employee;
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);

        if(hashedKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];

        for (StoredEmployee storedEmployee : oldHashTable) {
            if (storedEmployee != null) {
                put(storedEmployee.key, storedEmployee.employee);
            }
        }

        return employee;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;

        if(hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }

    public boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashTable() {
        System.out.println("-----");

        for (StoredEmployee storedEmployee : hashtable) {
            if (storedEmployee == null) {
                System.out.println("empty");
            } else {
                System.out.println(storedEmployee.employee);
            }
        }

        System.out.println("-----");
    }
}
