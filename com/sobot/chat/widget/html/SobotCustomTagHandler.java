package com.sobot.chat.widget.html;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.Html;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.XMLReader;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotCustomTagHandler implements Html.TagHandler {
    public static final String HTML_FONT = "font";
    public static final String HTML_SPAN = "span";
    public static final String NEW_FONT = "myfont";
    public static final String NEW_SPAN = "sobotspan";
    private final String TAG;
    public final HashMap<String, String> attributes;
    private List<SobotHtmlLabelBean> labelBeanList;
    private Context mContext;
    private ColorStateList mOriginColors;
    private List<SobotHtmlLabelBean> tempRemoveLabelList;

    public SobotCustomTagHandler(Context context, ColorStateList colorStateList) {
    }

    private void analysisStyle(SobotHtmlLabelBean sobotHtmlLabelBean, String str) {
    }

    public static int dip2px(Context context, float f2) {
    }

    private int getLastLabelByTag(String str) {
    }

    private void optBeanRange(SobotHtmlLabelBean sobotHtmlLabelBean) {
    }

    private void optRemoveByAddBean(SobotHtmlLabelBean sobotHtmlLabelBean) {
    }

    public static int parseHtmlColor(String str) {
    }

    private void processAttributes(XMLReader xMLReader) {
    }

    public static int px2dip(Context context, float f2) {
    }

    private void reductionFontColor(int i2, int i3, Editable editable) {
    }

    public static int sp2px(Context context, float f2) {
    }

    public void endFont(String str, Editable editable, XMLReader xMLReader) {
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
    }

    public void startFont(String str, Editable editable, XMLReader xMLReader) {
    }
}
