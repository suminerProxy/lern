package skin.support.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.android.tpns.mqtt.MqttTopic;
import org.json.JSONException;
import org.json.JSONObject;
import skin.support.annotation.ColorRes;
import skin.support.exception.SkinCompatException;
import skin.support.utils.Slog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class ColorState {
    private static final String TAG = "ColorState";
    public String colorAccelerated;
    public String colorActivated;
    public String colorChecked;
    public String colorDefault;
    public String colorDragCanAccept;
    public String colorDragHovered;
    public String colorEnabled;
    public String colorFocused;
    public String colorHovered;
    public String colorName;
    public String colorPressed;
    public String colorSelected;
    public String colorWindowFocused;
    public boolean onlyDefaultColor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class ColorBuilder {
        public String colorAccelerated;
        public String colorActivated;
        public String colorChecked;
        public String colorDefault;
        public String colorDragCanAccept;
        public String colorDragHovered;
        public String colorEnabled;
        public String colorFocused;
        public String colorHovered;
        public String colorPressed;
        public String colorSelected;
        public String colorWindowFocused;

        public ColorBuilder() {
        }

        public ColorState build() {
        }

        public ColorBuilder setColorAccelerated(String str) {
        }

        public ColorBuilder setColorActivated(String str) {
        }

        public ColorBuilder setColorChecked(String str) {
        }

        public ColorBuilder setColorDefault(String str) {
        }

        public ColorBuilder setColorDragCanAccept(String str) {
        }

        public ColorBuilder setColorDragHovered(String str) {
        }

        public ColorBuilder setColorEnabled(String str) {
        }

        public ColorBuilder setColorFocused(String str) {
        }

        public ColorBuilder setColorHovered(String str) {
        }

        public ColorBuilder setColorPressed(String str) {
        }

        public ColorBuilder setColorSelected(String str) {
        }

        public ColorBuilder setColorWindowFocused(String str) {
        }

        public ColorBuilder(ColorState colorState) {
        }

        public ColorBuilder setColorAccelerated(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorActivated(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorChecked(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorDefault(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorDragCanAccept(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorDragHovered(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorEnabled(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorFocused(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorHovered(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorPressed(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorSelected(Context context, @ColorRes int i2) {
        }

        public ColorBuilder setColorWindowFocused(Context context, @ColorRes int i2) {
        }
    }

    public ColorState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.colorWindowFocused = str;
        this.colorSelected = str2;
        this.colorFocused = str3;
        this.colorEnabled = str4;
        this.colorPressed = str5;
        this.colorChecked = str6;
        this.colorActivated = str7;
        this.colorAccelerated = str8;
        this.colorHovered = str9;
        this.colorDragCanAccept = str10;
        this.colorDragHovered = str11;
        this.colorDefault = str12;
        boolean z = TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9) && TextUtils.isEmpty(str10) && TextUtils.isEmpty(str11);
        this.onlyDefaultColor = z;
        if (z && !str12.startsWith(MqttTopic.MULTI_LEVEL_WILDCARD)) {
            throw new SkinCompatException("Default color cannot be a reference, when only default color is available!");
        }
    }

    public static boolean checkColorValid(String str, String str2) {
        boolean z = !TextUtils.isEmpty(str2) && (!str2.startsWith(MqttTopic.MULTI_LEVEL_WILDCARD) || str2.length() == 7 || str2.length() == 9);
        if (Slog.DEBUG && !z) {
            Slog.i(TAG, "Invalid color -> " + str + ": " + str2);
        }
        return z;
    }

    public static ColorState fromJSONObject(JSONObject jSONObject) {
        if (jSONObject.has("colorName") && jSONObject.has("colorDefault") && jSONObject.has("onlyDefaultColor")) {
            try {
                boolean z = jSONObject.getBoolean("onlyDefaultColor");
                String string = jSONObject.getString("colorName");
                String string2 = jSONObject.getString("colorDefault");
                if (z) {
                    return new ColorState(string, string2);
                }
                ColorBuilder colorBuilder = new ColorBuilder();
                colorBuilder.setColorDefault(string2);
                if (jSONObject.has("colorWindowFocused")) {
                    colorBuilder.setColorWindowFocused(jSONObject.getString("colorWindowFocused"));
                }
                if (jSONObject.has("colorSelected")) {
                    colorBuilder.setColorSelected(jSONObject.getString("colorSelected"));
                }
                if (jSONObject.has("colorFocused")) {
                    colorBuilder.setColorFocused(jSONObject.getString("colorFocused"));
                }
                if (jSONObject.has("colorEnabled")) {
                    colorBuilder.setColorEnabled(jSONObject.getString("colorEnabled"));
                }
                if (jSONObject.has("colorPressed")) {
                    colorBuilder.setColorPressed(jSONObject.getString("colorPressed"));
                }
                if (jSONObject.has("colorChecked")) {
                    colorBuilder.setColorChecked(jSONObject.getString("colorChecked"));
                }
                if (jSONObject.has("colorActivated")) {
                    colorBuilder.setColorActivated(jSONObject.getString("colorActivated"));
                }
                if (jSONObject.has("colorAccelerated")) {
                    colorBuilder.setColorAccelerated(jSONObject.getString("colorAccelerated"));
                }
                if (jSONObject.has("colorHovered")) {
                    colorBuilder.setColorHovered(jSONObject.getString("colorHovered"));
                }
                if (jSONObject.has("colorDragCanAccept")) {
                    colorBuilder.setColorDragCanAccept(jSONObject.getString("colorDragCanAccept"));
                }
                if (jSONObject.has("colorDragHovered")) {
                    colorBuilder.setColorDragHovered(jSONObject.getString("colorDragHovered"));
                }
                ColorState build = colorBuilder.build();
                build.colorName = string;
                return build;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private String getColorStr(String str) {
        if (str.startsWith(MqttTopic.MULTI_LEVEL_WILDCARD)) {
            return str;
        }
        ColorState colorState = SkinCompatUserThemeManager.get().getColorState(str);
        if (colorState != null) {
            if (colorState.isOnlyDefaultColor()) {
                return colorState.colorDefault;
            }
            if (Slog.DEBUG) {
                Slog.i(TAG, str + " cannot reference " + colorState.colorName);
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ba A[Catch: Exception -> 0x01ef, TryCatch #1 {Exception -> 0x01ef, blocks: (B:69:0x01ae, B:71:0x01ba, B:72:0x01cc, B:74:0x01d2, B:75:0x01e9), top: B:95:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2 A[Catch: Exception -> 0x01ef, LOOP:0: B:73:0x01d0->B:74:0x01d2, LOOP_END, TryCatch #1 {Exception -> 0x01ef, blocks: (B:69:0x01ae, B:71:0x01ba, B:72:0x01cc, B:74:0x01d2, B:75:0x01e9), top: B:95:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.res.ColorStateList parseAll() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.content.res.ColorState.parseAll():android.content.res.ColorStateList");
    }

    public static JSONObject toJSONObject(ColorState colorState) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (colorState.onlyDefaultColor) {
            jSONObject.putOpt("colorName", colorState.colorName).putOpt("colorDefault", colorState.colorDefault).putOpt("onlyDefaultColor", Boolean.valueOf(colorState.onlyDefaultColor));
        } else {
            jSONObject.putOpt("colorName", colorState.colorName).putOpt("colorWindowFocused", colorState.colorWindowFocused).putOpt("colorSelected", colorState.colorSelected).putOpt("colorFocused", colorState.colorFocused).putOpt("colorEnabled", colorState.colorEnabled).putOpt("colorPressed", colorState.colorPressed).putOpt("colorChecked", colorState.colorChecked).putOpt("colorActivated", colorState.colorActivated).putOpt("colorAccelerated", colorState.colorAccelerated).putOpt("colorHovered", colorState.colorHovered).putOpt("colorDragCanAccept", colorState.colorDragCanAccept).putOpt("colorDragHovered", colorState.colorDragHovered).putOpt("colorDefault", colorState.colorDefault).putOpt("onlyDefaultColor", Boolean.valueOf(colorState.onlyDefaultColor));
        }
        return jSONObject;
    }

    public String getColorAccelerated() {
        return this.colorAccelerated;
    }

    public String getColorActivated() {
        return this.colorActivated;
    }

    public String getColorChecked() {
        return this.colorChecked;
    }

    public String getColorDefault() {
        return this.colorDefault;
    }

    public String getColorDragCanAccept() {
        return this.colorDragCanAccept;
    }

    public String getColorDragHovered() {
        return this.colorDragHovered;
    }

    public String getColorEnabled() {
        return this.colorEnabled;
    }

    public String getColorFocused() {
        return this.colorFocused;
    }

    public String getColorHovered() {
        return this.colorHovered;
    }

    public String getColorName() {
        return this.colorName;
    }

    public String getColorPressed() {
        return this.colorPressed;
    }

    public String getColorSelected() {
        return this.colorSelected;
    }

    public String getColorWindowFocused() {
        return this.colorWindowFocused;
    }

    public boolean isOnlyDefaultColor() {
        return this.onlyDefaultColor;
    }

    public ColorStateList parse() {
        if (this.onlyDefaultColor) {
            return ColorStateList.valueOf(Color.parseColor(this.colorDefault));
        }
        return parseAll();
    }

    public ColorState(String str, String str2) {
        this.colorName = str;
        this.colorDefault = str2;
        this.onlyDefaultColor = true;
        if (!str2.startsWith(MqttTopic.MULTI_LEVEL_WILDCARD)) {
            throw new SkinCompatException("Default color cannot be a reference, when only default color is available!");
        }
    }
}
