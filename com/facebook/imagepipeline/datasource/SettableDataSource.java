package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SettableDataSource<T> extends AbstractDataSource<CloseableReference<T>> {
    private SettableDataSource() {
    }

    public static <V> SettableDataSource<V> create() {
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public /* bridge */ /* synthetic */ void closeResult(@Nullable Object result) {
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    @Nullable
    public /* bridge */ /* synthetic */ Object getResult() {
    }

    public boolean set(@Nullable CloseableReference<T> valueRef) {
    }

    public boolean setException(Throwable throwable) {
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setProgress(float progress) {
    }

    public void closeResult(@Nullable CloseableReference<T> result) {
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    @Nullable
    public CloseableReference<T> getResult() {
    }
}
