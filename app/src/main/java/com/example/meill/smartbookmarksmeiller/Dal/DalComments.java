package com.example.meill.smartbookmarksmeiller.Dal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by meill on 20/09/2017.
 */

public class DalComments {
    public static final String TABLE = "Comments";

    public static int getNbComments(SQLiteDatabase db)
    {
        Cursor cursor=db.query(TABLE,//selection table
                new String[]{"id"},//colone
                null,//selection where
                null,//parametre selection
                null,//order
                null,//groupe
                null);//limite
        if(cursor != null){return cursor.getCount();}
        else{return 0;}
    }
}
