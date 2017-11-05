package com.example.addy.gst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Service28 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"services","services"};


    String [] description={"(viii) Accommodation in hotels including five star hotels, inns, guest houses, clubs, campsites or other commercial places meant for residential or lodging purposes having declared tariff of a unit of accommodation of seven thousand and five hundred rupees and above per unit per day or equivalent.\n" +
            "Explanation.-“declared tariff ” includes charges for all amenities provided in the unit of accommodation (given on rent for stay) like furniture, air conditioner, refrigerators or any other amenities, but without excluding any discount offered on the published charges for such unit.",
    "(iii) Services by way of admission to entertainment events or access to amusement facilities including exhibition of cinematograph films, theme parks, water parks, joy rides, merry-go rounds, go-carting, casinos, race-course, ballet, any sporting event such as Indian Premier League and the like. \n" +
            "(iv) Services provided by a race club by way of totalisator or a license to bookmaker in such club.\n" +
            "(v) Gambling."};
    String[] rate={"28","28"};
    String[]hsn={"Heading  9963","Heading  9996"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv=(ListView)findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3= new MyAdapter3(Service28.this,type,description,rate,hsn);
        goodlv.setAdapter(myAdapter3);


       // final Service28adapter adapter= new Service28adapter(this,getItems());

        /*searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                adapter.getFilter().filter(query);
                return false;

            }
        });

         private ArrayList<Item> getItems()
    {
        ArrayList<Item> items= new ArrayList<Item>();
        Item it;
        for (int i =0; i< type.length;i++)
        {
            it= new Item(type[i],description[i],rate[i],hsn[i]);
            items.add(it);

        }

        return items;

    }

        */


    }


}
