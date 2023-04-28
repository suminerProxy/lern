package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WXWebpageObject implements WXMediaMessage.IMediaObject {
    public String canvasPageXml;
    public String extInfo;
    public HashMap<String, String> extraInfoMap;
    public boolean isSecretMessage;
    public String webpageUrl;

    public WXWebpageObject() {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
    }

    public String getExtra(String str, String str2) {
    }

    public void putExtra(String str, String str2) {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public int type() {
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
    }

    public WXWebpageObject(String str) {
    }
}
