package com.google.android.exoplayer2.extractor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput PLACEHOLDER = null;

    /* renamed from: com.google.android.exoplayer2.extractor.ExtractorOutput$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements ExtractorOutput {
        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int id, int type) {
        }
    }

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int id, int type);
}
