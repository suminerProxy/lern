package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MetadataRetriever {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final MediaSourceFactory mediaSourceFactory;
        private final HandlerWrapper mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private final SettableFuture<TrackGroupArray> trackGroupsFuture;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class MediaSourceHandlerCallback implements Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private MediaPeriod mediaPeriod;
            private MediaSource mediaSource;
            private final MediaSourceCaller mediaSourceCaller;
            public final /* synthetic */ MetadataRetrieverInternal this$0;

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {
                private final Allocator allocator;
                private final MediaPeriodCallback mediaPeriodCallback;
                private boolean mediaPeriodCreated;
                public final /* synthetic */ MediaSourceHandlerCallback this$1;

                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    public final /* synthetic */ MediaSourceCaller this$2;

                    private MediaPeriodCallback(final MediaSourceCaller this$2) {
                    }

                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                    }

                    public /* synthetic */ MediaPeriodCallback(MediaSourceCaller mediaSourceCaller, AnonymousClass1 anonymousClass1) {
                    }

                    /* renamed from: onContinueLoadingRequested  reason: avoid collision after fix types in other method */
                    public void onContinueLoadingRequested2(MediaPeriod mediaPeriod) {
                    }
                }

                public MediaSourceCaller(final MediaSourceHandlerCallback this$1) {
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource source, Timeline timeline) {
                }
            }

            public MediaSourceHandlerCallback(final MetadataRetrieverInternal this$0) {
            }

            public static /* synthetic */ MediaPeriod access$500(MediaSourceHandlerCallback mediaSourceHandlerCallback) {
            }

            public static /* synthetic */ MediaPeriod access$502(MediaSourceHandlerCallback mediaSourceHandlerCallback, MediaPeriod mediaPeriod) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message msg) {
            }
        }

        public MetadataRetrieverInternal(MediaSourceFactory mediaSourceFactory, Clock clock) {
        }

        public static /* synthetic */ MediaSourceFactory access$000(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        public static /* synthetic */ HandlerWrapper access$100(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        public static /* synthetic */ SettableFuture access$200(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        public static /* synthetic */ HandlerThread access$300(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        public ListenableFuture<TrackGroupArray> retrieveMetadata(MediaItem mediaItem) {
        }
    }

    private MetadataRetriever() {
    }

    public static ListenableFuture<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem) {
    }

    public static ListenableFuture<TrackGroupArray> retrieveMetadata(MediaSourceFactory mediaSourceFactory, MediaItem mediaItem) {
    }

    @VisibleForTesting
    public static ListenableFuture<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem, Clock clock) {
    }

    private static ListenableFuture<TrackGroupArray> retrieveMetadata(MediaSourceFactory mediaSourceFactory, MediaItem mediaItem, Clock clock) {
    }
}
