# AdmobRealTime

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
		   implementation 'com.github.immujahidkhan:AdmobRealTime:0.0.2'
		   implementation 'com.squareup.retrofit2:retrofit:2.7.2'
}
```


## Usage

``` java
  new GetLatestAdsUnit().loadAPI(BASE_URL, END_POINT_IF_ANY_ELSE_PUT_NULL, mapString_IF_ANY_ELSE_PUT_NULL, "com.whatsapp.w4b", new onGetAdsUnitId<Admob>() {
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
```
## You have to Use only this type of JSON 

```
{
    "admob": [
        {
            "applicationId": "com.whatsapp.w4b",
            "app_id": "ca-app-pub-3940256099942544~3347511713",
            "banner_unit_id": "ca-app-pub-3940256099942544/6300978111",
            "interstitial_unit_id": "ca-app-pub-3940256099942544/1033173712",
            "interstitial_video_unit_id":"ca-app-pub-3940256099942544/8691691433",
            "rewarded_video_unit_id":"ca-app-pub-3940256099942544/5224354917",
            "native_advanced_unit_id":"ca-app-pub-3940256099942544/2247696110",
            "native_advanced_video_unit_id":"ca-app-pub-3940256099942544/1044960115"
        }
    ]
}
```
