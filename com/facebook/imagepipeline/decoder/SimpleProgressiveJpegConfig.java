package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collections;
import java.util.List;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SimpleProgressiveJpegConfig implements ProgressiveJpegConfig {
    private final DynamicValueConfig mDynamicValueConfig;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DefaultDynamicValueConfig implements DynamicValueConfig {
        private DefaultDynamicValueConfig() {
        }

        @Override // com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig.DynamicValueConfig
        public int getGoodEnoughScanNumber() {
            return 0;
        }

        @Override // com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig.DynamicValueConfig
        public List<Integer> getScansToDecode() {
            return Collections.EMPTY_LIST;
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface DynamicValueConfig {
        int getGoodEnoughScanNumber();

        List<Integer> getScansToDecode();
    }

    public SimpleProgressiveJpegConfig() {
        this(new DefaultDynamicValueConfig());
    }

    @Override // com.facebook.imagepipeline.decoder.ProgressiveJpegConfig
    public int getNextScanNumberToDecode(int scanNumber) {
        List<Integer> scansToDecode = this.mDynamicValueConfig.getScansToDecode();
        if (scansToDecode == null || scansToDecode.isEmpty()) {
            return scanNumber + 1;
        }
        for (int i2 = 0; i2 < scansToDecode.size(); i2++) {
            if (scansToDecode.get(i2).intValue() > scanNumber) {
                return scansToDecode.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.facebook.imagepipeline.decoder.ProgressiveJpegConfig
    public QualityInfo getQualityInfo(int scanNumber) {
        return ImmutableQualityInfo.of(scanNumber, scanNumber >= this.mDynamicValueConfig.getGoodEnoughScanNumber(), false);
    }

    public SimpleProgressiveJpegConfig(DynamicValueConfig dynamicValueConfig) {
        this.mDynamicValueConfig = (DynamicValueConfig) Preconditions.checkNotNull(dynamicValueConfig);
    }
}
