package com.facebook.imagepipeline.systrace;

import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultFrescoSystrace implements FrescoSystrace.Systrace {
    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public void beginSection(String name) {
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public FrescoSystrace.ArgsBuilder beginSectionWithArgs(String name) {
        return FrescoSystrace.NO_OP_ARGS_BUILDER;
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public void endSection() {
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public boolean isTracing() {
        return false;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DefaultArgsBuilder implements FrescoSystrace.ArgsBuilder {
        private final StringBuilder mStringBuilder;

        public DefaultArgsBuilder(String name) {
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public FrescoSystrace.ArgsBuilder arg(String key, Object value) {
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public void flush() {
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public FrescoSystrace.ArgsBuilder arg(String key, int value) {
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public FrescoSystrace.ArgsBuilder arg(String key, long value) {
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public FrescoSystrace.ArgsBuilder arg(String key, double value) {
        }
    }
}
