package com.example.addy.gst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.io.PrintStream;

public class Goods0 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods","goods",
            "goods","goods","goods","goods","goods"};


    String [] description={"Live asses, mules and hinnies","Live bovine animals","Live swine","Live sheep and goats","Live poultry, that is to say, fowls of the species Gallus domesticus, ducks, geese, turkeys and guinea fowls.",
    "Other live animal such as Mammals, Birds, Insects","Meat of bovine animals, fresh and chilled.","Meat of bovine animals frozen [other than frozen and put up in unit container]",
    "Meat of swine, fresh, chilled or frozen [other than frozen and put up in unit container]","Meat of sheep or goats, fresh, chilled or frozen [other than frozen and put up in unit container]",
    "Meat of horses, asses, mules or hinnies, fresh, chilled or frozen [other than frozen and put up in unit container]","Other meat and edible meat offal, fresh, chilled or frozen [other than frozen and put up in unit container]",
    "Pig fat, free of lean meat, and poultry fat, not rendered or otherwise extracted, fresh, chilled or frozen [other than frozen and put up in unit container]",
    "Pig fat, free of lean meat, and poultry fat, not rendered or otherwise extracted, salted, in brine, dried or smoked [other than put up in unit containers]",
    "Meat and edible meat offal, salted, in brine, dried or smoked; edible flours and meals of meat or meat offal, other than put up in unit containers","Fish seeds, prawn / shrimp seeds whether or not processed, cured or in frozen state [other than goods falling under Chapter 3 and attracting 5%]",
    "Live fish.","Fish, fresh or chilled, excluding fish fillets and other fish meat of heading 0304","Crustaceans, whether in shell or not, live, fresh or chilled; crustaceans, in shell, cooked by steaming or by boiling in water live, fresh or chilled.",
    "Molluscs, whether in shell or not, live, fresh, chilled; aquatic invertebrates other than crustaceans and molluscs, live, fresh or chilled.","Fresh milk and pasteurised milk, including separated milk, milk and cream, not concentrated nor containing added sugar or other sweetening matter, excluding Ultra High Temperature (UHT) milk",
    "Curd; Lassi; Butter milk","Chena or paneer, other than put up in unit containers and bearing a registered brand name"};
    String[] rate={"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"};
    String[]hsn={"101","102","103","104","105","106","201","202","203","204","205","208","209","209","210","3","301","302","306","307","401"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        final MyAdapter3 myAdapter3= new MyAdapter3(Goods0.this,type,description,rate,hsn);

        goodlv=(ListView)findViewById(R.id.goods0lv);

        goodlv.setAdapter(myAdapter3);
    }
}
