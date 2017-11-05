package com.example.addy.gst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Aditya on 11/5/2017.
 */

public class Goods5 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"goods","goods","goods","goods","goods","goods","goods","goods","good","good","good","good","good","good","good","goods","goods","goods","goods","goods","goods","goods"};


    String [] description={"Fish, frozen, excluding fish fillets and other fish meat of heading 0304","Fish fillets and other fish meat (whether or not minced), frozen","Fish, dried, salted or in brine; smoked fish, whether or not cooked before or during the smoking process; flours, meals and pellets of fish, fit for human consumption",
            "Crustaceans, whether in shell or not, frozen, dried, salted or in brine; crustaceans, in shell, cooked by steaming or by boiling in water, frozen, dried, salted or in brine; flours, meals and pellets of crustaceans, fit for human consumption","Molluscs, whether in shell or not, frozen, dried, salted or in brine; aquatic invertebrates" +
            " other than crustaceans and molluscs, frozen, dried, salted or in brine; flours, meals and pellets of aquatic invertebra other than crustaceans, fit for human consumption","Aquatic invertebrates other than crustaceans and molluscs, frozen, dried, salted or in brine; smoked aquatic invertebrates other than crustaceans and molluscs," +
            " whether or not cooked before or during the smoking process: flours, meals and pellets of aquatic invertebrates other than crustaceans and molluscs, fit for human consumption","Ultra High Temperature (UHT) milk","Milk and cream, concentrated or containing added sugar or other sweetening matter, including skimmed milk powder, milk food for babies [other than condensed milk]",
    "Cream, yogurt, kephir and other fermented or acidified milk and cream, whether or not concentrated or containing added sugar or other sweetening matter or flavoured or containing added fruit, nuts or cocoa","Whey, whether or not concentrated or containing added sugar or other sweetening matter; products consisting of natural milk constituents, whether or not containing added sugar" +
            " or other sweetening matter, not elsewhere specified or included","Chena or paneer put up in unit container and bearing a registered brand name","Birds' eggs, not in shell, and egg yolks, fresh, dried, cooked by steaming or by boiling in water, moulded, frozen or otherwise preserved, whether or not containing added sugar or other sweetening matter.",
    "Natural honey, put up in unit container and bearing a registered brand name","Edible products of animal origin, not elsewhere specified or included","Pigs', hogs' or boars' bristles and hair; badger hair and other brush making hair; waste of such bristles or hair.","Guts, bladders and stomachs of animals (other than fish), whole and pieces thereof, fresh, chilled, frozen, salted, in brine, dried or smoked.",
    "Skins and other parts of birds, with their feathers or down, feathers and parts of feathers (whether or not with trimmed edges) and down, not further worked than cleaned, disinfected or treated for preservation; powder and waste of feathers or parts of feathers","Ivory, tortoise-shell, whalebone and whalebone hair, horns, unworked or simply prepared but not cut to shape; powder and waste of these products.",
    "Coral and similar materials, unworked or simply prepared but not otherwise worked; shells of molluscs, crustaceans or echinoderms and cuttle-bone, unworked or simply prepared but not cut to shape, powder and waste thereof.","Ambergris, castoreum, civet and musk; cantharides; bile, whether or not dried; glands and other animal products used in the preparation of pharmaceutical products, fresh, chilled, frozen or otherwise provisionally preserved.",
    "Animal products not elsewhere specified or included; dead animals of Chapter 1 or 3, unfit for human consumption, other than semen including frozen semen.","Herb, bark, dry plant, dry root, commonly known as jaribooti and dry flower"};
    String[] rate={"5","5","5","5","5","5","5","5","5","5","5","5","5","5","5","5","5","5","5","5","5","5"};
    String[]hsn={"303","304","305","306","307","308","401","402","403","404","406","408","409","410","502","504","505","0507[Except 050790]","508","510","511","7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv=(ListView)findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3= new MyAdapter3(Goods5.this,type,description,rate,hsn);
        goodlv.setAdapter(myAdapter3);
    }
}
