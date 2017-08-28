package com.jereksel.libresubstratum.bridgecommon;

import android.os.Parcel;
import android.os.Parcelable;

public class OverlayInfo implements Parcelable {

    private final String overlayId;
    private final boolean enabled;

    public OverlayInfo(String overlayId, boolean enabled) {
        this.overlayId = overlayId;
        this.enabled = enabled;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.overlayId);
        dest.writeByte(this.enabled ? (byte) 1 : (byte) 0);
    }

    protected OverlayInfo(Parcel in) {
        this.overlayId = in.readString();
        this.enabled = in.readByte() != 0;
    }

    public static final Parcelable.Creator<OverlayInfo> CREATOR = new Parcelable.Creator<OverlayInfo>() {
        @Override
        public OverlayInfo createFromParcel(Parcel source) {
            return new OverlayInfo(source);
        }

        @Override
        public OverlayInfo[] newArray(int size) {
            return new OverlayInfo[size];
        }
    };
}
