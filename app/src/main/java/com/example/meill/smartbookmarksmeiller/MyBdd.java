package com.example.meill.smartbookmarksmeiller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by meill on 20/09/2017.
 */

public class MyBdd extends SQLiteOpenHelper
{
    public static final int DATABASE_VERSION = 1;
    public static final String  DATABASE_NAME ="MaDb.db";


    public Context context;
    public MyBdd(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.context=context;

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Table
        db.execSQL("CREATE TABLE Books " +
                "(id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL ," +
                "title VARCHAR NOT NULL , " +
                "author VARCHAR NOT NULL , " +
                "genre VARCHAR NOT NULL ); ");

        db.execSQL("CREATE TABLE Comments " +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," +
                "bookId INTEGER NOT NULL ," +
                "comment VARCHAR NOT NULL , " +
                "date DATETIME NOT NULL," +
                "Foreign Key(bookId) References Books(id));"
        );
        //default insert
        db.execSQL("INSERT INTO Books VALUES(1,'Les fleurs du mal','Charles Baudelaire','Poèmes');"+
                    "INSERT INTO Books VALUES(2,'Germinal','Emile Zola','Roman');"+
                    "INSERT INTO Books VALUES(3,'Les misérables','Victor Hugo','Roman');"+
                    "INSERT INTO Books VALUES(4,'1984','George Orwell','Science-Fiction');"+
                    "INSERT INTO Books VALUES(5,'Le Meilleur des mondes','Aldous Huxley','Science-Fiction');"+
                    "INSERT INTO Books VALUES(6,'Vingt mille lieues sous les mers','Jules Verne','Aventure');"+
                    "INSERT INTO Books VALUES(7,'Les Trois Mousquetaires','Alexandre Dumas','Aventure');"+
                    "INSERT INTO Comments VALUES(1,1,'Commentaire 1','20/09/2017');"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
      /*  while(oldVersion<newVersion)
        {
            if(oldVersion==2){Versionn2(db); break;}
            if(oldVersion==3){ break;}
            if(oldVersion==4){ break;}
            if(oldVersion==5){ break;}
            if(oldVersion==6){ break;}
            if(oldVersion==7){ break;}
            oldVersion+=1;
        }*/
    }

    public void Versionn2(SQLiteDatabase db)
    {
        //db.execSQL("New script");
    }

}

