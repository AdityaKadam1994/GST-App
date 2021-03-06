package com.example.addy.gst;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aditya on 10/30/2017.
 */

class MyAdapterr extends ArrayAdapter<String> {
    String [] opt;
    int [] img;
    Context mycontext;
    public MyAdapterr(@NonNull Context context, String[]suboptions, int[] Images) {
        super(context, R.layout.goodlvlayout);
        this.opt=suboptions;
        this.img=Images;
        this.mycontext=context;
    }

    @Override

    public int getCount(){
        return opt.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder1 myViewHolder= new ViewHolder1();
        if (convertView==null) {
            LayoutInflater layoutInflater1 = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater1.inflate(R.layout.goodlvlayout, parent, false);
            myViewHolder.gimg = (ImageView) convertView.findViewById(R.id.goodimageView);
            myViewHolder.gopt = (TextView) convertView.findViewById(R.id.goodtextView);
            convertView.setTag(myViewHolder);
        } else {
            myViewHolder=(ViewHolder1)convertView.getTag();
        }
        myViewHolder.gimg.setImageResource(img[position]);
        myViewHolder.gopt.setText(opt[position]);

        return convertView;
    }

    static class ViewHolder1{
        ImageView gimg;
        TextView gopt;
    }
}
