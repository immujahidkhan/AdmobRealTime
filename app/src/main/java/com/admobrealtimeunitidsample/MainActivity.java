package com.admobrealtimeunitidsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.realtimeadmobadschanger.Admob;
import com.realtimeadmobadschanger.GetLatestAdsUnit;
import com.realtimeadmobadschanger.onGetAdsUnitId;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String BASE_URL = "https://gist.githubusercontent.com/immujahidkhan/";
    private String END_POINT = "f38f7d265b9111def2a6d28884d5c0c7/raw/";
    private Map<String, String> mapString = new HashMap<>();
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            ApplicationInfo ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            String myApiKey = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            Log.d(TAG, "Name Found: " + myApiKey);
            ai.metaData.putString("com.google.android.gms.ads.APPLICATION_ID", "ca-app-pub-3940256099942544~3347511713");//you can replace your key APPLICATION_ID here
            String ApiKey = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            Log.d(TAG, "ReNamed Found: " + ApiKey);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Failed to load meta-data, NameNotFound: " + e.getMessage());
        } catch (NullPointerException e) {
            Log.e(TAG, "Failed to load meta-data, NullPointer: " + e.getMessage());
        }
        new GetLatestAdsUnit().loadAPI(BASE_URL, END_POINT, mapString, "com.whatsapp.w4b", new onGetAdsUnitId<Admob>() {
            @Override
            public void AdsUnit(Admob admob) {
                Log.d("RESPONSE:MyADs", admob.toString());
                RelativeLayout adContainer = findViewById(R.id.adMobView);
                AdView mAdView = new AdView(MainActivity.this);
                mAdView.setAdSize(AdSize.BANNER);
                mAdView.setAdUnitId(admob.getBannerUnitId());
                adContainer.addView(mAdView);
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
            }
        });
    }
}