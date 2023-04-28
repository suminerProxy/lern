package com.sobot.chat.widget.zxing.oned.rss.expanded.decoders;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.common.BitArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class AbstractExpandedDecoder {
    private final GeneralAppIdDecoder generalDecoder;
    private final BitArray information;

    public AbstractExpandedDecoder(BitArray bitArray) {
    }

    public static AbstractExpandedDecoder createDecoder(BitArray bitArray) {
    }

    public final GeneralAppIdDecoder getGeneralDecoder() {
    }

    public final BitArray getInformation() {
    }

    public abstract String parseInformation() throws NotFoundException, FormatException;
}
