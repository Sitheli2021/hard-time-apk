package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.r */
class C0262r extends ImageView {

    /* renamed from: a */
    private int f1273a;

    /* renamed from: b */
    private int f1274b;

    /* renamed from: c */
    private int f1275c;

    /* renamed from: d */
    private int f1276d;

    /* renamed from: e */
    private int f1277e;

    /* renamed from: f */
    private boolean f1278f;

    /* renamed from: g */
    private boolean f1279g;

    /* renamed from: h */
    private boolean f1280h;

    /* renamed from: i */
    private String f1281i;

    /* renamed from: j */
    private String f1282j;

    /* renamed from: k */
    private C0284y f1283k;

    /* renamed from: l */
    private C0032c f1284l;

    /* renamed from: com.adcolony.sdk.r$a */
    class C0263a implements C0028a0 {
        C0263a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0262r.this.m769a(yVar)) {
                C0262r.this.m775d(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$b */
    class C0264b implements C0028a0 {
        C0264b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0262r.this.m769a(yVar)) {
                C0262r.this.m771b(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$c */
    class C0265c implements C0028a0 {
        C0265c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0262r.this.m769a(yVar)) {
                C0262r.this.m773c(yVar);
            }
        }
    }

    private C0262r(Context context) {
        super(context);
    }

    C0262r(Context context, C0284y yVar, int i, C0032c cVar) {
        super(context);
        this.f1273a = i;
        this.f1283k = yVar;
        this.f1284l = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m769a(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        return C0267t.m817f(b, "id") == this.f1273a && C0267t.m817f(b, "container_id") == this.f1284l.mo299c() && C0267t.m819h(b, "ad_session_id").equals(this.f1284l.mo289a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m771b(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f1274b = C0267t.m817f(b, "x");
        this.f1275c = C0267t.m817f(b, "y");
        this.f1276d = C0267t.m817f(b, "width");
        this.f1277e = C0267t.m817f(b, "height");
        if (this.f1278f) {
            float n = (((float) this.f1277e) * C0026a.m80c().mo445h().mo533n()) / ((float) getDrawable().getIntrinsicHeight());
            this.f1277e = (int) (((float) getDrawable().getIntrinsicHeight()) * n);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * n);
            this.f1276d = intrinsicWidth;
            this.f1274b -= intrinsicWidth;
            this.f1275c -= this.f1277e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1274b, this.f1275c, 0, 0);
        layoutParams.width = this.f1276d;
        layoutParams.height = this.f1277e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m773c(C0284y yVar) {
        this.f1281i = C0267t.m819h(yVar.mo736b(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f1281i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m775d(C0284y yVar) {
        if (C0267t.m814d(yVar.mo736b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo696a() {
        JSONObject b = this.f1283k.mo736b();
        this.f1282j = C0267t.m819h(b, "ad_session_id");
        this.f1274b = C0267t.m817f(b, "x");
        this.f1275c = C0267t.m817f(b, "y");
        this.f1276d = C0267t.m817f(b, "width");
        this.f1277e = C0267t.m817f(b, "height");
        this.f1281i = C0267t.m819h(b, "filepath");
        this.f1278f = C0267t.m814d(b, "dpi");
        this.f1279g = C0267t.m814d(b, "invert_y");
        this.f1280h = C0267t.m814d(b, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f1281i)));
        if (this.f1278f) {
            float n = (((float) this.f1277e) * C0026a.m80c().mo445h().mo533n()) / ((float) getDrawable().getIntrinsicHeight());
            this.f1277e = (int) (((float) getDrawable().getIntrinsicHeight()) * n);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * n);
            this.f1276d = intrinsicWidth;
            this.f1274b -= intrinsicWidth;
            this.f1275c = this.f1279g ? this.f1275c + this.f1277e : this.f1275c - this.f1277e;
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = this.f1280h ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(this.f1276d, this.f1277e);
        layoutParams.setMargins(this.f1274b, this.f1275c, 0, 0);
        layoutParams.gravity = 0;
        this.f1284l.addView(this, layoutParams);
        this.f1284l.mo313i().add(C0026a.m72a("ImageView.set_visible", (C0028a0) new C0263a(), true));
        this.f1284l.mo313i().add(C0026a.m72a("ImageView.set_bounds", (C0028a0) new C0264b(), true));
        this.f1284l.mo313i().add(C0026a.m72a("ImageView.set_image", (C0028a0) new C0265c(), true));
        this.f1284l.mo315j().add("ImageView.set_visible");
        this.f1284l.mo315j().add("ImageView.set_bounds");
        this.f1284l.mo315j().add("ImageView.set_image");
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
        C0267t.m808b(b2, "view_id", this.f1273a);
        C0267t.m798a(b2, "ad_session_id", this.f1282j);
        C0267t.m808b(b2, "container_x", this.f1274b + x);
        C0267t.m808b(b2, "container_y", this.f1275c + y);
        C0267t.m808b(b2, "view_x", x);
        C0267t.m808b(b2, "view_y", y);
        C0267t.m808b(b2, "id", this.f1284l.getId());
        switch (action) {
            case 0:
                new C0284y("AdContainer.on_touch_began", this.f1284l.mo317k(), b2).mo740d();
                break;
            case 1:
                if (!this.f1284l.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1282j));
                }
                if (x > 0 && x < this.f1276d && y > 0 && y < this.f1277e) {
                    new C0284y("AdContainer.on_touch_ended", this.f1284l.mo317k(), b2).mo740d();
                    break;
                } else {
                    new C0284y("AdContainer.on_touch_cancelled", this.f1284l.mo317k(), b2).mo740d();
                    break;
                }
                break;
            case 2:
                new C0284y("AdContainer.on_touch_moved", this.f1284l.mo317k(), b2).mo740d();
                break;
            case 3:
                new C0284y("AdContainer.on_touch_cancelled", this.f1284l.mo317k(), b2).mo740d();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action2)) + this.f1274b);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action2)) + this.f1275c);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action2));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action2));
                new C0284y("AdContainer.on_touch_began", this.f1284l.mo317k(), b2).mo740d();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent.getX(action3);
                int y2 = (int) motionEvent.getY(action3);
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action3)) + this.f1274b);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action3)) + this.f1275c);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action3));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action3));
                if (!this.f1284l.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1282j));
                }
                if (x2 > 0 && x2 < this.f1276d && y2 > 0 && y2 < this.f1277e) {
                    new C0284y("AdContainer.on_touch_ended", this.f1284l.mo317k(), b2).mo740d();
                    break;
                } else {
                    new C0284y("AdContainer.on_touch_cancelled", this.f1284l.mo317k(), b2).mo740d();
                    break;
                }
                break;
        }
        return true;
    }
}
