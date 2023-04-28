package com.tencent.imsdk.message;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TextElement extends MessageBaseElement {
    private byte[] textContentBytes;

    public TextElement() {
        setElementType(1);
    }

    public String getTextContent() {
        byte[] bArr = this.textContentBytes;
        if (bArr != null && bArr.length > 0) {
            try {
                return new String(this.textContentBytes, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public void setTextContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.textContentBytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
    }
}
