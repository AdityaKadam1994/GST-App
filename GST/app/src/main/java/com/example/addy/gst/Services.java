package com.example.addy.gst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Services extends AppCompatActivity {

    ListView serviceslv1;
    String [] servicesoptions={"Services @0%","Services @5%","Services @12%","Services @18%","Services @28%"};
    int []Images= {R.drawable.services,R.drawable.services,R.drawable.services,R.drawable.services,R.drawable.services,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        serviceslv1=(ListView)findViewById(R.id.serviceslv);
        MyAdapter1 servicesadp= new MyAdapter1(Services.this,servicesoptions,Images);
        serviceslv1.setAdapter(servicesadp);
        serviceslv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent= new Intent(Services.this,Service28.class);
                    startActivity(intent);
                }
            }
        });
    }
}
