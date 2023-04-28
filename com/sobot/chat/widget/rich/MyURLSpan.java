package com.sobot.chat.widget.rich;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MyURLSpan extends URLSpan {
    private int color;
    private Context context;
    private boolean isShowLine;

    public MyURLSpan(Context context, String str, int i2) {
    }

    private String fixUrl(String str) {
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
    }

    public MyURLSpan(Context context, String str, int i2, boolean z) {
    }
}
