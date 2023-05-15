package edu.ktu.glang.interpreter;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, Object> table;
    private final Map<String, String> typeTable;


    public SymbolTable() {
        table = new HashMap<>();
        typeTable = new HashMap<>();
    }

    public void put(String name, Object value) {
        table.put(name, value);
    }

    public void put(String name, Object value, String type) {
        table.put(name, value);
        typeTable.put(name, type);
    }

    public Object get(String name) {
        return table.get(name);
    }

    public String getType(String name) {
        return typeTable.get(name);
    }

    public boolean contains(String name) {
        return table.containsKey(name);
    }
}