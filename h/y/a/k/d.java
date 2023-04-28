package h.y.a.k;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import javax.annotation.Nullable;

/* compiled from: OnGetBitmapListenerCall.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class d extends BaseBitmapDataSubscriber {
    public abstract void a(DataSource<CloseableReference<CloseableImage>> dataSource);

    public abstract void b(@Nullable Bitmap bitmap);

    @Override // com.facebook.datasource.BaseDataSubscriber
    public void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
    }

    @Override // com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber
    public void onNewResultImpl(@Nullable Bitmap bitmap) {
    }
}
