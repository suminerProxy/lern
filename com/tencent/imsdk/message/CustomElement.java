package com.tencent.imsdk.message;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomElement extends MessageBaseElement {
    private byte[] data;
    private String description;
    private byte[] extension;
    private byte[] sound;

    public CustomElement() {
        setElementType(2);
    }

    public byte[] getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getExtension() {
        return this.extension;
    }

    public byte[] getSound() {
        return this.sound;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExtension(byte[] bArr) {
        this.extension = bArr;
    }

    public void setSound(byte[] bArr) {
        this.sound = bArr;
    }
}
