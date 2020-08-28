
package com.realtimeadmobadschanger;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdmobPoJo {

    @SerializedName("admob")
    @Expose
    private List<Admob> admob = null;

    public List<Admob> getAdmob() {
        return admob;
    }

    public void setAdmob(List<Admob> admob) {
        this.admob = admob;
    }

}
