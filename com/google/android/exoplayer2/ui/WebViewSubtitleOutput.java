package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends WebView {
        public AnonymousClass1(final WebViewSubtitleOutput this$0, Context context, AttributeSet attrs) {
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent event) {
        }

        @Override // android.view.View
        public boolean performClick() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment = null;
    }

    public WebViewSubtitleOutput(Context context) {
    }

    private static int anchorTypeToTranslatePercent(int anchorType) {
    }

    private static String convertAlignmentToCss(@Nullable Layout.Alignment alignment) {
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat style) {
    }

    private String convertTextSizeToCss(int type, float size) {
    }

    private static String convertVerticalTypeToCss(int verticalType) {
    }

    private static String getBlockShearTransformFunction(Cue cue) {
    }

    private void updateWebView() {
    }

    public void destroy() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(List<Cue> cues, CaptionStyleCompat style, float textSize, int textSizeType, float bottomPaddingFraction) {
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attrs) {
    }
}
