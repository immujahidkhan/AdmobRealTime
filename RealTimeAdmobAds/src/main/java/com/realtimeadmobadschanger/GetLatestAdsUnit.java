package com.realtimeadmobadschanger;

import com.genericresponseretrofit.GenericResponseManager;
import com.genericresponseretrofit.onGenericResponseListener;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Response;

public class GetLatestAdsUnit {

    public GetLatestAdsUnit() {
    }

    public void loadAPI(String BASE_URL, String END_POINT, Map<String, String> mapString, final String applicationId, final onGetAdsUnitId<Admob> onGetAdsUnitId) {
        new GenericResponseManager(BASE_URL).getRequest(mapString, END_POINT, new onGenericResponseListener() {
            @Override
            public void onComplete() {

            }

            @Override
            public void onNext(Response<?> response) {
                if (response.body() != null) {
                    String result = "" + response.body();
                    AdmobPoJo admobPoJo = new Gson().fromJson(result, AdmobPoJo.class);
                    if (admobPoJo.getAdmob() != null) {
                        for (Admob admob : admobPoJo.getAdmob()) {
                            if (admob.getApplicationId().equalsIgnoreCase(applicationId)) {
                                onGetAdsUnitId.AdsUnit(admob);
                            }
                        }
                    }
                }
            }

            @Override
            public void onErrorBody(ResponseBody responseErrorBody) {

            }
        });
    }
}