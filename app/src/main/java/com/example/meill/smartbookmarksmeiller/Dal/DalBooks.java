package com.example.meill.smartbookmarksmeiller.Dal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;

import com.example.meill.smartbookmarksmeiller.Models.Book;

import java.util.ArrayList;

/**
 * Created by meill on 20/09/2017.
 */

public class DalBooks {
    public static final String TABLE = "Books";

    public static int getNbBooks(SQLiteDatabase db)
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

    public static ArrayList<Book> getAll(SQLiteDatabase db)
    {

        Cursor cursor=db.query(TABLE,//selection table
                new String[]{"id","title","author","genre"},//colone
                null,//selection where
                null,//parametre selection
                null,//order
                null,//groupe
                null);//limite
        ArrayList<Book> Books = new ArrayList<Book>();
        /*while (cursor.moveToNext())
        {
             Book unbooks = new Book();
            unbooks.setId(cursor.getInt(0));
            unbooks.setLabelle(cursor.getString(1));
            unbooks.setLongitude(cursor.getFloat(2));
            unbooks.setLatitude(cursor.getFloat(3));
            unbooks.setCodeType(cursor.getInt(4));
            Books.add(unLieu);
        }
        cursor.close();*/
        return Books;
    }
}
