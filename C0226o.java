package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.o */
class C0226o extends EditText {

    /* renamed from: A */
    private C0032c f1189A;

    /* renamed from: B */
    private C0284y f1190B;

    /* renamed from: a */
    private final int f1191a = 0;

    /* renamed from: b */
    private final int f1192b = 1;

    /* renamed from: c */
    private final int f1193c = 2;

    /* renamed from: d */
    private final int f1194d = 3;

    /* renamed from: e */
    private final int f1195e = 1;

    /* renamed from: f */
    private final int f1196f = 2;

    /* renamed from: g */
    private final int f1197g = 3;

    /* renamed from: h */
    private final int f1198h = 0;

    /* renamed from: i */
    private final int f1199i = 1;

    /* renamed from: j */
    private final int f1200j = 2;

    /* renamed from: k */
    private final int f1201k = 1;

    /* renamed from: l */
    private final int f1202l = 2;

    /* renamed from: m */
    private int f1203m;

    /* renamed from: n */
    private int f1204n;

    /* renamed from: o */
    private int f1205o;

    /* renamed from: p */
    private int f1206p;

    /* renamed from: q */
    private int f1207q;

    /* renamed from: r */
    private int f1208r;

    /* renamed from: s */
    private int f1209s;

    /* renamed from: t */
    private int f1210t;

    /* renamed from: u */
    private int f1211u;

    /* renamed from: v */
    private int f1212v;

    /* renamed from: w */
    private String f1213w;

    /* renamed from: x */
    private String f1214x;

    /* renamed from: y */
    private String f1215y;

    /* renamed from: z */
    private String f1216z;

