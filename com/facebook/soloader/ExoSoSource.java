package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.UnpackingSoSource;
import java.io.File;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExoSoSource extends UnpackingSoSource {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ExoUnpacker extends UnpackingSoSource.Unpacker {
        private final FileDso[] mDsos;
        public final /* synthetic */ ExoSoSource this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class FileBackedInputDsoIterator extends UnpackingSoSource.InputDsoIterator {
            private int mCurrentDso;
            public final /* synthetic */ ExoUnpacker this$1;

            private FileBackedInputDsoIterator(ExoUnpacker exoUnpacker) {
            }

            @Override // com.facebook.soloader.UnpackingSoSource.InputDsoIterator
            public boolean hasNext() {
            }

            @Override // com.facebook.soloader.UnpackingSoSource.InputDsoIterator
            public UnpackingSoSource.InputDso next() throws IOException {
            }

            public /* synthetic */ FileBackedInputDsoIterator(ExoUnpacker exoUnpacker, AnonymousClass1 anonymousClass1) {
            }
        }

        public ExoUnpacker(ExoSoSource exoSoSource, UnpackingSoSource unpackingSoSource) throws IOException {
        }

        public static /* synthetic */ FileDso[] access$100(ExoUnpacker exoUnpacker) {
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.DsoManifest getDsoManifest() throws IOException {
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.InputDsoIterator openDsoIterator() throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FileDso extends UnpackingSoSource.Dso {
        public final File backingFile;

        public FileDso(String str, String str2, File file) {
        }
    }

    public ExoSoSource(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ExoUnpacker(this, this);
    }
}
