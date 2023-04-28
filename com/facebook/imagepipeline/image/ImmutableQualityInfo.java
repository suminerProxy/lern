package com.facebook.imagepipeline.image;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImmutableQualityInfo implements QualityInfo {
    public static final QualityInfo FULL_QUALITY = of(Integer.MAX_VALUE, true, true);
    public boolean mIsOfFullQuality;
    public boolean mIsOfGoodEnoughQuality;
    public int mQuality;

    private ImmutableQualityInfo(int quality, boolean isOfGoodEnoughQuality, boolean isOfFullQuality) {
        this.mQuality = quality;
        this.mIsOfGoodEnoughQuality = isOfGoodEnoughQuality;
        this.mIsOfFullQuality = isOfFullQuality;
    }

    public static QualityInfo of(int quality, boolean isOfGoodEnoughQuality, boolean isOfFullQuality) {
        return new ImmutableQualityInfo(quality, isOfGoodEnoughQuality, isOfFullQuality);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ImmutableQualityInfo) {
            ImmutableQualityInfo immutableQualityInfo = (ImmutableQualityInfo) other;
            return this.mQuality == immutableQualityInfo.mQuality && this.mIsOfGoodEnoughQuality == immutableQualityInfo.mIsOfGoodEnoughQuality && this.mIsOfFullQuality == immutableQualityInfo.mIsOfFullQuality;
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.image.QualityInfo
    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        return (this.mQuality ^ (this.mIsOfGoodEnoughQuality ? 4194304 : 0)) ^ (this.mIsOfFullQuality ? 8388608 : 0);
    }

    @Override // com.facebook.imagepipeline.image.QualityInfo
    public boolean isOfFullQuality() {
        return this.mIsOfFullQuality;
    }

    @Override // com.facebook.imagepipeline.image.QualityInfo
    public boolean isOfGoodEnoughQuality() {
        return this.mIsOfGoodEnoughQuality;
    }
}
