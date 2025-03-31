package org.example.pojo;

import org.example.dbentity.ICplanData;

import java.util.List;

public class CplanDataResult<T extends ICplanData>{

  private  String table;
   private List<T> newItems;
   private List<T> existingItems;

    public String getTable() {
        return table;
    }

    public List<T> getNewItems() {
        return newItems;
    }

    public List<T> getExistingItems() {
        return existingItems;
    }

    public void setExistingItems(List<T> existingItems) {
        this.existingItems = existingItems;
    }

    public void setNewItems(List<T> newItems) {
        this.newItems = newItems;
    }

    public void setTable(String table) {
        this.table = table;
    }





}
