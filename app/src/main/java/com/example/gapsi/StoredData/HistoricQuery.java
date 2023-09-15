package com.example.gapsi.StoredData;

import org.bson.types.ObjectId;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class HistoricQuery extends RealmObject {
    @PrimaryKey private String query;

    public HistoricQuery(String _query) {this.query = _query;}

    public HistoricQuery(){}

    public void setQuery(String query) {
        this.query = query;
    }
}

