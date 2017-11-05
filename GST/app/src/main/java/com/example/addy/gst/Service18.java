package com.example.addy.gst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Aditya on 11/5/2017.
 */

public class Service18 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"services","services","services","services","services","services","services","services","services","services"};


    String [] description={"(i) Construction of a complex, building, civil structure or a part thereof, including a complex or building intended for sale to a buyer, wholly or partly, except where the entire consideration has been received after issuance of completion certificate, where required, by the competent authority or after its first occupation, whichever is earlier. \n" +
            "(Provisions of paragraph 2 of this notification shall apply for valuation of this service)\n" +
            "(ii) composite supply of works contract as defined in clause 119 of section 2 of Central Goods and Services Tax Act, 2017.\n" +
            "(iii) construction services other than (i) and (ii) above.",
    "Services in wholesale trade.\n" +
            "Explanation-This  service does not include sale or purchase of goods but includes:\n" +
            "– Services of commission agents, commodity brokers, and auctioneers and all other traders who negotiate whole sale commercial transactions between buyers and sellers, for a fee or commission’\n" +
            "– Services of electronic whole sale agents and brokers,\n" +
            "– Services of whole sale auctioning houses.",
    "Services in retail trade.\n" +
            "Explanation- This service does not include sale or purchase of goods",
    "(iii) Supply, by way of or as part of any service or in any other manner whatsoever, of goods, being food or any other article for human consumption or any drink, where such supply or service is for cash, deferred payment or other valuable consideration, provided by a restaurant, eating joint including mess, canteen, having licence or permit or by whatever name called to serve alcoholic liquor for human consumption.\n" +
            "(iv) Supply, by way of or as part of any service or in any other manner whatsoever, of goods, being food or any other article for human consumption or any drink, where such supply or service is for cash, deferred payment or other valuable consideration, provided by a restaurant, eating joint including mess, canteen, having the facility of air-conditioning or central air-heating in any part of the establishment, at any time during the year.\n" +
            "(v) Supply, by way of or as part of any service or in any other manner whatsoever in outdoor catering wherein goods, being food or any other article for human consumption or any drink (whether or not alcoholic liquor for human consumption), as a part of such outdoor catering and such supply or service is for cash, deferred payment or other valuable consideration.\n" +
            "(vi) Accommodation in hotels, inns, guest houses, clubs, campsites or other commercial places meant for residential or lodging purposes having declared tariff of a unit of accommodation of two thousand five hundred rupees and above but less than seven thousand five hundred rupees per unit per day or equivalent.\n" +
            "Explanation.- “declared tariff” includes charges for all amenities provided in the unit of accommodation (given on rent for stay) like furniture, air conditioner, refrigerators or any other amenities, but without excluding any discount offered on the published charges for such unit.\n" +
            "(vii) Supply, by way of or as part of any service or in any other manner whatsoever, of goods, including but not limited to food or any other article for human consumption or any drink (whether or not alcoholic liquor for human consumption), where such supply or service is for cash, deferred payment or other valuable consideration, in a premises (including hotel, convention center, club, pandal, shamiana or any other place, specially arranged for organising a function) together with renting of such premises.\"\n" +
            "(ix) Accommodation, food and beverage services other than (i), (ii), (iii), (iv), (v), (vi), (vii) and (viii) above.",
    "(vii) Passenger transport services other than (i), (ii), (iii), (iv), (v) and (vi) above.","(v) Goods transport services other than (i), (ii), (iii) and (iv) above.","(ii) Rental services of transport vehicles with or without operators, other than (i)  above.",
    "(ii) Supporting services in transport other than (i) above.","Postal and courier services.","Electricity, gas, water and other distribution services.","Real estate services."};
    String[] rate={"18","18","18","18","18","18","18","18","18","18"};
    String[]hsn={"Heading 9954 (Construction services)","Heading  9961","Heading  9962","Heading  9963","Heading  9964","Heading  9965","Heading  9966","Heading 9967","Heading  9968","Heading 9969"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv = (ListView) findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3 = new MyAdapter3(Service18.this, type, description, rate, hsn);
        goodlv.setAdapter(myAdapter3);
    }
    }
