package com.facebook.common.util;

import com.facebook.infer.annotation.Functional;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TriState {
    private static final /* synthetic */ TriState[] $VALUES = null;
    public static final TriState NO = null;
    public static final TriState UNSET = null;
    public static final TriState YES = null;

    /* renamed from: com.facebook.common.util.TriState$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$common$util$TriState = null;
    }

    private TriState(String $enum$name, int $enum$ordinal) {
    }

    @Functional
    public static TriState fromDbValue(int value) {
    }

    public static TriState valueOf(String name) {
    }

    public static TriState[] values() {
    }

    @Functional
    public boolean asBoolean() {
    }

    @Nullable
    @Functional
    public Boolean asBooleanObject() {
    }

    @Functional
    public int getDbValue() {
    }

    @Functional
    public boolean isSet() {
    }

    @Functional
    public static TriState valueOf(boolean bool) {
    }

    @Functional
    public static TriState valueOf(@Nullable Boolean bool) {
    }

    @Functional
    public boolean asBoolean(boolean defaultValue) {
    }
}
