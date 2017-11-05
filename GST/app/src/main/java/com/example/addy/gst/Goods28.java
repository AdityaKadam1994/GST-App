package com.example.addy.gst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Goods28 extends AppCompatActivity {
    ListView goodlv;
    String [] type ={"goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods",
            "goods","goods"};
    String [] description={"Molasses","Chewing gum / bubble gum and white chocolate, not containing cocoa","Cocoa butter,fat and oil","Cocoa powder, not containing added sugar or sweetening matter",
            "Chocolates and other food preparations containing cocoa","Waffles and wafers coated with chocolate or containing chocolate","Pan masala","Other non-alcoholic beverages",
            "All goods [including aerated waters], containing added sugar or other sweetening matter or flavoured","Unmanufactured tobacco; tobacco refuse [other than tobacco leaves]",
            "Cigars, cheroots, cigarillos and cigarettes, of tobacco or of tobacco substitutes","Marble and travertine, other than blocks","Granite, other than blocks","Avgas",
            "Perfumes and toilet waters","Modelling pastes, including those put up for children's amusement","Articles of apparel and clothing accessories, of leather or of composition leather",
            "Other articles of leather or of composition leather"};
    String[] rate={"28","28","28","28","28","28","28","28","28","28","28","28","28","28","28","28","28","28"};
    String[]hsn={"1703","1704","1804","1805","1806","1905 32","2106 90 20","2202 90 90","2202 10","2401","2402","2515 12 20, 2515 12 90","2516 12 00","2710",
            "3303","3407","4203","4205"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods28);
        final MyAdapter3 myAdapter3= new MyAdapter3(Goods28.this,type,description,rate,hsn);
        // searchView= (SearchView)findViewById(R.id.Search28);
        goodlv=(ListView)findViewById(R.id.goods28lv);

        // final Service28adapter adapter= new Service28adapter(this,getItems());
        goodlv.setAdapter(myAdapter3);


    }
}
