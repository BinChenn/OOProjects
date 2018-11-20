package com;

public interface SqlOp {
    int count(String UserId, String item);
    Boolean insert(String UserId, String name, String data);
    String query(String UserId, String name, String condition);
    Boolean delete(String UserId, String item);
    Boolean update(String UserId, String item, String condition);
}
