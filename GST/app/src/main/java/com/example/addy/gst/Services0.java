package com.example.addy.gst;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Services0 extends AppCompatActivity {
    ListView goodlv;
    String [] type ={"goods","goods","goods","goods","goods"};
    String [] description={"Molasses","Chewing gum / bubble gum and white chocolate, not containing cocoa","Cocoa butter,fat and oil","Cocoa powder, not containing added sugar or sweetening matter","Chocolates and other food preparations containing cocoa"};
    String[] rate={"28","28","28","28","28"};
    String[]hsn={"1703","1704","1804","1805","1806"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services0);






    }

}
