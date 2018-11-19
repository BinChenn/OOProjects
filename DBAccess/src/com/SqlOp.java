package com;

public interface SqlOp {
    int count(String UserId, String item);
    String insert(String UserId, String item);
    String query(String UserId, String item);
    String delete(String UserId, String item);
    String update(String UserId, String item);
}
