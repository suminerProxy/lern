package com.tbruyelle.rxpermissions;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseFixOTranslucentActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/tbruyelle/rxpermissions/BaseFixOTranslucentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "fixOrientation", "", "isTranslucentOrFloating", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setRequestedOrientation", "requestedOrientation", "", "RxPermissions_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BaseFixOTranslucentActivity extends AppCompatActivity {
    private final boolean fixOrientation() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj != null) {
                ((ActivityInfo) obj).screenOrientation = -1;
                declaredField.setAccessible(false);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.pm.ActivityInfo");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private final boolean isTranslucentOrFloating() {
        boolean z;
        Exception e2;
        Object obj;
        try {
            obj = Class.forName("com.android.internal.R$styleable").getField("Window").get(null);
        } catch (Exception e3) {
            z = false;
            e2 = e3;
        }
        if (obj != null) {
            TypedArray obtainStyledAttributes = obtainStyledAttributes((int[]) obj);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(styleableRes)");
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            Object invoke = method.invoke(null, obtainStyledAttributes);
            if (invoke != null) {
                z = ((Boolean) invoke).booleanValue();
                try {
                    method.setAccessible(false);
                } catch (Exception e4) {
                    e2 = e4;
                    e2.printStackTrace();
                    return z;
                }
                return z;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating()) {
            Intrinsics.stringPlus("onCreate fixOrientation when Oreo, result = ", Boolean.valueOf(fixOrientation()));
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i2) {
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating()) {
            return;
        }
        super.setRequestedOrientation(i2);
    }
}
