package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BitmapPoolBackend extends LruBucketsPoolBackend<Bitmap> {
    private static final String TAG = "BitmapPoolBackend";

    @Override // com.facebook.imagepipeline.memory.LruBucketsPoolBackend, com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public /* bridge */ /* synthetic */ Object get(int size) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public /* bridge */ /* synthetic */ int getSize(Object bitmap) {
    }

    public boolean isReusable(@Nullable Bitmap bitmap) {
    }

    @Override // com.facebook.imagepipeline.memory.LruBucketsPoolBackend, com.facebook.imagepipeline.memory.PoolBackend
    public /* bridge */ /* synthetic */ void put(Object bitmap) {
    }

    @Override // com.facebook.imagepipeline.memory.LruBucketsPoolBackend, com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public Bitmap get(int size) {
    }

    public int getSize(Bitmap bitmap) {
    }

    public void put(Bitmap bitmap) {
    }
}
