package com.example.addy.gst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Aditya on 11/5/2017.
 */

public class Service5 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"services","services","services","services","services"};


    String [] description={"(i) Transport of passengers, with or without accompanied belongings, by rail in first class or air conditioned coach.\n" +
            "(ii) Transport of passengers, with or without accompanied belongings by-\n" +
            "(a) air conditioned contract carriage other than motorcab;\n" +
            "(b) air conditioned stage carriage;\n" +
            "(c) radio taxi.\n" +
            "Explanation.-\n" +
            "(a) “contract carriage” has the meaning assigned to it in clause (7) of section 2 of the Motor Vehicles Act, 1988 (59 of 1988);\n" +
            "(b) “stage carriage” has the meaning assigned to it in clause (40) of section 2 of the Motor Vehicles Act, 1988 (59 of 1988) ;\n" +
            "(c) “radio taxi” means a taxi including a radio cab, by whatever name called, which is in two-way radio communication with a central control office and is enabled for tracking using Global Positioning System (GPS) or General Packet Radio Service (GPRS).\n" +
            "(iii) Transport of passengers, with or without accompanied belongings, by air in economy class.\n" +
            "(iv) Transport of passengers, with or without accompanied belongings, by air, embarking from or terminating in a Regional Connectivity Scheme Airport, as notified by the Ministry of Civil Aviation.\n" +
            "(vi) Transport of passengers by motorcab where the cost of fuel is included in the consideration charged from the service recipient.",
    "(i) Transport of goods by rail (other than services specified at item no. (iv)).\n" +
            "(ii) Transport of goods in a vessel including services provided or agreed to be provided by a person located in non-taxable territory to a person located in non-taxable territory by way of transportation of goods by a vessel from a place outside India up to the customs station of clearance in India.\n" +
            "(iii) Services of goods transport agency (GTA) in relation to transportation of goods (including used household goods for personal use).\n" +
            "Explanation.- “goods transport agency” means any person who provides service in relation to transport of goods by road and issues consignment note, by whatever name called.",
            "(i) Renting of motorcab where the cost of fuel is included in the consideration charged from the service recipient.",
            "(i) Services of goods transport agency (GTA) in relation to transportation of goods (including used household goods for personal use).\n" +
                    "Explanation.- “goods transport agency” means any person who provides service in relation to transport of goods by road and issues consignment note, by whatever name called.",
            "(iv) Leasing of aircrafts by an operator for operating scheduled air transport service or  scheduled air cargo service by way of transaction covered by clause (f) paragraph 5 of Schedule II of the Central Goods and Services Act, 2017.\n" +
                    "Explanation.- \n" +
                    "(a) “operator” means a person, organisation or enterprise engaged in or offering to engage in aircraft operations;\n" +
                    "(b) “scheduled air transport service” means an air transport service undertaken between the same two or more places operated according to a published time table or with flights so regular or frequent that they constitute a recognisable systematic series, each flight being open to use by members of the public;\n" +
                    "(c) “scheduled air cargo service” means air transportation of cargo or mail on a scheduled basis according to a published time table or with flights so regular or frequent that they constitute a recognisably systematic series, not open to use by passengers."

    };
    String[] rate={"5","5","5","5","5"};
    String[]hsn={"Heading  9964","Heading  9965","Heading  9966","Heading  9967","Heading  9971"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv = (ListView) findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3 = new MyAdapter3(Service5.this, type, description, rate, hsn);
        goodlv.setAdapter(myAdapter3);

    }
    }
