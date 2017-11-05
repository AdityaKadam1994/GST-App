package com.example.addy.gst;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aditya on 11/4/2017.
 */

public class Service28adapter extends BaseAdapter implements Filterable {
    Context c;
   public ArrayList<Item> items;
    public CustomFilter filter;
    public ArrayList<Item> filterList;

    public Service28adapter(Context context, ArrayList<Item> items) {
        this.c = context;
        this.items = items;
        this.filterList = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int pos) {
        return items.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return items.indexOf(getItemId(pos));


    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.service28row, null);

        }
        TextView type = convertView.findViewById(R.id.type);
        TextView desc = convertView.findViewById(R.id.description);
        TextView rate = convertView.findViewById(R.id.rate);
        TextView hsn = convertView.findViewById(R.id.hsn);

        type.setText(items.get(pos).getType());
        desc.setText(items.get(pos).getDescription());
        rate.setText(items.get(pos).getRate());
        hsn.setText(items.get(pos).getHsn());
        return convertView;

    }

    @Override
    public Filter getFilter() {
        if (filter==null){
            filter=new CustomFilter();
        }
        return filter;
    }


    //Inner Class
    class CustomFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint != null && constraint.length() > 0) {
                constraint = constraint.toString().toUpperCase();
                ArrayList<Item> filters = new ArrayList<Item>();
                for (int i = 0; i < filterList.size(); i++) {
                    if(filterList.get(i).getDescription().toUpperCase().contains(constraint))
                    {
                        Item it = new Item(filterList.get(i).getType(),filterList.get(i).getDescription(),filterList.get(i).getRate(),filterList.get(i).getHsn());
                        filters.add(it);
                    }
                }
                results.count= filters.size();
                results.values=filters;
            }else
            {
                results.count= filterList.size();
                results.values=filterList;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
                items=(ArrayList<Item>)results.values;
                notifyDataSetChanged();
        }
    }
}