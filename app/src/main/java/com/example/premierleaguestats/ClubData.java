package com.example.premierleaguestats;

import android.util.Log;

import java.util.ArrayList;

public class ClubData {
    private static final String TAG = "MyActivity";

    public static String[][] data = new String[][]{
            {"AFC Bournemouth", "Eddie Howe", "Vitality Stadium", "www.afcb.co.uk","0"},
            {"Arsenal", "Unai Emery", "Emirates Stadium", "www.arsenal.com","1"}
    };

    public static ArrayList<Club> getListData() {
        ArrayList<Club> list = new ArrayList<>();
        for (String[] aData : data) {
            Club club = new Club();
            club.setName(aData[0]);
            club.setManager(aData[1]);
            club.setStadium(aData[2]);
            club.setWebsite(aData[3]);
            club.setIndex(aData[4]);
            club.setPhoto("https://hacktiv8.com/img/logo-hacktiv8_bordered.png");
            list.add(club);
            Log.d(TAG, aData[0]);

        }
        return list;
    }
}
