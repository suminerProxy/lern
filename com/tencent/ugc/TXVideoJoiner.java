package com.tencent.ugc;

import android.content.Context;
import com.tencent.ugc.RemuxJoiner;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.TXVideoEditer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVideoJoiner {
    private static final String TAG = "TXVideoJoiner";
    private long mDuration;
    private boolean mIsNeedEdit;
    private RemuxJoiner mRemuxJoiner;
    private final RemuxJoiner.RemuxJoinerListener mRemuxJoinerListener;
    private final com.tencent.liteav.base.util.l mSequenceTaskRunner;
    private final TXVideoEditer.TXVideoGenerateListener mTXEditerVideoJoinerListener;
    private final TXVideoEditer.TXVideoPreviewListener mTXEditerVideoPreviewListener;
    private final TXVideoEditer mTXVideoEditer;
    private TXVideoJoinerListener mTXVideoJoinerListener;
    private TXVideoPreviewListener mTXVideoPreviewListener;
    private String mVideoOutputPath;
    private List<String> mVideoSourceList;

    /* renamed from: com.tencent.ugc.TXVideoJoiner$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements TXVideoEditer.TXVideoPreviewListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoJoiner f14248a;

        public AnonymousClass1(TXVideoJoiner tXVideoJoiner) {
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
        public final void onPreviewFinished() {
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
        public final void onPreviewProgress(int i2) {
        }
    }

    /* renamed from: com.tencent.ugc.TXVideoJoiner$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements TXVideoEditer.TXVideoGenerateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoJoiner f14249a;

        public AnonymousClass2(TXVideoJoiner tXVideoJoiner) {
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
        public final void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
        public final void onGenerateProgress(float f2) {
        }
    }

    /* renamed from: com.tencent.ugc.TXVideoJoiner$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements RemuxJoiner.RemuxJoinerListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoJoiner f14250a;

        public AnonymousClass3(TXVideoJoiner tXVideoJoiner) {
        }

        public static /* synthetic */ void a(AnonymousClass3 anonymousClass3, float f2) {
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerComplete(int i2, String str) {
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerProgress(float f2) {
        }

        public static /* synthetic */ void a(AnonymousClass3 anonymousClass3, int i2, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXVideoJoinerListener {
        void onJoinComplete(TXVideoEditConstants.TXJoinerResult tXJoinerResult);

        void onJoinProgress(float f2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i2);
    }

    public TXVideoJoiner(Context context) {
    }

    public static /* synthetic */ TXVideoPreviewListener access$000(TXVideoJoiner tXVideoJoiner) {
    }

    public static /* synthetic */ void access$100(TXVideoJoiner tXVideoJoiner, float f2) {
    }

    public static /* synthetic */ void access$200(TXVideoJoiner tXVideoJoiner, int i2, String str) {
    }

    public static /* synthetic */ com.tencent.liteav.base.util.l access$300(TXVideoJoiner tXVideoJoiner) {
    }

    public static /* synthetic */ RemuxJoiner access$400(TXVideoJoiner tXVideoJoiner) {
    }

    public static /* synthetic */ RemuxJoiner access$402(TXVideoJoiner tXVideoJoiner, RemuxJoiner remuxJoiner) {
    }

    public static /* synthetic */ void lambda$cancel$7(TXVideoJoiner tXVideoJoiner) {
    }

    public static /* synthetic */ void lambda$initWithPreview$1(TXVideoJoiner tXVideoJoiner, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
    }

    public static /* synthetic */ void lambda$joinVideo$6(TXVideoJoiner tXVideoJoiner, String str, int i2) {
    }

    public static /* synthetic */ void lambda$setNeedEdit$11(TXVideoJoiner tXVideoJoiner, boolean z) {
    }

    public static /* synthetic */ void lambda$setProfile$5(TXVideoJoiner tXVideoJoiner, int i2) {
    }

    public static /* synthetic */ void lambda$setSplitScreenList$8(TXVideoJoiner tXVideoJoiner, List list, int i2, int i3) {
    }

    public static /* synthetic */ void lambda$setTXVideoPreviewListener$2(TXVideoJoiner tXVideoJoiner, TXVideoPreviewListener tXVideoPreviewListener) {
    }

    public static /* synthetic */ void lambda$setVideoJoinerListener$4(TXVideoJoiner tXVideoJoiner, TXVideoJoinerListener tXVideoJoinerListener) {
    }

    public static /* synthetic */ void lambda$setVideoPathList$0(TXVideoJoiner tXVideoJoiner, List list) {
    }

    public static /* synthetic */ void lambda$setVideoVolumes$9(TXVideoJoiner tXVideoJoiner, float[] fArr) {
    }

    public static /* synthetic */ void lambda$splitJoinVideo$10(TXVideoJoiner tXVideoJoiner, int i2, String str) {
    }

    public static /* synthetic */ void lambda$startPlay$3(TXVideoJoiner tXVideoJoiner) {
    }

    private void notifyJoinComplete(int i2, String str) {
    }

    private void notifyJoinProgress(float f2) {
    }

    private boolean startQuickJoinVideo(String str) {
    }

    public void cancel() {
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
    }

    public void joinVideo(int i2, String str) {
    }

    public void pausePlay() {
    }

    public void resumePlay() {
    }

    public void setNeedEdit(boolean z) {
    }

    public void setProfile(int i2) {
    }

    public void setRecordPath(String str) {
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i2, int i3) {
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
    }

    public void setVideoJoinerListener(TXVideoJoinerListener tXVideoJoinerListener) {
    }

    public int setVideoPathList(List<String> list) {
    }

    public void setVideoVolumes(List<Float> list) {
    }

    public void splitJoinVideo(int i2, String str) {
    }

    public void startPlay() {
    }

    public void stopPlay() {
    }
}
