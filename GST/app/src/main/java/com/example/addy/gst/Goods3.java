package com.example.addy.gst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Goods3 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"goods","goods","goods","goods","goods","goods","goods","goods","good","good","good","good","good","good","good"};


    String [] description={"Pearls, natural or cultured, whether or not worked or graded but not strung, mounted or set; pearls, natural or cultured, temporarily strung for convenience of transport","Diamonds, whether or not worked, but not mounted or set [other than Non-Industrial Unworked or simply sawn," +
            " cleaved or bruted]","Dust and powder of natural or synthetic precious or semi-precious stones","Base metals clad with silver, not further worked than semi-manufactured","Silver (including silver plated with gold or platinum), unwrought or in semi-manufactured forms, or in powder form",
            "Gold (including gold plated with platinum) unwrought or in semi-manufactured forms, or in powder form","Base metals or silver, clad with gold, not further worked than semi-manufactured","Platinum, unwrought or in semi-manufactured forms, or in powder form","Base metals, silver or gold, clad with platinum, not" +
            " further worked than semi-manufactured","Articles of jewellery and parts thereof, of precious metal or of metal clad with precious metal","Articles of goldsmiths' or silversmiths' wares and parts thereof, of precious metal or of metal clad with precious metal","Other articles of precious metal or of metal clad with precious metal",
    "Articles of natural or cultured pearls, precious or semi-precious stones (natural, synthetic or reconstructed)","Imitation jewellery","coin"};
    String[] rate={"3","3","3","3","3","3","3","3","3","3","3","3","3","3","3"};
    String[]hsn={"7101","7102","7105","7107","7106","7108","7109","7110","7111","7113","7114","7115","7116","7117","7118"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv=(ListView)findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3= new MyAdapter3(Goods3.this,type,description,rate,hsn);
        goodlv.setAdapter(myAdapter3);
    }
}
