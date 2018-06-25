package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by himanshuyadav on 11/06/18.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView mTextViewmag = (TextView) listItemView.findViewById(R.id.mag);
        mTextViewmag.setText(currentEarthquake.getmag());

        TextView mTextViewplace = (TextView) listItemView.findViewById(R.id.place);
        mTextViewplace.setText(currentEarthquake.getplace());

        TextView mTextViewdate = (TextView) listItemView.findViewById(R.id.date);
        mTextViewdate.setText(currentEarthquake.getdate());



        return listItemView;

    }
}
