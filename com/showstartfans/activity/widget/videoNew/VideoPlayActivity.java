package com.showstartfans.activity.widget.videoNew;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import com.showstartfans.activity.model.VocalConcertDetailPhotoBean;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/widget/videoNew/VideoPlayActivity;", "Landroid/app/Activity;", "()V", "audioManager", "Landroid/media/AudioManager;", "fromStation", "", "videoBean", "Lcom/showstartfans/activity/model/VocalConcertDetailPhotoBean;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class VideoPlayActivity extends Activity {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final a f7496f = null;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private static final String f7497g = null;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final String f7498h = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private VocalConcertDetailPhotoBean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7499d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private AudioManager f7500e;

    /* compiled from: VideoPlayActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/showstartfans/activity/widget/videoNew/VideoPlayActivity$Companion;", "", "()V", "FROM_STATION", "", "VIDEO_BEAN", "start", "", "ctx", "Landroid/content/Context;", "videoBean", "Lcom/showstartfans/activity/model/VocalConcertDetailPhotoBean;", "isStation", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void c(a aVar, Context context, VocalConcertDetailPhotoBean vocalConcertDetailPhotoBean, boolean z, int i2, Object obj) {
        }

        public final void a(@NotNull Context context, @NotNull VocalConcertDetailPhotoBean vocalConcertDetailPhotoBean) {
        }

        public final void b(@NotNull Context context, @NotNull VocalConcertDetailPhotoBean vocalConcertDetailPhotoBean, boolean z) {
        }
    }

    public static final /* synthetic */ String c() {
    }

    public static final /* synthetic */ String d() {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onResume() {
    }
}
