package com.co.demo.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserLoombokData {

    String user;
    String pass;

    public static List<UserLoombokData> setData(DataTable table){
        List<UserLoombokData> data = new ArrayList<>();
        List<Map<String, String>> info = table.asMaps();
        for (Map<String,String> pointer : info) {
            data.add(new ObjectMapper().convertValue(pointer, UserLoombokData.class));
        }
        return data;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
