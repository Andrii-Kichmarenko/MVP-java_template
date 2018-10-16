package com.andriikichmarenko.mvp.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.andriikichmarenko.mvp.di.ApplicationContext;
import com.andriikichmarenko.mvp.di.PreferenceInfo;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class AppPreferencesHelper implements PreferencesHelper {

    private static final String PREF_KEY_DEPARTURE_BUS_STOP = "PREF_KEY_DEPARTURE_BUS_STOP";
    private static final String PREF_KEY_DESTINATION_BUS_STOP = "PREF_KEY_DESTINATION_BUS_STOP";
    private static final String PREF_KEY_STANDARD_TICKETS_NUMBER = "PREF_KEY_STANDARD_TICKETS_NUMBER";
    private static final String PREF_KEY_DISCOUNT_TICKETS_NUMBER = "PREF_KEY_DISCOUNT_TICKETS_NUMBER";
    private static final String PREF_KEY_TRIP_DATE = "PREF_KEY_TRIP_DATE";

    private SharedPreferences mPrefs;

    public AppPreferencesHelper(@ApplicationContext Context context,
                                @PreferenceInfo String prefsFileName) {
        this.mPrefs = context.getSharedPreferences(prefsFileName, Context.MODE_PRIVATE);
    }

    @Override
    public String getDepartureField() {
        return mPrefs.getString(PREF_KEY_DEPARTURE_BUS_STOP, null);
    }

    @Override
    public void setDepartureField(String departureBusStop) {
        mPrefs.edit().putString(PREF_KEY_DEPARTURE_BUS_STOP, departureBusStop).apply();
    }

    @Override
    public String getDestionationField() {
        return mPrefs.getString(PREF_KEY_DESTINATION_BUS_STOP, null);
    }

    @Override
    public void setDestionationField(String destinationBusStop) {
        mPrefs.edit().putString(PREF_KEY_DESTINATION_BUS_STOP, destinationBusStop).apply();
    }

    @Override
    public int getStandardTickets() {
        return mPrefs.getInt(PREF_KEY_STANDARD_TICKETS_NUMBER, 1);
    }

    @Override
    public void setStandardTickets(int standardTicketsNumb) {
        mPrefs.edit().putInt(PREF_KEY_STANDARD_TICKETS_NUMBER, standardTicketsNumb).apply();

    }

    @Override
    public int getDiscountTickets() {
        return mPrefs.getInt(PREF_KEY_DISCOUNT_TICKETS_NUMBER, 0);
    }

    @Override
    public void setDiscountTickets(int discountTicketsNumb) {
        mPrefs.edit().putInt(PREF_KEY_DISCOUNT_TICKETS_NUMBER, discountTicketsNumb).apply();
    }

    @Override
    public String getDateField() {
        String date = mPrefs.getString(PREF_KEY_TRIP_DATE, null);
        if(date == null) {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH);
            String strMonth = new DateFormatSymbols().getShortMonths()[month];
            date = strMonth + " " + day + ", " + year;
        }
        return date;
    }

    @Override
    public void setDateField(String date) {
        mPrefs.edit().putString(PREF_KEY_TRIP_DATE, date).apply();
    }
}
