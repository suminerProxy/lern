package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ProducerToDataSourceAdapter<T> extends AbstractProducerToDataSourceAdapter<T> {
    private ProducerToDataSourceAdapter(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener2 listener) {
        super(producer, settableProducerContext, listener);
    }

    public static <T> DataSource<T> create(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener2 listener) {
        return new ProducerToDataSourceAdapter(producer, settableProducerContext, listener);
    }
}
