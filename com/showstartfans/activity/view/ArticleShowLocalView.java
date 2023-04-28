package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.model.Article;
import com.taihebase.activity.view.LoadImageView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleShowLocalView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010'R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/showstartfans/activity/view/ArticleShowLocalView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layout_left", "Landroid/widget/LinearLayout;", "getLayout_left", "()Landroid/widget/LinearLayout;", "layout_local", "getLayout_local", "locMsg", "Landroid/widget/TextView;", "getLocMsg", "()Landroid/widget/TextView;", "onViewClick", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/view/OnViewClick;", "getOnViewClick", "()Lkotlin/jvm/functions/Function0;", "setOnViewClick", "(Lkotlin/jvm/functions/Function0;)V", "show_activity_conver", "Lcom/taihebase/activity/view/LoadImageView;", "getShow_activity_conver", "()Lcom/taihebase/activity/view/LoadImageView;", "show_activity_name", "Lcom/showstartfans/activity/view/AutoScrollTextView;", "getShow_activity_name", "()Lcom/showstartfans/activity/view/AutoScrollTextView;", "setData", "data", "Lcom/showstartfans/activity/model/Article;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ArticleShowLocalView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function0<Unit> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final LoadImageView f6599d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final AutoScrollTextView f6600e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final TextView f6601f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final LinearLayout f6602g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final LinearLayout f6603h;

    public ArticleShowLocalView(@NotNull Context context) {
    }

    public static /* synthetic */ void c(Article article, ArticleShowLocalView articleShowLocalView, View view) {
    }

    public static /* synthetic */ void d(ArticleShowLocalView articleShowLocalView, Article article, View view) {
    }

    private static final void e(ArticleShowLocalView articleShowLocalView, Article article, View view) {
    }

    private static final void f(Article article, ArticleShowLocalView articleShowLocalView, View view) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @NotNull
    public final LinearLayout getLayout_left() {
    }

    @NotNull
    public final LinearLayout getLayout_local() {
    }

    @NotNull
    public final TextView getLocMsg() {
    }

    @Nullable
    public final Function0<Unit> getOnViewClick() {
    }

    @NotNull
    public final LoadImageView getShow_activity_conver() {
    }

    @NotNull
    public final AutoScrollTextView getShow_activity_name() {
    }

    public final void setData(@Nullable Article article) {
    }

    public final void setOnViewClick(@Nullable Function0<Unit> function0) {
    }

    public ArticleShowLocalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ArticleShowLocalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
