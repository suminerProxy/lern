package com.google.android.exoplayer2.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import java.util.Comparator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private final MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
    private List<DefaultTrackSelector.SelectionOverride> overrides;
    private final int rendererIndex;
    private boolean showDisableOption;
    @StyleRes
    private int themeResId;
    private final CharSequence title;
    @Nullable
    private Comparator<Format> trackFormatComparator;
    @Nullable
    private TrackNameProvider trackNameProvider;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DialogCallback {
        void onTracksSelected(boolean isDisabled, List<DefaultTrackSelector.SelectionOverride> overrides);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence title, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int rendererIndex, DialogCallback callback) {
    }

    public static /* synthetic */ void a(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, int i2, TrackGroupArray trackGroupArray, boolean z, List list) {
    }

    private /* synthetic */ void b(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i2) {
    }

    @Nullable
    private Dialog buildForAndroidX() {
    }

    private Dialog buildForPlatform() {
    }

    private DialogInterface.OnClickListener setUpDialogView(View dialogView) {
    }

    public Dialog build() {
    }

    public /* synthetic */ void c(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i2) {
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean allowAdaptiveSelections) {
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean allowMultipleOverrides) {
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean isDisabled) {
    }

    public TrackSelectionDialogBuilder setOverride(@Nullable DefaultTrackSelector.SelectionOverride override) {
    }

    public TrackSelectionDialogBuilder setOverrides(List<DefaultTrackSelector.SelectionOverride> overrides) {
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean showDisableOption) {
    }

    public TrackSelectionDialogBuilder setTheme(@StyleRes int themeResId) {
    }

    public void setTrackFormatComparator(@Nullable Comparator<Format> trackFormatComparator) {
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(@Nullable TrackNameProvider trackNameProvider) {
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence title, DefaultTrackSelector trackSelector, int rendererIndex) {
    }
}
