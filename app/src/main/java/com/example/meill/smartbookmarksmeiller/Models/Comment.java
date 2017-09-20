package com.example.meill.smartbookmarksmeiller.Models;

import java.sql.Date;

/**
 * Created by meill on 20/09/2017.
 */

public class Comment {
    int  id;
    int bookId;
    String comment;
    Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}
