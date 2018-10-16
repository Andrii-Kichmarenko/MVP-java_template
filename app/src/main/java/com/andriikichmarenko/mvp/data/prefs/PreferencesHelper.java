package com.andriikichmarenko.mvp.data.prefs;

import android.icu.util.LocaleData;

public interface PreferencesHelper {

    String getDepartureField();

    void setDepartureField(String departureBusStop);

    String getDestionationField();

    void setDestionationField(String destinationBusStop);

    int getStandardTickets();

    void setStandardTickets(int standardTicketsNumb);

    int getDiscountTickets();

    void setDiscountTickets(int discountTicketsNumb);

    String getDateField();

    void setDateField(String date);
}