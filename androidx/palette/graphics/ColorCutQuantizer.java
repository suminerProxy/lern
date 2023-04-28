package androidx.palette.graphics;

import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.palette.graphics.Palette;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ColorCutQuantizer {
    public static final int COMPONENT_BLUE = -1;
    public static final int COMPONENT_GREEN = -2;
    public static final int COMPONENT_RED = -3;
    private static final String LOG_TAG = "ColorCutQuantizer";
    private static final boolean LOG_TIMINGS = false;
    private static final int QUANTIZE_WORD_MASK = 31;
    private static final int QUANTIZE_WORD_WIDTH = 5;
    private static final Comparator<Vbox> VBOX_COMPARATOR_VOLUME = null;
    public final int[] mColors;
    public final Palette.Filter[] mFilters;
    public final int[] mHistogram;
    public final List<Palette.Swatch> mQuantizedColors;
    private final float[] mTempHsl;
    @Nullable
    public final TimingLogger mTimingLogger;

    /* renamed from: androidx.palette.graphics.ColorCutQuantizer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Comparator<Vbox> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Vbox vbox, Vbox vbox2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Vbox vbox, Vbox vbox2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class Vbox {
        private int mLowerIndex;
        private int mMaxBlue;
        private int mMaxGreen;
        private int mMaxRed;
        private int mMinBlue;
        private int mMinGreen;
        private int mMinRed;
        private int mPopulation;
        private int mUpperIndex;
        public final /* synthetic */ ColorCutQuantizer this$0;

        public Vbox(ColorCutQuantizer colorCutQuantizer, int i2, int i3) {
        }

        public final boolean canSplit() {
        }

        public final int findSplitPoint() {
        }

        public final void fitBox() {
        }

        public final Palette.Swatch getAverageColor() {
        }

        public final int getColorCount() {
        }

        public final int getLongestColorDimension() {
        }

        public final int getVolume() {
        }

        public final Vbox splitBox() {
        }
    }

    public ColorCutQuantizer(int[] iArr, int i2, Palette.Filter[] filterArr) {
    }

    public static int approximateToRgb888(int i2, int i3, int i4) {
    }

    private List<Palette.Swatch> generateAverageColors(Collection<Vbox> collection) {
    }

    public static void modifySignificantOctet(int[] iArr, int i2, int i3, int i4) {
    }

    private static int modifyWordWidth(int i2, int i3, int i4) {
    }

    private static int quantizeFromRgb888(int i2) {
    }

    private List<Palette.Swatch> quantizePixels(int i2) {
    }

    public static int quantizedBlue(int i2) {
    }

    public static int quantizedGreen(int i2) {
    }

    public static int quantizedRed(int i2) {
    }

    private boolean shouldIgnoreColor(int i2) {
    }

    private void splitBoxes(PriorityQueue<Vbox> priorityQueue, int i2) {
    }

    public List<Palette.Swatch> getQuantizedColors() {
    }

    private boolean shouldIgnoreColor(Palette.Swatch swatch) {
    }

    private static int approximateToRgb888(int i2) {
    }

    private boolean shouldIgnoreColor(int i2, float[] fArr) {
    }
}
