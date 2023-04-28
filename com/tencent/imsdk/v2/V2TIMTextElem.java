package com.tencent.imsdk.v2;

import com.tencent.imsdk.message.TextElement;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMTextElem extends V2TIMElem {
    private String text;

    public String getText() {
        if (getElement() == null) {
            return this.text;
        }
        return ((TextElement) getElement()).getTextContent();
    }

    public void setText(String str) {
        if (getElement() == null) {
            this.text = str;
        } else {
            ((TextElement) getElement()).setTextContent(str);
        }
    }

    public String toString() {
        return "V2TIMTextElem--->text:" + getText();
    }
}
