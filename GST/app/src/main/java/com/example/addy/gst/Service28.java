package com.example.addy.gst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Service28 extends AppCompatActivity {
    ListView list;
    String [] type ={"goods","goods","goods","goods"};
    String [] description={"Molasses","Chewing gum / bubble gum and white chocolate, not containing cocoa","Cocoa butter,fat and oil","Cocoa powder, not containing added sugar or sweetening matter"};
    String[] rate={"28","28","28","28"};
    String[]hsn={"1703","1704","1804","1805"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service28);
        MyAdapter2 myAdapter2= new MyAdapter2(Service28.this,type,description,rate,hsn);
        list=(ListView)findViewById(R.id.service28lv);
        list.setAdapter(myAdapter2);

    }
}
