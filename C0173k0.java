package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.k0 */
class C0173k0 extends Button {

    /* renamed from: A */
    private C0032c f990A;

    /* renamed from: B */
    private C0284y f991B;

    /* renamed from: a */
    private final int f992a = 0;

    /* renamed from: b */
    private final int f993b = 1;

    /* renamed from: c */
    private final int f994c = 2;

    /* renamed from: d */
    private final int f995d = 3;

    /* renamed from: e */
    private final int f996e = 1;

    /* renamed from: f */
    private final int f997f = 2;

    /* renamed from: g */
    private final int f998g = 3;

    /* renamed from: h */
    private final int f999h = 0;

    /* renamed from: i */
    private final int f1000i = 1;

    /* renamed from: j */
    private final int f1001j = 2;

    /* renamed from: k */
    private final int f1002k = 1;

    /* renamed from: l */
    private final int f1003l = 2;

    /* renamed from: m */
    private int f1004m;

    /* renamed from: n */
    private int f1005n;

    /* renamed from: o */
    private int f1006o;

    /* renamed from: p */
    private int f1007p;

    /* renamed from: q */
    private int f1008q;

    /* renamed from: r */
    private int f1009r;

    /* renamed from: s */
    private int f1010s;

    /* renamed from: t */
    private int f1011t;

    /* renamed from: u */
    private int f1012u;

    /* renamed from: v */
    private int f1013v;

    /* renamed from: w */
    private String f1014w;

    /* renamed from: x */
    private String f1015x;

    /* renamed from: y */
    private String f1016y;

    /* renamed from: z */
    private String f1017z;

