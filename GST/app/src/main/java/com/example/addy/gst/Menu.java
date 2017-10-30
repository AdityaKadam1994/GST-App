package com.example.addy.gst;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Aditya on 10/27/2017.
 */

public class Menu extends AppCompatActivity {

    ListView lv;
   int []Images={R.drawable.magnifier,R.drawable.cart,R.drawable.dinnerbell};
   String [] options= {"Search","Tax Rates:Goods","Tax Rates:Services"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

       lv=(ListView) findViewById(R.id.list);
       MyAdapter myAdapter= new MyAdapter(Menu.this,options,Images);
       lv.setAdapter(myAdapter);
       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if(i==0) {
                   Intent intent = new Intent(Menu.this, Search.class);

                   startActivity(intent);
               }
               if(i==1){
                   Intent intent= new Intent(Menu.this,Goods.class);
                   startActivity(intent);
               }

               if(i==2){
                   Intent intent= new Intent(Menu.this,Services.class);
                   startActivity(intent);
               }

           }
       });
    }



    public void onBackPressed() {


    }


}