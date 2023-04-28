package com.sobot.chat.widget.zxing.oned.rss.expanded.decoders;

import com.sobot.chat.widget.zxing.common.BitArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class AI01weightDecoder extends AI01decoder {
    public AI01weightDecoder(BitArray bitArray) {
    }

    public abstract void addWeightCode(StringBuilder sb, int i2);

    public abstract int checkWeight(int i2);

    public final void encodeCompressedWeight(StringBuilder sb, int i2, int i3) {
    }
}
