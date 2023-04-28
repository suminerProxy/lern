package cn.sharesdk.framework;

import com.mob.OperationCallback;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ProvicyCanContinue {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ProvicyCanContinue f78a;

    /* renamed from: cn.sharesdk.framework.ProvicyCanContinue$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends OperationCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnBusinessListener f79a;
        public final /* synthetic */ ProvicyCanContinue b;

        public AnonymousClass1(ProvicyCanContinue provicyCanContinue, OnBusinessListener onBusinessListener) {
        }

        @Override // com.mob.OperationCallback
        public /* bridge */ /* synthetic */ void onComplete(Boolean bool) {
        }

        @Override // com.mob.OperationCallback
        public void onFailure(Throwable th) {
        }

        /* renamed from: onComplete  reason: avoid collision after fix types in other method */
        public void onComplete2(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnBusinessListener {
        void onContinue();

        void onError(Throwable th);

        void onStop();
    }

    private ProvicyCanContinue() {
    }

    public static ProvicyCanContinue a() {
    }

    private void b() {
    }

    public void a(OnBusinessListener onBusinessListener) {
    }
}
