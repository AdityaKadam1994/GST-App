package com.example.addy.gst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Aditya on 11/5/2017.
 */

public class Service12 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"services","services","services","services","services"};


    String [] description={"(i) Supply, by way of or as part of any service or in any other manner whatsoever, of goods, being food or any other article for human consumption or drink, where such supply or service is for cash, deferred payment or other valuable consideration, provided by a restaurant, eating joint including mess, canteen, neither having the facility of air-conditioning or central air-heating in any part of the establishment, at any time during the year and nor having licence or permit or by whatever name called to serve alcoholic liquor for human consumption.\n" +
            "(ii) Accommodation in hotels, inns, guest houses, clubs, campsites or other commercial places meant for residential or lodging purposes having declared tariff of a unit of accommodation of one thousand rupees and above but less than two  thousand five hundred rupees per unit per day or equivalent.\n" +
            "Explanation.- “declared tariff” includes charges for all amenities provided in the unit of accommodation (given on rent for stay) like furniture, air conditioner, refrigerators or any other amenities, but without excluding any discount offered on the published charges for such unit.",
    "(v) Transport of passengers by air, with or without accompanied belongings, in other than economy class.","(iv) Transport of goods in containers by rail by any person other than Indian Railways.",
    "(i) Services provided by a foreman of a chit fund in relation to chit.\n" +
            "Explanation.-\n" +
            "(a) \"chit\" means a transaction whether called chit, chit fund, chitty, kuri, or by whatever name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical instalments over a definite period and that each subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to a prize amount;\n" +
            "(b) “foreman of a chit fund” shall have the same meaning as is assigned to the expression “foreman” in clause (j) of section 2 of the Chit Funds Act, 1982 (40 of 1982).\n" +
            "(i) Services provided by a foreman of a chit fund in relation to chit.\n" +
            "Explanation.-\n" +
            "(a) \"chit\" means a transaction whether called chit, chit fund, chitty, kuri, or by whatever name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical instalments over a definite period and that each subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to a prize amount;\n" +
            "(b) “foreman of a chit fund” shall have the same meaning as is assigned to the expression “foreman” in clause (j) of section 2 of the Chit Funds Act, 1982 (40 of 1982).\n" +
            "(i) Services provided by a foreman of a chit fund in relation to chit.\n" +
            "Explanation.-\n" +
            "(a) \"chit\" means a transaction whether called chit, chit fund, chitty, kuri, or by whatever name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical instalments over a definite period and that each subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to a prize amount;\n" +
            "(b) “foreman of a chit fund” shall have the same meaning as is assigned to the expression “foreman” in clause (j) of section 2 of the Chit Funds Act, 1982 (40 of 1982).",
    "(i) Temporary or permanent transfer or permitting the use or enjoyment of Intellectual Property (IP) right in respect of goods other than Information Technology software."};
    String[] rate={"12","12","12","12","12"};
    String[]hsn={"Heading  9963","Heading  9964","Heading  9965","Heading  9971","Heading  9973"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv = (ListView) findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3 = new MyAdapter3(Service12.this, type, description, rate, hsn);
        goodlv.setAdapter(myAdapter3);
    }
    }
