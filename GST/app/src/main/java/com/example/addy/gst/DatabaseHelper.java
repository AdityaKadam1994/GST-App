package com.example.addy.gst;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aditya on 11/2/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static String path= "/data/data/com.example.addy.gst/databases/";
    private static final String dbname="Goods.sqlite";
    private final Context mycontext;
    SQLiteDatabase mydatabase;
    public DatabaseHelper(Context context) {

        super(context,dbname,null,1);
        this.mycontext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void openDatabase() {
        String dbPath = mycontext.getDatabasePath(dbname).getPath();
        if(mydatabase != null && mydatabase.isOpen()) {
            return;
        }
        mydatabase = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase() {
        if(mydatabase!=null) {
            mydatabase.close();
        }
    }

    public List<Item> getListProduct() {
        Item product = null;
        List<Item> productList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mydatabase.rawQuery("SELECT * FROM Goods", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            product= new Item(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5));
            productList.add(product);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return productList;
    }
}
