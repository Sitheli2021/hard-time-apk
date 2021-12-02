package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.C0269v;
import com.adobe.air.wand.message.MessageManager;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.l */
class C0184l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0284y f1028a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AlertDialog f1029b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f1030c;

    /* renamed from: com.adcolony.sdk.l$a */
    class C0185a implements C0028a0 {
        C0185a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (!C0026a.m81d() || !(C0026a.m78b() instanceof Activity)) {
                new C0269v.C0270a().mo707a("Missing Activity reference, can't build AlertDialog.").mo709a(C0269v.f1300j);
            } else if (C0267t.m814d(yVar.mo736b(), "on_resume")) {
                C0284y unused = C0184l.this.f1028a = yVar;
            } else {
                C0184l.this.m487a(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l$b */
    class C0186b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0284y f1032a;

        C0186b(C0284y yVar) {
            this.f1032a = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0184l.this.f1029b = null;
            dialogInterface.dismiss();
            JSONObject b = C0267t.m805b();
            C0267t.m809b(b, "positive", true);
            boolean unused2 = C0184l.this.f1030c = false;
            this.f1032a.mo735a(b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.l$c */
    class C0187c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0284y f1034a;

        C0187c(C0284y yVar) {
            this.f1034a = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0184l.this.f1029b = null;
            dialogInterface.dismiss();
            JSONObject b = C0267t.m805b();
            C0267t.m809b(b, "positive", false);
            boolean unused2 = C0184l.this.f1030c = false;
            this.f1034a.mo735a(b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.l$d */
    class C0188d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C0284y f1036a;

        C0188d(C0284y yVar) {
            this.f1036a = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AlertDialog unused = C0184l.this.f1029b = null;
            boolean unused2 = C0184l.this.f1030c = false;
            JSONObject b = C0267t.m805b();
            C0267t.m809b(b, "positive", false);
            this.f1036a.mo735a(b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.l$e */
    class C0189e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AlertDialog.Builder f1038a;

        C0189e(AlertDialog.Builder builder) {
            this.f1038a = builder;
        }

        public void run() {
            boolean unused = C0184l.this.f1030c = true;
            AlertDialog unused2 = C0184l.this.f1029b = this.f1038a.show();
        }
    }

    C0184l() {
        C0026a.m76a("Alert.show", (C0028a0) new C0185a());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void m487a(C0284y yVar) {
        Context b = C0026a.m78b();
        if (b != null) {
            AlertDialog.Builder builder = Build.VERSION.SDK_INT >= 21 ? new AlertDialog.Builder(b, 16974374) : new AlertDialog.Builder(b, 16974126);
            JSONObject b2 = yVar.mo736b();
            String h = C0267t.m819h(b2, MessageManager.NAME_ERROR_MESSAGE);
            String h2 = C0267t.m819h(b2, "title");
            String h3 = C0267t.m819h(b2, "positive");
            String h4 = C0267t.m819h(b2, "negative");
            builder.setMessage(h);
            builder.setTitle(h2);
            builder.setPositiveButton(h3, new C0186b(yVar));
            if (!h4.equals("")) {
                builder.setNegativeButton(h4, new C0187c(yVar));
            }
            builder.setOnCancelListener(new C0188d(yVar));
            C0190l0.m510a((Runnable) new C0189e(builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AlertDialog mo567a() {
        return this.f1029b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo568a(AlertDialog alertDialog) {
        this.f1029b = alertDialog;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo569b() {
        return this.f1030c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo570c() {
        C0284y yVar = this.f1028a;
        if (yVar != null) {
            m487a(yVar);
            this.f1028a = null;
        }
    }
}
