package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = null;
    private static final char PARENT_SEPARATOR = '/';
    public static final String TAG_INFRA = "i";
    public static final String TAG_PRODUCT = "p";
    public static final String TAG_PRODUCT_AND_INFRA = "pi";
    private static boolean sUseDeepEquals;
    @Nullable
    private Map<String, Object> mExtraData;
    private final int mLevel;
    private final String mName;
    @Nullable
    private final ContextChain mParent;
    @Nullable
    private String mSerializedString;
    private final String mTag;

    /* renamed from: com.facebook.common.callercontext.ContextChain$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<ContextChain> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ContextChain createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ContextChain[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextChain createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextChain[] newArray(int size) {
        }
    }

    public ContextChain(final String tag, final String name, @Nullable final Map<String, String> extraData, @Nullable final ContextChain parent) {
    }

    public static void setUseDeepEquals(boolean useDeepEquals) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Nullable
    public Map<String, Object> getExtraData() {
    }

    public String getName() {
    }

    @Nullable
    public ContextChain getParent() {
    }

    public ContextChain getRootContextChain() {
    }

    @Nullable
    public String getStringExtra(String key) {
    }

    public String getTag() {
    }

    public int hashCode() {
    }

    public void putObjectExtra(String key, Object value) {
    }

    public String toString() {
    }

    public String[] toStringArray() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public ContextChain(final String tag, final String name, @Nullable final ContextChain parent) {
    }

    public ContextChain(Parcel in) {
    }
}
