package com.example.addy.gst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


/**
 * Created by Aditya on 11/5/2017.
 */

public class Service0 extends AppCompatActivity {
    private ListView goodlv;
    String [] type ={"services","services","services","services","services","services","services","services"};


    String [] description={"(i) Support services to agriculture, forestry, fishing, animal husbandry. \n" +
            "Explanation. - Support services to agriculture, forestry, fishing, animal husbandry mean - \n" +
            "(i) Services relating to cultivation of plants and rearing of all life forms of animals, except the rearing of horses, for food, fibre, fuel, raw material or other similar products or agricultural produce by way of—\n" +
            "(a) agricultural operations directly related to production of any agricultural produce including cultivation, harvesting, threshing, plant protection or testing;\n" +
            "(b) supply of farm labour; \n" +
            "(c) processes carried out at an agricultural farm including tending, pruning, cutting, harvesting, drying, cleaning, trimming, sun drying, fumigating, curing, sorting, grading, cooling or bulk packaging and such like operations which do not alter the essential characteristics of agricultural produce but make it only marketable for the primary market; \n" +
            "(d) renting or leasing of agro machinery or vacant land with or without a structure incidental to its use; \n" +
            "(e) loading, unloading, packing, storage or warehousing of agricultural produce;\n" +
            "(f) agricultural extension services;\n" +
            "(g) services by any Agricultural Produce Marketing Committee or Board or services provided by a commission agent for sale or purchase of agricultural produce.\n" +
            "(ii) Services by way of pre-conditioning, pre-cooling, ripening, waxing, retail packing, labelling of fruits and vegetables which do not change or alter the essential characteristics of the said fruits or vegetables.\n" +
            "(iii) Carrying out an intermediate production process as job work in relation to cultivation of plants and rearing of all life forms of animals, except the rearing of horses, for food, fibre, fuel, raw material or other similar products or agricultural produce.",
    "Services by an entity registered under section 12AA of the Income-tax Act, 1961 (43 of 1961) by way of charitable activities.","Services by way of transfer of a going concern, as a whole or an independent part thereof.","Pure services (excluding works contract service or other composite supplies involving supply of any goods) provided to the Central Government," +
            " State Government or Union territory or local authority or a Governmental authority by way of any activity in relation to any function entrusted to a Panchayat under article 243G of the Constitution or in relation to any function entrusted to a Municipality under article 243W of the Constitution.",
    "Pure services (excluding works contract service or other composite supplies involving supply of any goods) provided to the Central Government, State Government or Union territory or local authority or a Governmental authority by way of any activity in relation to any function entrusted to a Panchayat under article 243G of the Constitution or in relation to any function entrusted to a Municipality under article 243W of the Constitution."
    ,"Services by Central Government, State Government, Union territory, local authority or governmental authority by way of any activity in relation to any function entrusted to a municipality under article 243 W of the Constitution.",
    "Services by a governmental authority by way of any activity in relation to any function entrusted to a Panchayat under article 243G of the Constitution.","Services by the Central Government, State Government, Union territory or local authority excluding the following services—\n" +
            "(a) services by the Department of Posts by way of speed post, express parcel post, life insurance, and agency services provided to a person other than the Central Government, State Government, Union territory;\n" +
            "(b) services in relation to an aircraft or a vessel, inside or outside the precincts of a port or an airport;\n" +
            "(c) transport of goods or passengers; or\n" +
            "(d) any service, other than services covered under entries (a) to (c) above, provided to business entities.","Services provided by the Central Government, State Government, Union territory or local authority to a business entity with an aggregate turnover of up to twenty lakh rupees (ten lakh rupees in case of a special category state) in the preceding financial year. \n" +
            "Explanation.- For the purposes of this entry, it is hereby clarified that the provisions of this entry shall not be applicable to- \n" +
            "(a) services,-\n" +
            "(i) by the Department of Posts by way of speed post, express parcel post, life insurance, and agency services provided to a person other than the Central Government, State Government, Union territory; \n" +
            "(ii) in relation to an aircraft or a vessel, inside or outside the precincts of a port or an airport; \n" +
            "(iii) of transport of goods or passengers; and \n" +
            "(b) services by way of renting of immovable property."};
    String[] rate={"28","28","28","28","28","28","28","28"};
    String[]hsn={"Heading 9986","Chapter 99","Chapter 99","Chapter 99","Chapter 99","Chapter 99","Chapter 99","Chapter 99"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods0);
        goodlv = (ListView) findViewById(R.id.goods0lv);
        final MyAdapter3 myAdapter3 = new MyAdapter3(Service0.this, type, description, rate, hsn);
        goodlv.setAdapter(myAdapter3);
    }
}
