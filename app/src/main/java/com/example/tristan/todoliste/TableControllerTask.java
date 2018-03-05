package com.example.tristan.todoliste;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Tristan on 05/03/2018.
 */

public class TableControllerTask extends DatabaseHandler {
    public TableControllerTask(Context context) {
        super(context);
    }

    public boolean create(ObjectTask objectStudent) {

        ContentValues values = new ContentValues();

        values.put("title", objectStudent.getTitre());
        values.put("content", objectStudent.getTexte());

        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccessful = db.insert("tasks", null, values) > 0;
        db.close();

        return createSuccessful;
    }
}
