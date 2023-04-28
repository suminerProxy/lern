package com.facebook.stetho.inspector.elements.android;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TextViewDescriptor extends AbstractChainedDescriptor<TextView> {
    private static final String TEXT_ATTRIBUTE_NAME = "text";
    private final Map<TextView, ElementContext> mElementToContextMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ElementContext implements TextWatcher {
        private TextView mElement;
        public final /* synthetic */ TextViewDescriptor this$0;

        private ElementContext(TextViewDescriptor textViewDescriptor) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void hook(TextView textView) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void unhook() {
        }

        public /* synthetic */ ElementContext(TextViewDescriptor textViewDescriptor, AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ Descriptor.Host access$100(TextViewDescriptor textViewDescriptor) {
    }

    public static /* synthetic */ Descriptor.Host access$200(TextViewDescriptor textViewDescriptor) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetAttributes(TextView textView, AttributeAccumulator attributeAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onHook(TextView textView) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onUnhook(TextView textView) {
    }

    /* renamed from: onGetAttributes  reason: avoid collision after fix types in other method */
    public void onGetAttributes2(TextView textView, AttributeAccumulator attributeAccumulator) {
    }

    /* renamed from: onHook  reason: avoid collision after fix types in other method */
    public void onHook2(TextView textView) {
    }

    /* renamed from: onUnhook  reason: avoid collision after fix types in other method */
    public void onUnhook2(TextView textView) {
    }
}
