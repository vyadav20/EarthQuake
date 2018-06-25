package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.mag;

/**
 * Created by himanshuyadav on 11/06/18.
 */

public class Earthquake {

    private String mmag;
    private String mplace;
    private String mdate;

    public Earthquake(String mag, String place, String date) {
        mmag = mag;
        mplace = place;
        mdate = date;
    }

    public String getmag() {
        return mmag;
    }

    public String getplace() {
        return mplace;
    }

    public String getdate() {
        return mdate;
    }


}
