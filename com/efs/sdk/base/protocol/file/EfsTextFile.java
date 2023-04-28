package com.efs.sdk.base.protocol.file;

import com.efs.sdk.base.core.config.a;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.JSONSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EfsTextFile extends AbsFileLog {
    private static final String FILE_START = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***";
    private static final String SECTION_START = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    private boolean mHasInitLinkInfo;
    private String mLinkID;
    private String mLinkKey;
    private List<AbsSection> sectionList;

    public EfsTextFile(String str) {
    }

    private String changeToStr() {
    }

    private void initLinkInfo() {
    }

    private void insertCustomInfoSection() {
    }

    public JSONSection createAndAddJSONSection(String str) {
    }

    public KVSection createAndAddKVSection(String str) {
    }

    public TextSection createAndAddTextSection(String str) {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public byte[] generate() {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String generateString() {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkId() {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkKey() {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public void insertGlobal(a aVar) {
    }
}
