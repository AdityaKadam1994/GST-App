package com.example.addy.gst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Aditya on 11/5/2017.
 */

public class Goods12 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"goods","goods","goods","goods","goods","goods","goods","goods","good","good","good","good","good","good","good","good","good","good","good","good","good","good","good","good"};


    String [] description={"Live horses","Meat of bovine animals, frozen and put up in unit containers","Meat of swine, frozen and put up in unit containers","Meat of sheep or goats, frozen and put up in unit containers","Meat of horses, asses, mules or hinnies," +
            " frozen and put up in unit containers","Edible offal of bovine animals, swine, sheep, goats, horses, asses, mules or hinnies, frozen and put up in unit containers","Meat and edible offal, of the poultry of heading 0105, frozen and put up in unit containers",
    "Other meat and edible meat offal, frozen and put up in unit containers","Pig fat, free of lean meat, and poultry fat, not rendered or otherwise extracted, frozen and put up in unit containers","Pig fat, free of lean meat, and poultry fat, not rendered or otherwise extracted, salted, in brine, dried or smoked, put up in unit containers",
    "Meat and edible meat offal, salted, in brine, dried or smoked put up in unit containers; edible flours and meals of meat or meat offal put up in unit containers","Butter and other fats (i.e. ghee, butter oil, etc.) and oils derived from milk; dairy spreads","Cheese","Brazil nuts, dried, whether or not shelled or peeled",
    "Other nuts, dried, whether or not shelled or peeled, such as Almonds, Hazelnuts or filberts (Coryius spp.), walnuts, Chestnuts (Castanea spp.), Pistachios, Macadamia nuts, Kola nuts (Cola spp.) [other than dried areca nuts]","Dates, figs, pineapples, avocados, guavas, mangoes and mangosteens, dried",
    "Fruit, dried, other than that of headings 0801 to 0806; mixtures of nuts or dried fruits of Chapter 8","Starches; inulin","Pig fats (including lard) and poultry fat, other than that of heading 0209 or 1503","Fats of bovine animals, sheep or goats, other than those of heading 1503","Lard stearin, lard oil, oleo stearin," +
            " oleo-oil and tallow oil, not emulsified or mixed or otherwise prepared","Fats and oils and their fractions, of fish or marine mammals, whether or not refined, but not chemically modified","Wool grease and fatty substances derived therefrom (including lanolin)","Other animal fats and oils and their fractions, whether or not refined, but not chemically modified"};
    String[] rate={"12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12","12"};
    String[]hsn={"01012100, 010129","202","203","204","205","206","207","208","209","209","210","405","406","801","802","804","813","1108","1501",
    "1502","1503","1504","1505","1506"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv=(ListView)findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3= new MyAdapter3(Goods12.this,type,description,rate,hsn);
        goodlv.setAdapter(myAdapter3);
    }
}