    /* renamed from: com.adcolony.sdk.o$a */
    class C0227a implements C0028a0 {
        C0227a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo667a(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$b */
    class C0228b implements C0028a0 {
        C0228b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo677k(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$c */
    class C0229c implements C0028a0 {
        C0229c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo671e(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$d */
    class C0230d implements C0028a0 {
        C0230d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo672f(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$e */
    class C0231e implements C0028a0 {
        C0231e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo670d(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$f */
    class C0232f implements C0028a0 {
        C0232f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo676j(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$g */
    class C0233g implements C0028a0 {
        C0233g() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo673g(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$h */
    class C0234h implements C0028a0 {
        C0234h() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo674h(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$i */
    class C0235i implements C0028a0 {
        C0235i() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo668b(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$j */
    class C0236j implements C0028a0 {
        C0236j() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0226o.this.mo669c(yVar)) {
                C0226o.this.mo675i(yVar);
            }
        }
    }

    private C0226o(Context context) {
        super(context);
    }

    C0226o(Context context, C0284y yVar, int i, C0032c cVar) {
        super(context);
        this.f1203m = i;
        this.f1190B = yVar;
        this.f1189A = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo665a(boolean z, int i) {
        if (i == 0) {
            return z ? 1 : 16;
        }
        if (i == 1) {
            return z ? 8388611 : 48;
        }
        if (i != 2) {
            return 17;
        }
        return z ? 8388613 : 80;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo666a() {
        JSONObject b = this.f1190B.mo736b();
        this.f1213w = C0267t.m819h(b, "ad_session_id");
        this.f1204n = C0267t.m817f(b, "x");
        this.f1205o = C0267t.m817f(b, "y");
        this.f1206p = C0267t.m817f(b, "width");
        this.f1207q = C0267t.m817f(b, "height");
        this.f1209s = C0267t.m817f(b, "font_family");
        this.f1208r = C0267t.m817f(b, "font_style");
        this.f1210t = C0267t.m817f(b, "font_size");
        this.f1214x = C0267t.m819h(b, "background_color");
        this.f1215y = C0267t.m819h(b, "font_color");
        this.f1216z = C0267t.m819h(b, "text");
        this.f1211u = C0267t.m817f(b, "align_x");
        this.f1212v = C0267t.m817f(b, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f1206p, this.f1207q);
        layoutParams.setMargins(this.f1204n, this.f1205o, 0, 0);
        layoutParams.gravity = 0;
        this.f1189A.addView(this, layoutParams);
        switch (this.f1209s) {
            case 0:
                setTypeface(Typeface.DEFAULT);
                break;
            case 1:
                setTypeface(Typeface.SERIF);
                break;
            case 2:
                setTypeface(Typeface.SANS_SERIF);
                break;
            case 3:
                setTypeface(Typeface.MONOSPACE);
                break;
        }
        switch (this.f1208r) {
            case 0:
                setTypeface(getTypeface(), 0);
                break;
            case 1:
                setTypeface(getTypeface(), 1);
                break;
            case 2:
                setTypeface(getTypeface(), 2);
                break;
            case 3:
                setTypeface(getTypeface(), 3);
                break;
        }
        setText(this.f1216z);
        setTextSize((float) this.f1210t);
        setGravity(mo665a(true, this.f1211u) | mo665a(false, this.f1212v));
        if (!this.f1214x.equals("")) {
            setBackgroundColor(C0190l0.m531f(this.f1214x));
        }
        if (!this.f1215y.equals("")) {
            setTextColor(C0190l0.m531f(this.f1215y));
        }
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_visible", (C0028a0) new C0228b(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_bounds", (C0028a0) new C0229c(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_font_color", (C0028a0) new C0230d(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_background_color", (C0028a0) new C0231e(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_typeface", (C0028a0) new C0232f(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_font_size", (C0028a0) new C0233g(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_font_style", (C0028a0) new C0234h(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.get_text", (C0028a0) new C0235i(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.set_text", (C0028a0) new C0236j(), true));
        this.f1189A.mo313i().add(C0026a.m72a("TextView.align", (C0028a0) new C0227a(), true));
        this.f1189A.mo315j().add("TextView.set_visible");
        this.f1189A.mo315j().add("TextView.set_bounds");
        this.f1189A.mo315j().add("TextView.set_font_color");
        this.f1189A.mo315j().add("TextView.set_background_color");
        this.f1189A.mo315j().add("TextView.set_typeface");
        this.f1189A.mo315j().add("TextView.set_font_size");
        this.f1189A.mo315j().add("TextView.set_font_style");
        this.f1189A.mo315j().add("TextView.get_text");
        this.f1189A.mo315j().add("TextView.set_text");
        this.f1189A.mo315j().add("TextView.align");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo667a(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f1211u = C0267t.m817f(b, "x");
        this.f1212v = C0267t.m817f(b, "y");
        setGravity(mo665a(true, this.f1211u) | mo665a(false, this.f1212v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo668b(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "text", getText().toString());
        yVar.mo735a(b).mo740d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo669c(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        return C0267t.m817f(b, "id") == this.f1203m && C0267t.m817f(b, "container_id") == this.f1189A.mo299c() && C0267t.m819h(b, "ad_session_id").equals(this.f1189A.mo289a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo670d(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "background_color");
        this.f1214x = h;
        setBackgroundColor(C0190l0.m531f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo671e(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f1204n = C0267t.m817f(b, "x");
        this.f1205o = C0267t.m817f(b, "y");
        this.f1206p = C0267t.m817f(b, "width");
        this.f1207q = C0267t.m817f(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1204n, this.f1205o, 0, 0);
        layoutParams.width = this.f1206p;
        layoutParams.height = this.f1207q;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo672f(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "font_color");
        this.f1215y = h;
        setTextColor(C0190l0.m531f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo673g(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "font_size");
        this.f1210t = f;
        setTextSize((float) f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo674h(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "font_style");
        this.f1208r = f;
        switch (f) {
            case 0:
                setTypeface(getTypeface(), 0);
                return;
            case 1:
                setTypeface(getTypeface(), 1);
                return;
            case 2:
                setTypeface(getTypeface(), 2);
                return;
            case 3:
                setTypeface(getTypeface(), 3);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo675i(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "text");
        this.f1216z = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo676j(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "font_family");
        this.f1209s = f;
        switch (f) {
            case 0:
                setTypeface(Typeface.DEFAULT);
                return;
            case 1:
                setTypeface(Typeface.SERIF);
                return;
            case 2:
                setTypeface(Typeface.SANS_SERIF);
                return;
            case 3:
                setTypeface(Typeface.MONOSPACE);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo677k(C0284y yVar) {
        if (C0267t.m814d(yVar.mo736b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0122i c = C0026a.m80c();
        C0046d b = c.mo432b();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject b2 = C0267t.m805b();
        C0267t.m808b(b2, "view_id", this.f1203m);
        C0267t.m798a(b2, "ad_session_id", this.f1213w);
        C0267t.m808b(b2, "container_x", this.f1204n + x);
        C0267t.m808b(b2, "container_y", this.f1205o + y);
        C0267t.m808b(b2, "view_x", x);
        C0267t.m808b(b2, "view_y", y);
        C0267t.m808b(b2, "id", this.f1189A.mo299c());
        switch (action) {
            case 0:
                new C0284y("AdContainer.on_touch_began", this.f1189A.mo317k(), b2).mo740d();
                break;
            case 1:
                if (!this.f1189A.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1213w));
                }
                new C0284y("AdContainer.on_touch_ended", this.f1189A.mo317k(), b2).mo740d();
                break;
            case 2:
                new C0284y("AdContainer.on_touch_moved", this.f1189A.mo317k(), b2).mo740d();
                break;
            case 3:
                new C0284y("AdContainer.on_touch_cancelled", this.f1189A.mo317k(), b2).mo740d();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action2)) + this.f1204n);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action2)) + this.f1205o);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action2));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action2));
                new C0284y("AdContainer.on_touch_began", this.f1189A.mo317k(), b2).mo740d();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action3)) + this.f1204n);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action3)) + this.f1205o);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action3));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action3));
                if (!this.f1189A.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1213w));
                }
                new C0284y("AdContainer.on_touch_ended", this.f1189A.mo317k(), b2).mo740d();
                break;
        }
        return true;
    }
}
