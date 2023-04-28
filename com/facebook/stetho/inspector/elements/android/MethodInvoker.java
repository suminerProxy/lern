package com.facebook.stetho.inspector.elements.android;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MethodInvoker {
    private static final List<TypedMethodInvoker<?>> invokers = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BooleanMethodInvoker extends TypedMethodInvoker<Boolean> {
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public /* bridge */ /* synthetic */ Boolean convertArgument(String str) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public Boolean convertArgument(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CharSequenceMethodInvoker extends TypedMethodInvoker<CharSequence> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public CharSequence convertArgument(String str) {
        }

        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public /* bridge */ /* synthetic */ CharSequence convertArgument(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FloatMethodInvoker extends TypedMethodInvoker<Float> {
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public /* bridge */ /* synthetic */ Float convertArgument(String str) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public Float convertArgument(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class IntegerMethodInvoker extends TypedMethodInvoker<Integer> {
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public /* bridge */ /* synthetic */ Integer convertArgument(String str) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public Integer convertArgument(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StringMethodInvoker extends TypedMethodInvoker<String> {
        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        public /* bridge */ /* synthetic */ String convertArgument(String str) {
        }

        @Override // com.facebook.stetho.inspector.elements.android.MethodInvoker.TypedMethodInvoker
        /* renamed from: convertArgument  reason: avoid collision after fix types in other method */
        public String convertArgument2(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class TypedMethodInvoker<T> {
        private final Class<T> mArgType;

        public TypedMethodInvoker(Class<T> cls) {
        }

        public abstract T convertArgument(String str);

        public boolean invoke(Object obj, String str, String str2) {
        }
    }

    public void invoke(Object obj, String str, String str2) {
    }
}
