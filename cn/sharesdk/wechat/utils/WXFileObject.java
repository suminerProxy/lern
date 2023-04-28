package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.wechat.utils.WXMediaMessage;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WXFileObject implements WXMediaMessage.IMediaObject {
    private int contentLengthLimit;
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
    }

    private int getFileSize(String str) {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
    }

    public void setContentLengthLimit(int i2) {
    }

    public void setFileData(byte[] bArr) {
    }

    public void setFilePath(String str) {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public int type() {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
    }

    public WXFileObject(byte[] bArr) {
    }

    public WXFileObject(String str) {
    }
}
