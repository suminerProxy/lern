package com.tencent.imsdk.message;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FaceElement extends MessageBaseElement {
    private byte[] faceData;
    private int faceIndex;

    public FaceElement() {
        setElementType(8);
    }

    public byte[] getFaceData() {
        return this.faceData;
    }

    public int getFaceIndex() {
        return this.faceIndex;
    }

    public void setFaceData(byte[] bArr) {
        this.faceData = bArr;
    }

    public void setFaceIndex(int i2) {
        this.faceIndex = i2;
    }
}
