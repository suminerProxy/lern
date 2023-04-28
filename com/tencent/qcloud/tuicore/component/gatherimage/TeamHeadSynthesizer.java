package com.tencent.qcloud.tuicore.component.gatherimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;
import java.util.concurrent.ExecutionException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TeamHeadSynthesizer implements Synthesizer {
    public Callback callback;
    public String currentImageId;
    public ImageView imageView;
    public Context mContext;
    public MultiImageData multiImageData;

    /* renamed from: com.tencent.qcloud.tuicore.component.gatherimage.TeamHeadSynthesizer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Callback {
        public final /* synthetic */ TeamHeadSynthesizer this$0;

        public AnonymousClass1(TeamHeadSynthesizer teamHeadSynthesizer) {
        }

        @Override // com.tencent.qcloud.tuicore.component.gatherimage.TeamHeadSynthesizer.Callback
        public void onCall(Bitmap bitmap, String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.gatherimage.TeamHeadSynthesizer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ TeamHeadSynthesizer this$0;
        public final /* synthetic */ MultiImageData val$finalCopyMultiImageData;
        public final /* synthetic */ String val$finalImageId;

        /* renamed from: com.tencent.qcloud.tuicore.component.gatherimage.TeamHeadSynthesizer$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ Bitmap val$bitmap;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Bitmap bitmap) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuicore.component.gatherimage.TeamHeadSynthesizer$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC02102 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ Bitmap val$finalExistsBitmap;

            public RunnableC02102(AnonymousClass2 anonymousClass2, Bitmap bitmap) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(TeamHeadSynthesizer teamHeadSynthesizer, String str, MultiImageData multiImageData) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface Callback {
        void onCall(Bitmap bitmap, String str);
    }

    public TeamHeadSynthesizer(Context context, ImageView imageView) {
    }

    private Bitmap asyncLoadImage(Object obj, int i2) throws ExecutionException, InterruptedException {
    }

    private void init() {
    }

    @Override // com.tencent.qcloud.tuicore.component.gatherimage.Synthesizer
    public boolean asyncLoadImageList(MultiImageData multiImageData) {
    }

    public int[] calculateGridParam(int i2) {
    }

    public void clearImage() {
    }

    public void drawBitmapAtPosition(Canvas canvas, int i2, int i3, int i4, int i5, Bitmap bitmap) {
    }

    @Override // com.tencent.qcloud.tuicore.component.gatherimage.Synthesizer
    public void drawDrawable(Canvas canvas, MultiImageData multiImageData) {
    }

    public int getDefaultImage() {
    }

    public String getImageId() {
    }

    public MultiImageData getMultiImageData() {
    }

    public void load(String str) {
    }

    public void setBgColor(int i2) {
    }

    public void setDefaultImage(int i2) {
    }

    public void setGap(int i2) {
    }

    public void setImageId(String str) {
    }

    public void setMaxWidthHeight(int i2, int i3) {
    }

    @Override // com.tencent.qcloud.tuicore.component.gatherimage.Synthesizer
    public Bitmap synthesizeImageList(MultiImageData multiImageData) {
    }
}
