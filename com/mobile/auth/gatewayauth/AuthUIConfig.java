package com.mobile.auth.gatewayauth;

import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AuthUIConfig implements Serializable {
    private String activityIn;
    private String activityOut;
    private String authPageActIn;
    private String authPageActOut;
    private int bottomNavBarColor;
    private int checkBoxHeight;
    private int checkBoxWidth;
    private boolean checkboxHidden;
    private String checkedImgPath;
    private float dialogAlpha;
    private boolean dialogBottom;
    private int dialogHeight;
    private int dialogOffsetX;
    private int dialogOffsetY;
    private int dialogWidth;
    private boolean isLightColor;
    private boolean isStatusBarHidden;
    private String loadingImgPath;
    private String logBtnBackgroundPath;
    private int logBtnHeight;
    private int logBtnLayoutGravity;
    private int logBtnMarginLeftAndRight;
    private int logBtnOffsetX;
    private int logBtnOffsetY;
    private int logBtnOffsetY_B;
    private String logBtnText;
    private int logBtnTextColor;
    private int logBtnTextSize;
    private boolean logBtnToastHidden;
    private int logBtnWidth;
    private int logoHeight;
    private boolean logoHidden;
    private String logoImgPath;
    private int logoOffsetY;
    private int logoOffsetY_B;
    private ImageView.ScaleType logoScaleType;
    private int logoWidth;
    private int navColor;
    private boolean navHidden;
    private boolean navReturnHidden;
    private int navReturnImgHeight;
    private String navReturnImgPath;
    private int navReturnImgWidth;
    private ImageView.ScaleType navReturnScaleType;
    private String navText;
    private int navTextColor;
    private int navTextSize;
    private int numFieldOffsetY;
    private int numFieldOffsetY_B;
    private int numberColor;
    private int numberFieldOffsetX;
    private int numberLayoutGravity;
    private int numberSize;
    private String pageBackgroundPath;
    private String privacyBefore;
    private String privacyEnd;
    private int privacyMargin;
    private int privacyOffsetX;
    private int privacyOffsetY;
    private int privacyOffsetY_B;
    private boolean privacyState;
    private int privacyTextSize;
    private int protocolColor;
    private int protocolGravity;
    private int protocolLayoutGravity;
    private int protocolOneColor;
    private String protocolOneName;
    private String protocolOneURL;
    private int protocolThreeColor;
    private String protocolThreeName;
    private String protocolThreeURL;
    private int protocolTwoColor;
    private String protocolTwoName;
    private String protocolTwoURL;
    private int screenOrientation;
    private boolean sloganHidden;
    private int sloganOffsetY;
    private int sloganOffsetY_B;
    private String sloganText;
    private int sloganTextColor;
    private int sloganTextSize;
    private int statusBarColor;
    private int statusBarUIFlag;
    private boolean switchAccHidden;
    private String switchAccText;
    private int switchAccTextColor;
    private int switchAccTextSize;
    private int switchOffsetY;
    private int switchOffsetY_B;
    private String uncheckedImgPath;
    private String vendorPrivacyPrefix;
    private String vendorPrivacySuffix;
    private int webNavColor;
    private String webNavReturnImgPath;
    private int webNavTextColor;
    private int webNavTextSize;
    private int webViewStatusBarColor;

    @Keep
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder {
        private String activityIn;
        private String activityOut;
        private String authPageActIn;
        private String authPageActOut;
        private int bottomNavColor;
        private int checkBoxHeight;
        private int checkBoxWidth;
        private boolean checkboxHidden;
        private String checkedImgPath;
        private float dialogAlpha;
        private boolean dialogBottom;
        private int dialogHeight;
        private int dialogOffsetX;
        private int dialogOffsetY;
        private int dialogWidth;
        private boolean isLightColor;
        private boolean isStatusBarHidden;
        private String loadingImgPath;
        private String logBtnBackgroundPath;
        private int logBtnHeight;
        private int logBtnLayoutGravity;
        private int logBtnMarginLeftAndRight;
        private int logBtnOffsetX;
        private int logBtnOffsetY;
        private int logBtnOffsetY_B;
        private String logBtnText;
        private int logBtnTextColor;
        private int logBtnTextSize;
        private boolean logBtnToastHidden;
        private int logBtnWidth;
        private int logoHeight;
        private boolean logoHidden;
        private String logoImgPath;
        private int logoOffsetY;
        private int logoOffsetY_B;
        private ImageView.ScaleType logoScaleType;
        private int logoWidth;
        private int navColor;
        private boolean navHidden;
        private boolean navReturnHidden;
        private int navReturnImgHeight;
        private String navReturnImgPath;
        private int navReturnImgWidth;
        private ImageView.ScaleType navReturnScaleType;
        private String navText;
        private int navTextColor;
        private int navTextSize;
        private int numFieldOffsetY;
        private int numFieldOffsetY_B;
        private int numberColor;
        private int numberFieldOffsetX;
        private int numberLayoutGravity;
        private int numberSize;
        private String pageBackgroundPath;
        private String privacyBefore;
        private String privacyEnd;
        private int privacyMargin;
        private int privacyOffsetX;
        private int privacyOffsetY;
        private int privacyOffsetY_B;
        private boolean privacyState;
        private int privacyTextSize;
        private int protocolColor;
        private int protocolGravity;
        private int protocolLayoutGravity;
        private int protocolOneColor;
        private String protocolOneName;
        private String protocolOneURL;
        private int protocolThreeColor;
        private String protocolThreeName;
        private String protocolThreeURL;
        private int protocolTwoColor;
        private String protocolTwoName;
        private String protocolTwoURL;
        private int screenOrientation;
        private boolean sloganHidden;
        private int sloganOffsetY;
        private int sloganOffsetY_B;
        private String sloganText;
        private int sloganTextColor;
        private int sloganTextSize;
        private int statusBarColor;
        private int statusBarUIFlag;
        private boolean switchAccHidden;
        private String switchAccText;
        private int switchAccTextColor;
        private int switchAccTextSize;
        private int switchOffsetY;
        private int switchOffsetY_B;
        private String uncheckedImgPath;
        private String vendorPrivacyPrefix;
        private String vendorPrivacySuffix;
        private int webNavColor;
        private String webNavReturnImgPath;
        private int webNavTextColor;
        private int webNavTextSize;
        private int webViewStatusBarColor;

        public static /* synthetic */ int access$000(Builder builder) {
        }

        public static /* synthetic */ int access$100(Builder builder) {
        }

        public static /* synthetic */ int access$1000(Builder builder) {
        }

        public static /* synthetic */ boolean access$1100(Builder builder) {
        }

        public static /* synthetic */ ImageView.ScaleType access$1200(Builder builder) {
        }

        public static /* synthetic */ String access$1300(Builder builder) {
        }

        public static /* synthetic */ boolean access$1400(Builder builder) {
        }

        public static /* synthetic */ ImageView.ScaleType access$1500(Builder builder) {
        }

        public static /* synthetic */ int access$1600(Builder builder) {
        }

        public static /* synthetic */ boolean access$1700(Builder builder) {
        }

        public static /* synthetic */ int access$1800(Builder builder) {
        }

        public static /* synthetic */ String access$1900(Builder builder) {
        }

        public static /* synthetic */ boolean access$200(Builder builder) {
        }

        public static /* synthetic */ int access$2000(Builder builder) {
        }

        public static /* synthetic */ String access$2100(Builder builder) {
        }

        public static /* synthetic */ String access$2200(Builder builder) {
        }

        public static /* synthetic */ int access$2300(Builder builder) {
        }

        public static /* synthetic */ int access$2400(Builder builder) {
        }

        public static /* synthetic */ String access$2500(Builder builder) {
        }

        public static /* synthetic */ String access$2600(Builder builder) {
        }

        public static /* synthetic */ int access$2700(Builder builder) {
        }

        public static /* synthetic */ int access$2800(Builder builder) {
        }

        public static /* synthetic */ int access$2900(Builder builder) {
        }

        public static /* synthetic */ boolean access$300(Builder builder) {
        }

        public static /* synthetic */ String access$3000(Builder builder) {
        }

        public static /* synthetic */ String access$3100(Builder builder) {
        }

        public static /* synthetic */ int access$3200(Builder builder) {
        }

        public static /* synthetic */ int access$3300(Builder builder) {
        }

        public static /* synthetic */ int access$3400(Builder builder) {
        }

        public static /* synthetic */ int access$3500(Builder builder) {
        }

        public static /* synthetic */ int access$3600(Builder builder) {
        }

        public static /* synthetic */ int access$3700(Builder builder) {
        }

        public static /* synthetic */ int access$3800(Builder builder) {
        }

        public static /* synthetic */ int access$3900(Builder builder) {
        }

        public static /* synthetic */ int access$400(Builder builder) {
        }

        public static /* synthetic */ int access$4000(Builder builder) {
        }

        public static /* synthetic */ int access$4100(Builder builder) {
        }

        public static /* synthetic */ int access$4200(Builder builder) {
        }

        public static /* synthetic */ int access$4300(Builder builder) {
        }

        public static /* synthetic */ int access$4400(Builder builder) {
        }

        public static /* synthetic */ int access$4500(Builder builder) {
        }

        public static /* synthetic */ int access$4600(Builder builder) {
        }

        public static /* synthetic */ int access$4700(Builder builder) {
        }

        public static /* synthetic */ int access$4800(Builder builder) {
        }

        public static /* synthetic */ int access$4900(Builder builder) {
        }

        public static /* synthetic */ int access$500(Builder builder) {
        }

        public static /* synthetic */ boolean access$5000(Builder builder) {
        }

        public static /* synthetic */ String access$5100(Builder builder) {
        }

        public static /* synthetic */ int access$5200(Builder builder) {
        }

        public static /* synthetic */ int access$5300(Builder builder) {
        }

        public static /* synthetic */ int access$5400(Builder builder) {
        }

        public static /* synthetic */ int access$5500(Builder builder) {
        }

        public static /* synthetic */ String access$5600(Builder builder) {
        }

        public static /* synthetic */ int access$5700(Builder builder) {
        }

        public static /* synthetic */ boolean access$5800(Builder builder) {
        }

        public static /* synthetic */ String access$5900(Builder builder) {
        }

        public static /* synthetic */ String access$600(Builder builder) {
        }

        public static /* synthetic */ String access$6000(Builder builder) {
        }

        public static /* synthetic */ int access$6100(Builder builder) {
        }

        public static /* synthetic */ int access$6200(Builder builder) {
        }

        public static /* synthetic */ boolean access$6300(Builder builder) {
        }

        public static /* synthetic */ int access$6400(Builder builder) {
        }

        public static /* synthetic */ int access$6500(Builder builder) {
        }

        public static /* synthetic */ int access$6600(Builder builder) {
        }

        public static /* synthetic */ String access$6700(Builder builder) {
        }

        public static /* synthetic */ String access$6800(Builder builder) {
        }

        public static /* synthetic */ String access$6900(Builder builder) {
        }

        public static /* synthetic */ int access$700(Builder builder) {
        }

        public static /* synthetic */ String access$7000(Builder builder) {
        }

        public static /* synthetic */ int access$7100(Builder builder) {
        }

        public static /* synthetic */ int access$7200(Builder builder) {
        }

        public static /* synthetic */ boolean access$7300(Builder builder) {
        }

        public static /* synthetic */ int access$7400(Builder builder) {
        }

        public static /* synthetic */ int access$7500(Builder builder) {
        }

        public static /* synthetic */ String access$7600(Builder builder) {
        }

        public static /* synthetic */ boolean access$7700(Builder builder) {
        }

        public static /* synthetic */ int access$7800(Builder builder) {
        }

        public static /* synthetic */ int access$7900(Builder builder) {
        }

        public static /* synthetic */ String access$800(Builder builder) {
        }

        public static /* synthetic */ int access$8000(Builder builder) {
        }

        public static /* synthetic */ int access$8100(Builder builder) {
        }

        public static /* synthetic */ String access$8200(Builder builder) {
        }

        public static /* synthetic */ String access$8300(Builder builder) {
        }

        public static /* synthetic */ String access$8400(Builder builder) {
        }

        public static /* synthetic */ String access$8500(Builder builder) {
        }

        public static /* synthetic */ String access$8600(Builder builder) {
        }

        public static /* synthetic */ int access$8700(Builder builder) {
        }

        public static /* synthetic */ int access$8800(Builder builder) {
        }

        public static /* synthetic */ int access$8900(Builder builder) {
        }

        public static /* synthetic */ int access$900(Builder builder) {
        }

        public static /* synthetic */ int access$9000(Builder builder) {
        }

        public static /* synthetic */ int access$9100(Builder builder) {
        }

        public static /* synthetic */ boolean access$9200(Builder builder) {
        }

        public static /* synthetic */ float access$9300(Builder builder) {
        }

        public static /* synthetic */ String access$9400(Builder builder) {
        }

        public static /* synthetic */ String access$9500(Builder builder) {
        }

        public static /* synthetic */ int access$9600(Builder builder) {
        }

        public AuthUIConfig create() {
        }

        public Builder setAppPrivacyColor(@ColorInt int i2, @ColorInt int i3) {
        }

        public Builder setAppPrivacyOne(String str, String str2) {
        }

        public Builder setAppPrivacyThree(String str, String str2) {
        }

        public Builder setAppPrivacyTwo(String str, String str2) {
        }

        public Builder setAuthPageActIn(String str, String str2) {
        }

        public Builder setAuthPageActOut(String str, String str2) {
        }

        public Builder setBottomNavColor(@ColorInt int i2) {
        }

        public Builder setCheckBoxHeight(int i2) {
        }

        public Builder setCheckBoxWidth(int i2) {
        }

        public Builder setCheckboxHidden(boolean z) {
        }

        public Builder setCheckedImgPath(String str) {
        }

        public Builder setDialogAlpha(float f2) {
        }

        public Builder setDialogBottom(boolean z) {
        }

        public Builder setDialogHeight(int i2) {
        }

        public Builder setDialogOffsetX(int i2) {
        }

        public Builder setDialogOffsetY(int i2) {
        }

        public Builder setDialogWidth(int i2) {
        }

        public Builder setLightColor(boolean z) {
        }

        public Builder setLoadingImgPath(String str) {
        }

        public Builder setLogBtnBackgroundPath(String str) {
        }

        public Builder setLogBtnHeight(int i2) {
        }

        public Builder setLogBtnLayoutGravity(int i2) {
        }

        public Builder setLogBtnMarginLeftAndRight(int i2) {
        }

        public Builder setLogBtnOffsetX(int i2) {
        }

        public Builder setLogBtnOffsetY(int i2) {
        }

        public Builder setLogBtnOffsetY_B(int i2) {
        }

        public Builder setLogBtnText(String str) {
        }

        public Builder setLogBtnTextColor(@ColorInt int i2) {
        }

        public Builder setLogBtnTextSize(int i2) {
        }

        public Builder setLogBtnToastHidden(boolean z) {
        }

        public Builder setLogBtnWidth(int i2) {
        }

        public Builder setLogoHeight(int i2) {
        }

        public Builder setLogoHidden(boolean z) {
        }

        public Builder setLogoImgPath(String str) {
        }

        public Builder setLogoOffsetY(int i2) {
        }

        public Builder setLogoOffsetY_B(int i2) {
        }

        public Builder setLogoScaleType(ImageView.ScaleType scaleType) {
        }

        public Builder setLogoWidth(int i2) {
        }

        public Builder setNavColor(@ColorInt int i2) {
        }

        public Builder setNavHidden(boolean z) {
        }

        public Builder setNavReturnHidden(boolean z) {
        }

        public Builder setNavReturnImgHeight(int i2) {
        }

        public Builder setNavReturnImgPath(String str) {
        }

        public Builder setNavReturnImgWidth(int i2) {
        }

        public Builder setNavReturnScaleType(ImageView.ScaleType scaleType) {
        }

        public Builder setNavText(String str) {
        }

        public Builder setNavTextColor(@ColorInt int i2) {
        }

        public Builder setNavTextSize(int i2) {
        }

        public Builder setNumFieldOffsetY(int i2) {
        }

        public Builder setNumFieldOffsetY_B(int i2) {
        }

        public Builder setNumberColor(@ColorInt int i2) {
        }

        public Builder setNumberFieldOffsetX(int i2) {
        }

        public Builder setNumberLayoutGravity(int i2) {
        }

        public Builder setNumberSize(int i2) {
        }

        public Builder setPageBackgroundPath(String str) {
        }

        public Builder setPrivacyBefore(String str) {
        }

        public Builder setPrivacyEnd(String str) {
        }

        public Builder setPrivacyMargin(int i2) {
        }

        public Builder setPrivacyOffsetX(int i2) {
        }

        public Builder setPrivacyOffsetY(int i2) {
        }

        public Builder setPrivacyOffsetY_B(int i2) {
        }

        public Builder setPrivacyState(boolean z) {
        }

        public Builder setPrivacyTextSize(int i2) {
        }

        public Builder setProtocolGravity(int i2) {
        }

        public Builder setProtocolLayoutGravity(int i2) {
        }

        public Builder setScreenOrientation(int i2) {
        }

        public Builder setSloganHidden(boolean z) {
        }

        public Builder setSloganOffsetY(int i2) {
        }

        public Builder setSloganOffsetY_B(int i2) {
        }

        public Builder setSloganText(String str) {
        }

        public Builder setSloganTextColor(@ColorInt int i2) {
        }

        public Builder setSloganTextSize(int i2) {
        }

        public Builder setStatusBarColor(@ColorInt int i2) {
        }

        public Builder setStatusBarHidden(boolean z) {
        }

        public Builder setStatusBarUIFlag(int i2) {
        }

        public Builder setSwitchAccHidden(boolean z) {
        }

        public Builder setSwitchAccText(String str) {
        }

        public Builder setSwitchAccTextColor(@ColorInt int i2) {
        }

        public Builder setSwitchAccTextSize(int i2) {
        }

        public Builder setSwitchOffsetY(int i2) {
        }

        public Builder setSwitchOffsetY_B(int i2) {
        }

        public Builder setUncheckedImgPath(String str) {
        }

        public Builder setVendorPrivacyPrefix(String str) {
        }

        public Builder setVendorPrivacySuffix(String str) {
        }

        public Builder setWebNavColor(@ColorInt int i2) {
        }

        public Builder setWebNavReturnImgPath(String str) {
        }

        public Builder setWebNavTextColor(@ColorInt int i2) {
        }

        public Builder setWebNavTextSize(int i2) {
        }

        public Builder setWebViewStatusBarColor(@ColorInt int i2) {
        }
    }

    private AuthUIConfig(Builder builder) {
    }

    public /* synthetic */ AuthUIConfig(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public String getActivityIn() {
    }

    public String getActivityOut() {
    }

    public String getAuthPageActIn() {
    }

    public String getAuthPageActOut() {
    }

    public int getBottomNavBarColor() {
    }

    public int getCheckBoxHeight() {
    }

    public int getCheckBoxWidth() {
    }

    public String getCheckedImgPath() {
    }

    public float getDialogAlpha() {
    }

    public int getDialogHeight() {
    }

    public int getDialogOffsetX() {
    }

    public int getDialogOffsetY() {
    }

    public int getDialogWidth() {
    }

    public String getLoadingImgPath() {
    }

    public String getLogBtnBackgroundPath() {
    }

    public int getLogBtnHeight() {
    }

    public int getLogBtnLayoutGravity() {
    }

    public int getLogBtnMarginLeftAndRight() {
    }

    public int getLogBtnOffsetX() {
    }

    public int getLogBtnOffsetY() {
    }

    public int getLogBtnOffsetY_B() {
    }

    public String getLogBtnText() {
    }

    public int getLogBtnTextColor() {
    }

    public int getLogBtnTextSize() {
    }

    public int getLogBtnWidth() {
    }

    public int getLogoHeight() {
    }

    public String getLogoImgPath() {
    }

    public int getLogoOffsetY() {
    }

    public int getLogoOffsetY_B() {
    }

    public ImageView.ScaleType getLogoScaleType() {
    }

    public int getLogoWidth() {
    }

    public int getNavColor() {
    }

    public int getNavReturnImgHeight() {
    }

    public String getNavReturnImgPath() {
    }

    public int getNavReturnImgWidth() {
    }

    public ImageView.ScaleType getNavReturnScaleType() {
    }

    public String getNavText() {
    }

    public int getNavTextColor() {
    }

    public int getNavTextSize() {
    }

    public int getNumFieldOffsetY() {
    }

    public int getNumFieldOffsetY_B() {
    }

    public int getNumberColor() {
    }

    public int getNumberFieldOffsetX() {
    }

    public int getNumberLayoutGravity() {
    }

    public int getNumberSize() {
    }

    public String getPageBackgroundPath() {
    }

    public String getPrivacyBefore() {
    }

    public String getPrivacyEnd() {
    }

    public int getPrivacyMargin() {
    }

    public int getPrivacyOffsetX() {
    }

    public int getPrivacyOffsetY() {
    }

    public int getPrivacyOffsetY_B() {
    }

    public int getPrivacyTextSize() {
    }

    public int getProtocolColor() {
    }

    public int getProtocolGravity() {
    }

    public int getProtocolLayoutGravity() {
    }

    public int getProtocolOneColor() {
    }

    public String getProtocolOneName() {
    }

    public String getProtocolOneURL() {
    }

    public int getProtocolThreeColor() {
    }

    public String getProtocolThreeName() {
    }

    public String getProtocolThreeURL() {
    }

    public int getProtocolTwoColor() {
    }

    public String getProtocolTwoName() {
    }

    public String getProtocolTwoURL() {
    }

    public int getScreenOrientation() {
    }

    public int getSloganOffsetY() {
    }

    public int getSloganOffsetY_B() {
    }

    public String getSloganText() {
    }

    public int getSloganTextColor() {
    }

    public int getSloganTextSize() {
    }

    public int getStatusBarColor() {
    }

    public int getStatusBarUIFlag() {
    }

    public String getSwitchAccText() {
    }

    public int getSwitchAccTextColor() {
    }

    public int getSwitchAccTextSize() {
    }

    public int getSwitchOffsetY() {
    }

    public int getSwitchOffsetY_B() {
    }

    public String getUncheckedImgPath() {
    }

    public String getVendorPrivacyPrefix() {
    }

    public String getVendorPrivacySuffix() {
    }

    public int getWebNavColor() {
    }

    public String getWebNavReturnImgPath() {
    }

    public int getWebNavTextColor() {
    }

    public int getWebNavTextSize() {
    }

    public int getWebViewStatusBarColor() {
    }

    public boolean isCheckboxHidden() {
    }

    public boolean isDialog() {
    }

    public boolean isDialogBottom() {
    }

    public boolean isLightColor() {
    }

    public boolean isLogBtnToastHidden() {
    }

    public boolean isLogoHidden() {
    }

    public boolean isNavHidden() {
    }

    public boolean isNavReturnHidden() {
    }

    public boolean isPrivacyState() {
    }

    public boolean isSloganHidden() {
    }

    public boolean isStatusBarHidden() {
    }

    public boolean isSwitchAccHidden() {
    }

    public void setDialogAlpha(float f2) {
    }

    public void setProtocolThreeColor(int i2) {
    }

    public void setProtocolThreeName(String str) {
    }

    public void setProtocolThreeURL(String str) {
    }

    public String toString() {
    }
}
