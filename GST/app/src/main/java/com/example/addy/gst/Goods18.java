package com.example.addy.gst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Aditya on 11/5/2017.
 */

public class Goods18 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"goods","goods","goods","goods","goods","goods","goods","goods","good","good","good","good","good","good","good"};


    String [] description={"Condensed milk","Malt, whether or not roasted","Vegetable saps and extracts; pectic substances, pectinates and pectates; agar-agar and other mucilages and thickeners, whether or not modified, derived from vegetable products.",
            "Bidi wrapper leaves (tendu)","Indian katha","All goods i.e. Margarine, Linoxyn","Glycerol, crude; glycerol waters and glycerol lyes","Vegetable waxes (other than triglycerides), Beeswax, other insect waxes and spermaceti, whether or not refined or coloured",
    "Degras, residues resulting from the treatment of fatty substances or animal or vegetable waxes","All goods, including refined sugar containing added flavouring or colouring matter, sugar cubes","Other sugars, including chemically pure lactose, maltose," +
            " glucose and fructose, in solid form; sugar syrups not containing added flavouring or colouring matter; artificial honey, whether or not mixed with natural honey; caramel [other than palmyra sugar and Palmyra jaggery]","Sugar confectionery (excluding white chocolate and bubble / chewing gum) [other than bura, batasha]",
    "Preparations suitable for infants or young children, put up for retail sale","Pasta, whether or not cooked or stuffed (with meat or other substances) or otherwise prepared, such as spaghetti, macaroni, noodles, lasagne, gnocchi, ravioli, cannelloni; couscous, whether or not prepared",
    "All goods i.e. Corn flakes, bulgar wheat, prepared foods obtained from cereal flakes [other than Puffed rice, commonly known as Muri, flattened or beaten rice, commonly known as Chira, parched rice, commonly known as khoi, parched paddy or rice coated with sugar or gur, commonly known as Murki]"};
    String[] rate={"18","18","18","18","18","18","18","18","18","18","18","18","18","18","18"};
    String[]hsn={"0402 91 10,  0402 99 20","1107","1302","1404 90 10","1404 90 50","1517 10","1520 00 00","1521","1522","1701 91, 1701 99",
            "1702","1704","1901","1902","1904 [other than 1904 10 20]"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv=(ListView)findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3= new MyAdapter3(Goods18.this,type,description,rate,hsn);
        goodlv.setAdapter(myAdapter3);
    }
}
