package com.rideshare.driver.Retrofit;
/**
 *@Developer Faysal
 *@Company AAPBD
 **/

import org.json.JSONArray;


public interface ResponseListener {
    void getJSONArrayResult(String strTag, JSONArray arrayResponse);
}