    /* renamed from: com.adcolony.sdk.k0$a */
    class C0174a implements C0028a0 {
        C0174a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo555a(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$b */
    class C0175b implements C0028a0 {
        C0175b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo565k(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$c */
    class C0176c implements C0028a0 {
        C0176c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo559e(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$d */
    class C0177d implements C0028a0 {
        C0177d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo560f(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$e */
    class C0178e implements C0028a0 {
        C0178e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo558d(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$f */
    class C0179f implements C0028a0 {
        C0179f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo564j(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$g */
    class C0180g implements C0028a0 {
        C0180g() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo561g(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$h */
    class C0181h implements C0028a0 {
        C0181h() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo562h(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$i */
    class C0182i implements C0028a0 {
        C0182i() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo556b(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k0$j */
    class C0183j implements C0028a0 {
        C0183j() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0173k0.this.mo557c(yVar)) {
                C0173k0.this.mo563i(yVar);
            }
        }
    }

    private C0173k0(Context context) {
        super(context);
    }

    C0173k0(Context context, int i, C0284y yVar, int i2, C0032c cVar) {
        super(context, (AttributeSet) null, i);
        this.f1004m = i2;
        this.f991B = yVar;
        this.f990A = cVar;
    }

    C0173k0(Context context, C0284y yVar, int i, C0032c cVar) {
        super(context);
        this.f1004m = i;
        this.f991B = yVar;
        this.f990A = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo553a(boolean z, int i) {
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
    public void mo554a() {
        int i;
        int i2;
        JSONObject b = this.f991B.mo736b();
        this.f1017z = C0267t.m819h(b, "ad_session_id");
        this.f1005n = C0267t.m817f(b, "x");
        this.f1006o = C0267t.m817f(b, "y");
        this.f1007p = C0267t.m817f(b, "width");
        this.f1008q = C0267t.m817f(b, "height");
        this.f1010s = C0267t.m817f(b, "font_family");
        this.f1009r = C0267t.m817f(b, "font_style");
        this.f1011t = C0267t.m817f(b, "font_size");
        this.f1014w = C0267t.m819h(b, "background_color");
        this.f1015x = C0267t.m819h(b, "font_color");
        this.f1016y = C0267t.m819h(b, "text");
        this.f1012u = C0267t.m817f(b, "align_x");
        this.f1013v = C0267t.m817f(b, "align_y");
        C0122i c = C0026a.m80c();
        if (this.f1016y.equals("")) {
            this.f1016y = "Learn More";
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = C0267t.m814d(b, "wrap_content") ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(this.f1007p, this.f1008q);
        layoutParams.gravity = 0;
        setText(this.f1016y);
        setTextSize((float) this.f1011t);
        if (C0267t.m814d(b, "overlay")) {
            this.f1005n = 0;
            this.f1006o = 0;
            i2 = (int) (c.mo445h().mo533n() * 6.0f);
            i = (int) (c.mo445h().mo533n() * 6.0f);
            int n = (int) (c.mo445h().mo533n() * 4.0f);
            setPadding(n, n, n, n);
            layoutParams.gravity = 8388693;
        } else {
            i2 = 0;
            i = 0;
        }
        layoutParams.setMargins(this.f1005n, this.f1006o, i2, i);
        this.f990A.addView(this, layoutParams);
        switch (this.f1010s) {
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
        switch (this.f1009r) {
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
        setGravity(mo553a(true, this.f1012u) | mo553a(false, this.f1013v));
        if (!this.f1014w.equals("")) {
            setBackgroundColor(C0190l0.m531f(this.f1014w));
        }
        if (!this.f1015x.equals("")) {
            setTextColor(C0190l0.m531f(this.f1015x));
        }
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_visible", (C0028a0) new C0175b(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_bounds", (C0028a0) new C0176c(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_font_color", (C0028a0) new C0177d(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_background_color", (C0028a0) new C0178e(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_typeface", (C0028a0) new C0179f(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_font_size", (C0028a0) new C0180g(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_font_style", (C0028a0) new C0181h(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.get_text", (C0028a0) new C0182i(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.set_text", (C0028a0) new C0183j(), true));
        this.f990A.mo313i().add(C0026a.m72a("TextView.align", (C0028a0) new C0174a(), true));
        this.f990A.mo315j().add("TextView.set_visible");
        this.f990A.mo315j().add("TextView.set_bounds");
        this.f990A.mo315j().add("TextView.set_font_color");
        this.f990A.mo315j().add("TextView.set_background_color");
        this.f990A.mo315j().add("TextView.set_typeface");
        this.f990A.mo315j().add("TextView.set_font_size");
        this.f990A.mo315j().add("TextView.set_font_style");
        this.f990A.mo315j().add("TextView.get_text");
        this.f990A.mo315j().add("TextView.set_text");
        this.f990A.mo315j().add("TextView.align");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo555a(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f1012u = C0267t.m817f(b, "x");
        this.f1013v = C0267t.m817f(b, "y");
        setGravity(mo553a(true, this.f1012u) | mo553a(false, this.f1013v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo556b(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "text", getText().toString());
        yVar.mo735a(b).mo740d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo557c(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        return C0267t.m817f(b, "id") == this.f1004m && C0267t.m817f(b, "container_id") == this.f990A.mo299c() && C0267t.m819h(b, "ad_session_id").equals(this.f990A.mo289a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo558d(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "background_color");
        this.f1014w = h;
        setBackgroundColor(C0190l0.m531f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo559e(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f1005n = C0267t.m817f(b, "x");
        this.f1006o = C0267t.m817f(b, "y");
        this.f1007p = C0267t.m817f(b, "width");
        this.f1008q = C0267t.m817f(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1005n, this.f1006o, 0, 0);
        layoutParams.width = this.f1007p;
        layoutParams.height = this.f1008q;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo560f(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "font_color");
        this.f1015x = h;
        setTextColor(C0190l0.m531f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo561g(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "font_size");
        this.f1011t = f;
        setTextSize((float) f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo562h(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "font_style");
        this.f1009r = f;
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
    public void mo563i(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "text");
        this.f1016y = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo564j(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "font_family");
        this.f1010s = f;
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
    public void mo565k(C0284y yVar) {
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
        C0267t.m808b(b2, "view_id", this.f1004m);
        C0267t.m798a(b2, "ad_session_id", this.f1017z);
        C0267t.m808b(b2, "container_x", this.f1005n + x);
        C0267t.m808b(b2, "container_y", this.f1006o + y);
        C0267t.m808b(b2, "view_x", x);
        C0267t.m808b(b2, "view_y", y);
        C0267t.m808b(b2, "id", this.f990A.getId());
        switch (action) {
            case 0:
                new C0284y("AdContainer.on_touch_began", this.f990A.mo317k(), b2).mo740d();
                break;
            case 1:
                if (!this.f990A.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1017z));
                }
                if (x > 0 && x < getWidth() && y > 0 && y < getHeight()) {
                    new C0284y("AdContainer.on_touch_ended", this.f990A.mo317k(), b2).mo740d();
                    break;
                } else {
                    new C0284y("AdContainer.on_touch_cancelled", this.f990A.mo317k(), b2).mo740d();
                    break;
                }
                break;
            case 2:
                new C0284y("AdContainer.on_touch_moved", this.f990A.mo317k(), b2).mo740d();
                break;
            case 3:
                new C0284y("AdContainer.on_touch_cancelled", this.f990A.mo317k(), b2).mo740d();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action2)) + this.f1005n);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action2)) + this.f1006o);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action2));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action2));
                new C0284y("AdContainer.on_touch_began", this.f990A.mo317k(), b2).mo740d();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent.getX(action3);
                int y2 = (int) motionEvent.getY(action3);
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action3)) + this.f1005n);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action3)) + this.f1006o);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action3));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action3));
                if (!this.f990A.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1017z));
                }
                if (x2 > 0 && x2 < getWidth() && y2 > 0 && y2 < getHeight()) {
                    new C0284y("AdContainer.on_touch_ended", this.f990A.mo317k(), b2).mo740d();
                    break;
                } else {
                    new C0284y("AdContainer.on_touch_cancelled", this.f990A.mo317k(), b2).mo740d();
                    break;
                }
                break;
        }
        return true;
    }
}
