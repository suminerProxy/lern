package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ParsingLoadable<T> implements Loader.Loadable {
    private final StatsDataSource dataSource;
    public final DataSpec dataSpec;
    public final long loadTaskId;
    private final Parser<? extends T> parser;
    @Nullable
    private volatile T result;
    public final int type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Parser<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public ParsingLoadable(DataSource dataSource, Uri uri, int type, Parser<? extends T> parser) {
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, Uri uri, int type) throws IOException {
    }

    public long bytesLoaded() {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    public Map<String, List<String>> getResponseHeaders() {
    }

    @Nullable
    public final T getResult() {
    }

    public Uri getUri() {
    }

    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int type, Parser<? extends T> parser) {
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, DataSpec dataSpec, int type) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws IOException {
    }
}
