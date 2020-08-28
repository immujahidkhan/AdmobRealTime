
package com.realtimeadmobadschanger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Admob {

    @SerializedName("applicationId")
    @Expose
    private String applicationId;
    @SerializedName("app_id")
    @Expose
    private String appId;
    @SerializedName("banner_unit_id")
    @Expose
    private String bannerUnitId;
    @SerializedName("interstitial_unit_id")
    @Expose
    private String interstitialUnitId;
    @SerializedName("interstitial_video_unit_id")
    @Expose
    private String interstitialVideoUnitId;
    @SerializedName("rewarded_video_unit_id")
    @Expose
    private String rewardedVideoUnitId;
    @SerializedName("native_advanced_unit_id")
    @Expose
    private String nativeAdvancedUnitId;
    @SerializedName("native_advanced_video_unit_id")
    @Expose
    private String nativeAdvancedVideoUnitId;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getBannerUnitId() {
        return bannerUnitId;
    }

    public void setBannerUnitId(String bannerUnitId) {
        this.bannerUnitId = bannerUnitId;
    }

    public String getInterstitialUnitId() {
        return interstitialUnitId;
    }

    public void setInterstitialUnitId(String interstitialUnitId) {
        this.interstitialUnitId = interstitialUnitId;
    }

    public String getInterstitialVideoUnitId() {
        return interstitialVideoUnitId;
    }

    public void setInterstitialVideoUnitId(String interstitialVideoUnitId) {
        this.interstitialVideoUnitId = interstitialVideoUnitId;
    }

    public String getRewardedVideoUnitId() {
        return rewardedVideoUnitId;
    }

    public void setRewardedVideoUnitId(String rewardedVideoUnitId) {
        this.rewardedVideoUnitId = rewardedVideoUnitId;
    }

    public String getNativeAdvancedUnitId() {
        return nativeAdvancedUnitId;
    }

    public void setNativeAdvancedUnitId(String nativeAdvancedUnitId) {
        this.nativeAdvancedUnitId = nativeAdvancedUnitId;
    }

    public String getNativeAdvancedVideoUnitId() {
        return nativeAdvancedVideoUnitId;
    }

    public void setNativeAdvancedVideoUnitId(String nativeAdvancedVideoUnitId) {
        this.nativeAdvancedVideoUnitId = nativeAdvancedVideoUnitId;
    }

    @Override
    public String toString() {
        return "Admob{" +
                "applicationId='" + applicationId + '\'' +
                ", appId='" + appId + '\'' +
                ", bannerUnitId='" + bannerUnitId + '\'' +
                ", interstitialUnitId='" + interstitialUnitId + '\'' +
                ", interstitialVideoUnitId='" + interstitialVideoUnitId + '\'' +
                ", rewardedVideoUnitId='" + rewardedVideoUnitId + '\'' +
                ", nativeAdvancedUnitId='" + nativeAdvancedUnitId + '\'' +
                ", nativeAdvancedVideoUnitId='" + nativeAdvancedVideoUnitId + '\'' +
                '}';
    }
}