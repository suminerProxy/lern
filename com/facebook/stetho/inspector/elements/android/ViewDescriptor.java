package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewDebug;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewDescriptor extends AbstractChainedDescriptor<View> implements HighlightableDescriptor<View> {
    private static final String ACCESSIBILITY_STYLE_RULE_NAME = "Accessibility Properties";
    private static final String ID_NAME = "id";
    private static final String NONE_MAPPING = "<no mapping>";
    private static final String NONE_VALUE = "(none)";
    private static final String VIEW_STYLE_RULE_NAME = "<this_view>";
    private static final boolean sHasSupportNodeInfo = false;
    private final MethodInvoker mMethodInvoker;
    @GuardedBy("this")
    @Nullable
    private volatile List<ViewCSSProperty> mViewProperties;
    @Nullable
    private Pattern mWordBoundaryPattern;

    /* renamed from: com.facebook.stetho.inspector.elements.android.ViewDescriptor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Comparator<ViewCSSProperty> {
        public final /* synthetic */ ViewDescriptor this$0;

        public AnonymousClass1(ViewDescriptor viewDescriptor) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ViewCSSProperty viewCSSProperty, ViewCSSProperty viewCSSProperty2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(ViewCSSProperty viewCSSProperty, ViewCSSProperty viewCSSProperty2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class FieldBackedCSSProperty extends ViewCSSProperty {
        private final Field mField;
        public final /* synthetic */ ViewDescriptor this$0;

        public FieldBackedCSSProperty(ViewDescriptor viewDescriptor, Field field, @Nullable String str, ViewDebug.ExportedProperty exportedProperty) {
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewDescriptor.ViewCSSProperty
        public Object getValue(View view) throws InvocationTargetException, IllegalAccessException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class MethodBackedCSSProperty extends ViewCSSProperty {
        private final Method mMethod;
        public final /* synthetic */ ViewDescriptor this$0;

        public MethodBackedCSSProperty(ViewDescriptor viewDescriptor, Method method, @Nullable String str, ViewDebug.ExportedProperty exportedProperty) {
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewDescriptor.ViewCSSProperty
        public Object getValue(View view) throws InvocationTargetException, IllegalAccessException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class ViewCSSProperty {
        private final ViewDebug.ExportedProperty mAnnotation;
        private final String mCSSName;
        public final /* synthetic */ ViewDescriptor this$0;

        public ViewCSSProperty(ViewDescriptor viewDescriptor, @Nullable String str, ViewDebug.ExportedProperty exportedProperty) {
        }

        @Nullable
        public final ViewDebug.ExportedProperty getAnnotation() {
        }

        public final String getCSSName() {
        }

        public abstract Object getValue(View view) throws InvocationTargetException, IllegalAccessException;
    }

    public ViewDescriptor() {
    }

    private static boolean canFlagsBeMappedToString(@Nullable ViewDebug.ExportedProperty exportedProperty) {
    }

    private static boolean canIntBeMappedToString(@Nullable ViewDebug.ExportedProperty exportedProperty) {
    }

    private static String capitalize(String str) {
    }

    private String convertViewPropertyNameToCSSName(String str) {
    }

    @Nullable
    private static String getIdAttribute(View view) {
    }

    private void getIdStyle(View view, StyleAccumulator styleAccumulator) {
    }

    private void getStyleFromInteger(String str, Integer num, @Nullable ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
    }

    private void getStyleFromValue(View view, String str, Object obj, @Nullable ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
    }

    private void getStylesFromObject(View view, String str, Object obj, @Nullable ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
    }

    private List<ViewCSSProperty> getViewProperties() {
    }

    private Pattern getWordBoundaryPattern() {
    }

    private static String mapFlagsToStringUsingAnnotation(int i2, @Nullable ViewDebug.ExportedProperty exportedProperty) {
    }

    private static String mapIntToStringUsingAnnotation(int i2, @Nullable ViewDebug.ExportedProperty exportedProperty) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ Object getElementToHighlightAtPosition(View view, int i2, int i3, Rect rect) {
    }

    @Nullable
    /* renamed from: getViewAndBoundsForHighlighting  reason: avoid collision after fix types in other method */
    public View getViewAndBoundsForHighlighting2(View view, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ View getViewAndBoundsForHighlighting(View view, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetAttributes(View view, AttributeAccumulator attributeAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetComputedStyles(View view, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ String onGetNodeName(View view) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetStyleRuleNames(View view, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetStyles(View view, String str, StyleAccumulator styleAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onSetAttributesAsText(View view, String str) {
    }

    public ViewDescriptor(MethodInvoker methodInvoker) {
    }

    @Nullable
    /* renamed from: getElementToHighlightAtPosition  reason: avoid collision after fix types in other method */
    public Object getElementToHighlightAtPosition2(View view, int i2, int i3, Rect rect) {
    }

    /* renamed from: onGetAttributes  reason: avoid collision after fix types in other method */
    public void onGetAttributes2(View view, AttributeAccumulator attributeAccumulator) {
    }

    /* renamed from: onGetComputedStyles  reason: avoid collision after fix types in other method */
    public void onGetComputedStyles2(View view, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    /* renamed from: onGetNodeName  reason: avoid collision after fix types in other method */
    public String onGetNodeName2(View view) {
    }

    /* renamed from: onGetStyleRuleNames  reason: avoid collision after fix types in other method */
    public void onGetStyleRuleNames2(View view, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    /* renamed from: onGetStyles  reason: avoid collision after fix types in other method */
    public void onGetStyles2(View view, String str, StyleAccumulator styleAccumulator) {
    }

    /* renamed from: onSetAttributesAsText  reason: avoid collision after fix types in other method */
    public void onSetAttributesAsText2(View view, String str) {
    }
}
