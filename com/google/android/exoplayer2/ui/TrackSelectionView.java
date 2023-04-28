package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final ComponentListener componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    @Nullable
    private TrackSelectionListener listener;
    private MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
    private final SparseArray<DefaultTrackSelector.SelectionOverride> overrides;
    private int rendererIndex;
    private final int selectableItemBackgroundResourceId;
    private TrackGroupArray trackGroups;
    @Nullable
    private Comparator<TrackInfo> trackInfoComparator;
    private TrackNameProvider trackNameProvider;
    private CheckedTextView[][] trackViews;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ComponentListener implements View.OnClickListener {
        public final /* synthetic */ TrackSelectionView this$0;

        private ComponentListener(final TrackSelectionView this$0) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        public /* synthetic */ ComponentListener(TrackSelectionView trackSelectionView, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TrackInfo {
        public final Format format;
        public final int groupIndex;
        public final int trackIndex;

        public TrackInfo(int groupIndex, int trackIndex, Format format) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean isDisabled, List<DefaultTrackSelector.SelectionOverride> overrides);
    }

    public TrackSelectionView(Context context) {
    }

    public static /* synthetic */ int a(Comparator comparator, TrackInfo trackInfo, TrackInfo trackInfo2) {
    }

    public static /* synthetic */ void access$100(TrackSelectionView trackSelectionView, View view) {
    }

    private static int[] getTracksAdding(int[] tracks, int addedTrack) {
    }

    private static int[] getTracksRemoving(int[] tracks, int removedTrack) {
    }

    private void onClick(View view) {
    }

    private void onDefaultViewClicked() {
    }

    private void onDisableViewClicked() {
    }

    private void onTrackViewClicked(View view) {
    }

    @RequiresNonNull({"mappedTrackInfo"})
    private boolean shouldEnableAdaptiveSelection(int groupIndex) {
    }

    private boolean shouldEnableMultiGroupSelection() {
    }

    private void updateViewStates() {
    }

    private void updateViews() {
    }

    public boolean getIsDisabled() {
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
    }

    public void init(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int rendererIndex, boolean isDisabled, List<DefaultTrackSelector.SelectionOverride> overrides, @Nullable Comparator<Format> trackFormatComparator, @Nullable TrackSelectionListener listener) {
    }

    public void setAllowAdaptiveSelections(boolean allowAdaptiveSelections) {
    }

    public void setAllowMultipleOverrides(boolean allowMultipleOverrides) {
    }

    public void setShowDisableOption(boolean showDisableOption) {
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attrs) {
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
    }
}
