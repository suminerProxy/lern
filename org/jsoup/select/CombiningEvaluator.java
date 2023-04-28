package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;
import org.jsoup.nodes.Element;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class CombiningEvaluator extends Evaluator {
    public final ArrayList<Evaluator> evaluators;
    public int num;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class And extends CombiningEvaluator {
        public And(Collection<Evaluator> collection) {
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
        }

        public String toString() {
        }

        public And(Evaluator... evaluatorArr) {
        }
    }

    public CombiningEvaluator() {
    }

    public void replaceRightMostEvaluator(Evaluator evaluator) {
    }

    public Evaluator rightMostEvaluator() {
    }

    public void updateNumEvaluators() {
    }

    public CombiningEvaluator(Collection<Evaluator> collection) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Or extends CombiningEvaluator {
        public Or(Collection<Evaluator> collection) {
        }

        public void add(Evaluator evaluator) {
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
        }

        public String toString() {
        }

        public Or(Evaluator... evaluatorArr) {
        }

        public Or() {
        }
    }
}
