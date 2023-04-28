package com.tencent.ugc;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface TXUGCPartsManager {
    void addClipInfo(PartInfo partInfo);

    void deleteAllParts();

    void deleteLastPart();

    void deletePart(int i2);

    int getDuration();

    List<String> getPartsPathList();

    void insertPart(String str, int i2);
}
