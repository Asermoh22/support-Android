package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NoteDataHolder extends SQLiteOpenHelper {

    private  final  String TABLE_NAME="SHOE";
    private  final  String COLOUMN_BRAND="BRAND",
            COLUMN_MODEL="MODEL",
            COLUMN_SIZE="SIZE",
            COLUMN_DESCRIPTION="DESCRIPTION";
    public NoteDataHolder(@Nullable Context context) {
        super(context,"shoe.db",null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     String creationQuery= "CREATE TABLE "+TABLE_NAME+"("+COLOUMN_BRAND+"TEXT PRIMARY KEY,"+COLUMN_MODEL+"TEXT NOT NULL,"+COLUMN_SIZE+
             "INTEGER NOT NULL,"+COLUMN_DESCRIPTION+"TEXT NOT NULL)";
     db.execSQL(creationQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  void insertNote(NOTEMODEL note){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(COLOUMN_BRAND,note.getBRAND());
        cv.put(COLUMN_MODEL,note.getMODEL());
        cv.put(COLUMN_SIZE,note.getSIZE());
        cv.put(COLUMN_DESCRIPTION,note.getDESCRIPTION());

        db.insert(TABLE_NAME, null,cv);

    }
    public List<NOTEMODEL> getNotes(){
        SQLiteDatabase db= this.getReadableDatabase();
        List<NOTEMODEL> noteList=new ArrayList<>();
        Cursor cursor=db.rawQuery("select * from "+TABLE_NAME,null);
        if ( cursor.moveToFirst()){
            do{
                String BRAND=cursor.getString(1);
                String MODEL=cursor.getString(2);
                int SIZE=cursor.getInt(3);
                String DESCRIOTION=cursor.getString(4);
                NOTEMODEL note=new NOTEMODEL(BRAND,MODEL,SIZE,DESCRIOTION);
                noteList.add(note );
            }while (cursor.moveToNext());
        }
        return noteList;
    }
}
