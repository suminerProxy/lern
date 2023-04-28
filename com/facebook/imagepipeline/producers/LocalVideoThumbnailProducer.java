package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LocalVideoThumbnailProducer implements Producer<CloseableReference<CloseableImage>> {
    @VisibleForTesting
    public static final String CREATED_THUMBNAIL = "createdThumbnail";
    public static final String PRODUCER_NAME = "VideoThumbnailProducer";
    private final ContentResolver mContentResolver;
    private final Executor mExecutor;

    public LocalVideoThumbnailProducer(Executor executor, ContentResolver contentResolver) {
        this.mExecutor = executor;
        this.mContentResolver = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateKind(ImageRequest imageRequest) {
        return (imageRequest.getPreferredWidth() > 96 || imageRequest.getPreferredHeight() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Bitmap createThumbnailFromContentProvider(ContentResolver contentResolver, Uri uri) {
        if (Build.VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                Preconditions.checkNotNull(openFileDescriptor);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1L);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String getLocalFilePath(ImageRequest imageRequest) {
        Uri uri;
        String str;
        String[] strArr;
        Uri sourceUri = imageRequest.getSourceUri();
        if (UriUtil.isLocalFileUri(sourceUri)) {
            return imageRequest.getSourceFile().getPath();
        }
        if (UriUtil.isLocalContentUri(sourceUri)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(sourceUri.getAuthority())) {
                uri = sourceUri;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(sourceUri);
                Preconditions.checkNotNull(documentId);
                String[] strArr2 = {documentId.split(":")[1]};
                str = "_id=?";
                uri = (Uri) Preconditions.checkNotNull(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                strArr = strArr2;
            }
            Cursor query = this.mContentResolver.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext) {
        ProducerListener2 producerListener = producerContext.getProducerListener();
        ImageRequest imageRequest = producerContext.getImageRequest();
        producerContext.putOriginExtra("local", "video");
        StatefulProducerRunnable<CloseableReference<CloseableImage>> statefulProducerRunnable = new StatefulProducerRunnable<CloseableReference<CloseableImage>>(this, consumer, producerListener, producerContext, PRODUCER_NAME, producerListener, producerContext, imageRequest) { // from class: com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer.1
            public final /* synthetic */ LocalVideoThumbnailProducer this$0;
            public final /* synthetic */ ImageRequest val$imageRequest;
            public final /* synthetic */ ProducerListener2 val$listener;
            public final /* synthetic */ ProducerContext val$producerContext;

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void disposeResult(Object result) {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable
            public /* bridge */ /* synthetic */ Map getExtraMapOnSuccess(@Nullable final CloseableReference<CloseableImage> result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public /* bridge */ /* synthetic */ Object getResult() throws Exception {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void onFailure(Exception e2) {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void onSuccess(@Nullable Object result) {
            }

            public void disposeResult(CloseableReference<CloseableImage> result) {
            }

            /* renamed from: getExtraMapOnSuccess  reason: avoid collision after fix types in other method */
            public Map<String, String> getExtraMapOnSuccess2(@Nullable final CloseableReference<CloseableImage> result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public CloseableReference<CloseableImage> getResult() throws Exception {
            }

            public void onSuccess(@Nullable CloseableReference<CloseableImage> result) {
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks(this, statefulProducerRunnable) { // from class: com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer.2
            public final /* synthetic */ LocalVideoThumbnailProducer this$0;
            public final /* synthetic */ StatefulProducerRunnable val$cancellableProducerRunnable;

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        });
        this.mExecutor.execute(statefulProducerRunnable);
    }
}
