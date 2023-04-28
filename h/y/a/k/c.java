package h.y.a.k;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import javax.annotation.Nullable;

/* compiled from: OnGetBitmapListener.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class c extends BaseBitmapDataSubscriber {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f26235a;
    public DataSource<CloseableReference<CloseableImage>> b;
    public final Handler c;

    /* compiled from: OnGetBitmapListener.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f26236a;

        public a(c cVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public abstract void a(DataSource<CloseableReference<CloseableImage>> dataSource);

    public abstract void b(@Nullable Bitmap bitmap);

    @Override // com.facebook.datasource.BaseDataSubscriber
    public void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
    }

    @Override // com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber
    public void onNewResultImpl(@Nullable Bitmap bitmap) {
    }
}
