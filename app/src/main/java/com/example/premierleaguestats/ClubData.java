package com.example.premierleaguestats;

import android.util.Log;

import java.util.ArrayList;

public class ClubData {
    private static final String TAG = "MyActivity";

    public static String[][] data = new String[][]{
            {"Arsenal","Unai Emery","Emirates Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4dsgumo7d4zupm2ugsvm4zm4d.png","www.arsenal.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t3.jpg","#FE0002","0"},
            {"Aston Villa","Dean Smith","Villa Park","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_b496gs285it6bheuikox6z9mj.png","www.avfc.co.uk","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t7.jpg","#480025","1"},
            {"AFC Bournemouth","Eddie Howe","Vitality Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_1pse9ta7a45pi2w2grjim70ge.png","www.afcb.co.uk","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t91.jpg","#E62333","2"},
            {"Brighton and Hove Albion","Graham Potter","Amex Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_e5p0ehyguld7egzhiedpdnc3w.png","www.brightonandhovealbion.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t36.jpg","#0054A6","3"},
            {"Burnley","Sean Dyche","Turf Moor","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_64bxxwu2mv2qqlv0monbkj1om.png","www.burnleyfootballclub.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t90.jpg","#6A003A","4"},
            {"Chelsea","Frank Lampard","Stamford Bridge","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_9q0arba2kbnywth8bkxlhgmdr.png","www.chelseafc.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t8.jpg","#0A4595","5"},
            {"Crystal Palace","Roy Hodgson","Selhurst Park","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_1c8m2ko0wxq1asfkuykurdr0y.png","www.cpfc.co.uk","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t31.jpg","#EB302E","6"},
            {"Everton","Marco Silva","Goodison Park","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ehd2iemqmschhj2ec0vayztzz.png","www.evertonfc.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t11.jpg","#00369C","7"},
            {"Leicester City","Brendan Rodgers","King Power Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_avxknfz4f6ob0rv9dbnxdzde0.png","www.lcfc.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t13.jpg","#273E8A","8"},
            {"Liverpool","Jurgen Klopp","Anfield","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_c8h9bw1l82s06h77xxrelzhur.png","www.liverpoolfc.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t14.jpg","#E31B23","9"},
            {"Manchester City","Pep Guardiola","Etihad Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_a3nyxabgsqlnqfkeg41m6tnpp.png","www.mancity.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t43.jpg","#6CAEE0","10"},
            {"Manchester United","Ole Gunnar Solskjaer","Old Trafford","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6eqit8ye8aomdsrrq0hk3v7gh.png","www.manutd.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t1.jpg","#D81920","11"},
            {"Newcastle United","Steve Bruce","St. James' Park","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_7vn2i2kd35zuetw6b38gw9jsz.png","www.nufc.co.uk","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t4.jpg","#383838","12"},
            {"Norwich City","Daniel Farke","Carrow Road","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_suz80crpy3anixyzccmu6jzp.png","www.canaries.co.uk","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t45.jpg","#00A94F","13"},
            {"Sheffield United","Chris Wilder","Bramall Lane","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_bws31egwjda253q9lvykgnivo.png","www.sufc.co.uk","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t49.jpg","#ED1C24","14"},
            {"Southampton","Ralph Hasenhuttl","St. Mary's Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_d5ydtvt96bv7fq04yqm2w2632.png","www.southamptonfc.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t20.jpg","#D71920","15"},
            {"Tottenham Hotspur","Mauricio Pochettino","Tottenham Hotspur Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_22doj4sgsocqpxw45h607udje.png","www.tottenhamhotspur.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t6.jpg","#F5F5F5","16"},
            {"Watford","Javi Gracia","Vicarage Road","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4t83rqbdbekinxl5fz2ygsyta.png","www.watfordfc.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t57.jpg","#FFEE00","17"},
            {"West Ham United","Manuel Pellegrini","London Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4txjdaqveermfryvbfrr4taf7.png","www.whufc.com","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t21.jpg","#7D2C3B","18"},
            {"Wolverhampton Wanderers","Nuno Santo","Molineux Stadium","https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_b9si1jn1lfxfund69e9ogcu2n.png","www.wolves.co.uk","https://www.premierleague.com/resources/prod/3200dda-1369/i/stadiums/club-index/t39.jpg","#F9A01B","19"},

    };

    public static ArrayList<Club> getListData() {
        ArrayList<Club> list = new ArrayList<>();
        for (String[] aData : data) {
            Club club = new Club();
            club.setClubName(aData[0]);
            club.setManager(aData[1]);
            club.setStdm(aData[2]);
            club.setLogo(aData[3]);
            club.setWebsite(aData[4]);
            club.setStdmImg(aData[5]);
            club.setColor(aData[6]);
            club.setIndex(aData[7]);

            list.add(club);
            Log.d(TAG, aData[0]);

        }
        return list;
    }
}
