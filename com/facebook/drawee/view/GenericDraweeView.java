package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchyInflater;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GenericDraweeView extends DraweeView<GenericDraweeHierarchy> {
    public GenericDraweeView(Context context, GenericDraweeHierarchy hierarchy) {
        super(context);
        setHierarchy(hierarchy);
    }

    public void inflateHierarchy(Context context, @Nullable AttributeSet attrs) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("GenericDraweeView#inflateHierarchy");
        }
        GenericDraweeHierarchyBuilder inflateBuilder = GenericDraweeHierarchyInflater.inflateBuilder(context, attrs);
        setAspectRatio(inflateBuilder.getDesiredAspectRatio());
        setHierarchy(inflateBuilder.build());
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    public GenericDraweeView(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public GenericDraweeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflateHierarchy(context, attrs);
    }

    public GenericDraweeView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        inflateHierarchy(context, attrs);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        inflateHierarchy(context, attrs);
    }
}
