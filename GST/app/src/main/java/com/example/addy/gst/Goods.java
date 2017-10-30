package com.example.addy.gst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Goods extends AppCompatActivity {

    ListView goodlv1;
    String [] suboptions= {"Goods @0%","Goods @0.25%","Goods @3%","Goods @5%","Goods @12%","Goods @18%","Goods @28%"};
    int []Images={R.drawable.cartl,R.drawable.cartl,R.drawable.cartl,R.drawable.cartl,R.drawable.cartl,R.drawable.cartl,R.drawable.cartl};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        goodlv1=(ListView)findViewById(R.id.goodlv);
        MyAdapterr goodadp= new MyAdapterr(Goods.this,suboptions,Images);
        goodlv1.setAdapter(goodadp);
    }
}
