package com.example.meill.smartbookmarksmeiller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.meill.smartbookmarksmeiller.Dal.DalBooks;
import com.example.meill.smartbookmarksmeiller.Dal.DalComments;

public class MainActivity extends AppCompatActivity {
     TextView txtNbLivre;
     TextView txtNbCom;
     TextView txtNbMoy;
     Button btnCommentaire;
     Button btnLivres;
     Button btnNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bdd
        MyBdd maCollecDb = new MyBdd(this);
        SQLiteDatabase db = maCollecDb.getWritableDatabase();

        txtNbLivre = (TextView)findViewById(R.id.txtNbLivre);
        int _resTxtNbLivre=DalBooks.getNbBooks(db);
        txtNbLivre.setText(Integer.toString(_resTxtNbLivre));

        txtNbCom=(TextView)findViewById(R.id.txtNbCom);
        int _restxtNbCom= DalComments.getNbComments(db);
        txtNbCom.setText(Integer.toString(_restxtNbCom));

        txtNbMoy=(TextView)findViewById(R.id.txtNbMoy);
        int _restxtNbMoy= 0/*DalComments.getNbComments(db)*/;
        txtNbMoy.setText(Integer.toString(_restxtNbMoy));

        btnCommentaire = (Button)findViewById(R.id.btnCommentaire);
        btnCommentaire.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CommentsActivity.class);
                startActivity(i);
            };
        });

        btnLivres = (Button)findViewById(R.id.btnLivres);
        btnLivres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LivresActivity.class);
                startActivity(i);
            };
        });

        btnNotes = (Button)findViewById(R.id.btnNotes);
        btnNotes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CreateCommentActivity.class);
                startActivity(i);
            };
        });

    }
}
