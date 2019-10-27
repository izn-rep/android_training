package com.example.lenovo.trainingday1.entity;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by LENOVO on 9/3/2016.
 */
@DatabaseTable(tableName = "question")
public class Question {
    private final static String TAG_TITLE = "title";
    private final static String TAG_IMAGE = "image";

    @DatabaseField(generatedId = true)
    private int id;

    @SerializedName(TAG_TITLE)
    @DatabaseField(columnName = TAG_TITLE)
    private String title;

    @SerializedName(TAG_IMAGE)
    @DatabaseField(columnName = TAG_IMAGE)
    private String image;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }
}
