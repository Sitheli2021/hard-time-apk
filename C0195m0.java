package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.adcolony.sdk.C0269v;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

@TargetApi(14)
/* renamed from: com.adcolony.sdk.m0 */
class C0195m0 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f1066A;

    /* renamed from: B */
    private boolean f1067B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f1068C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f1069D;

    /* renamed from: E */
    private boolean f1070E;

    /* renamed from: F */
    private String f1071F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f1072G;

    /* renamed from: H */
    private FileInputStream f1073H;

    /* renamed from: I */
    private C0284y f1074I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C0032c f1075J;

    /* renamed from: K */
    private Surface f1076K;

    /* renamed from: L */
    private SurfaceTexture f1077L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public RectF f1078M = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C0205j f1079N;

    /* renamed from: O */
    private ProgressBar f1080O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public MediaPlayer f1081P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public JSONObject f1082Q = C0267t.m805b();

    /* renamed from: R */
    private ExecutorService f1083R = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C0284y f1084S;

    /* renamed from: a */
    private float f1085a;

    /* renamed from: b */
    private float f1086b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f1087c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f1088d;

    /* renamed from: e */
    private float f1089e;

    /* renamed from: f */
    private float f1090f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1091g;

    /* renamed from: h */
    private boolean f1092h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Paint f1093i = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Paint f1094j = new Paint(1);

    /* renamed from: k */
    private int f1095k;

    /* renamed from: l */
    private int f1096l;

    /* renamed from: m */
    private int f1097m;

    /* renamed from: n */
    private int f1098n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f1099o;

    /* renamed from: p */
    private int f1100p;

    /* renamed from: q */
    private int f1101q;

    /* renamed from: r */
    private int f1102r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public double f1103s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public double f1104t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f1105u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f1106v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f1107w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f1108x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f1109y;

    /* renamed from: z */
    private boolean f1110z;

    /* renamed from: com.adcolony.sdk.m0$a */
    class C0196a implements C0028a0 {
        C0196a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0195m0.this.m550a(yVar)) {
                C0195m0.this.mo590i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$b */
    class C0197b implements C0028a0 {
        C0197b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0195m0.this.m550a(yVar)) {
                C0195m0.this.m558c(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$c */
    class C0198c implements C0028a0 {
        C0198c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0195m0.this.m550a(yVar)) {
                C0195m0.this.m560d(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$d */
    class C0199d implements C0028a0 {
        C0199d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0195m0.this.m550a(yVar)) {
                C0195m0.this.mo589h();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$e */
    class C0200e implements C0028a0 {
        C0200e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0195m0.this.m550a(yVar)) {
                boolean unused = C0195m0.this.m555b(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$f */
    class C0201f implements C0028a0 {
        C0201f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0195m0.this.m550a(yVar)) {
                boolean unused = C0195m0.this.m565e(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$g */
    class C0202g implements Runnable {
        C0202g() {
        }

        public void run() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (C0195m0.this.f1084S != null) {
                JSONObject b = C0267t.m805b();
                C0267t.m808b(b, "id", C0195m0.this.f1099o);
                C0267t.m798a(b, "ad_session_id", C0195m0.this.f1072G);
                C0267t.m809b(b, "success", true);
                C0195m0.this.f1084S.mo735a(b).mo740d();
                C0284y unused = C0195m0.this.f1084S = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$h */
    class C0203h implements Runnable {
        C0203h() {
        }

        public void run() {
            long unused = C0195m0.this.f1105u = 0;
            while (!C0195m0.this.f1106v && !C0195m0.this.f1109y && C0026a.m81d()) {
                Context b = C0026a.m78b();
                if (!C0195m0.this.f1106v && !C0195m0.this.f1066A && b != null && (b instanceof Activity)) {
                    if (C0195m0.this.f1081P.isPlaying()) {
                        if (C0195m0.this.f1105u == 0 && C0026a.f112d) {
                            long unused2 = C0195m0.this.f1105u = System.currentTimeMillis();
                        }
                        boolean unused3 = C0195m0.this.f1108x = true;
                        C0195m0 m0Var = C0195m0.this;
                        double currentPosition = (double) m0Var.f1081P.getCurrentPosition();
                        Double.isNaN(currentPosition);
                        double unused4 = m0Var.f1103s = currentPosition / 1000.0d;
                        C0195m0 m0Var2 = C0195m0.this;
                        double duration = (double) m0Var2.f1081P.getDuration();
                        Double.isNaN(duration);
                        double unused5 = m0Var2.f1104t = duration / 1000.0d;
                        if (System.currentTimeMillis() - C0195m0.this.f1105u > 1000 && !C0195m0.this.f1069D && C0026a.f112d) {
                            if (C0195m0.this.f1103s == 0.0d) {
                                new C0269v.C0270a().mo707a("getCurrentPosition() not working, firing ").mo707a("AdSession.on_error").mo709a(C0269v.f1300j);
                                C0195m0.this.m568g();
                            } else {
                                boolean unused6 = C0195m0.this.f1069D = true;
                            }
                        }
                        if (C0195m0.this.f1068C) {
                            C0195m0.this.mo587e();
                        }
                    }
                    if (C0195m0.this.f1108x && !C0195m0.this.f1106v && !C0195m0.this.f1109y) {
                        C0267t.m808b(C0195m0.this.f1082Q, "id", C0195m0.this.f1099o);
                        C0267t.m808b(C0195m0.this.f1082Q, "container_id", C0195m0.this.f1075J.mo299c());
                        C0267t.m798a(C0195m0.this.f1082Q, "ad_session_id", C0195m0.this.f1072G);
                        C0267t.m796a(C0195m0.this.f1082Q, "elapsed", C0195m0.this.f1103s);
                        C0267t.m796a(C0195m0.this.f1082Q, "duration", C0195m0.this.f1104t);
                        new C0284y("VideoView.on_progress", C0195m0.this.f1075J.mo317k(), C0195m0.this.f1082Q).mo740d();
                    }
                    if (C0195m0.this.f1107w || ((Activity) b).isFinishing()) {
                        boolean unused7 = C0195m0.this.f1107w = false;
                        C0195m0.this.mo591j();
                        return;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException unused8) {
                        C0195m0.this.m568g();
                        new C0269v.C0270a().mo707a("InterruptedException in ADCVideoView's update thread.").mo709a(C0269v.f1299i);
                    }
                } else {
                    return;
                }
            }
            if (C0195m0.this.f1107w) {
                C0195m0.this.mo591j();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.m0$i */
    class C0204i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f1119a;

        C0204i(Context context) {
            this.f1119a = context;
        }

        public void run() {
            C0205j unused = C0195m0.this.f1079N = new C0205j(this.f1119a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C0195m0.this.f1087c * 4.0f), (int) (C0195m0.this.f1087c * 4.0f));
            layoutParams.setMargins(0, C0195m0.this.f1075J.mo295b() - ((int) (C0195m0.this.f1087c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            C0195m0.this.f1075J.addView(C0195m0.this.f1079N, layoutParams);
        }
    }

    /* renamed from: com.adcolony.sdk.m0$j */
    private class C0205j extends View {
        C0205j(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                Class<?> cls = getClass();
                cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
            } catch (Exception unused) {
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(C0195m0.this.f1078M, 270.0f, C0195m0.this.f1088d, false, C0195m0.this.f1093i);
            float centerX = C0195m0.this.f1078M.centerX();
            double centerY = (double) C0195m0.this.f1078M.centerY();
            double d = (double) C0195m0.this.f1094j.getFontMetrics().bottom;
            Double.isNaN(d);
            Double.isNaN(centerY);
            canvas.drawText("" + C0195m0.this.f1091g, centerX, (float) (centerY + (d * 1.35d)), C0195m0.this.f1094j);
            invalidate();
        }
    }

    private C0195m0(Context context) {
        super(context);
    }

    C0195m0(Context context, C0284y yVar, int i, C0032c cVar) {
        super(context);
        this.f1075J = cVar;
        this.f1074I = yVar;
        this.f1099o = i;
        setSurfaceTextureListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m550a(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        return C0267t.m817f(b, "id") == this.f1099o && C0267t.m817f(b, "container_id") == this.f1075J.mo299c() && C0267t.m819h(b, "ad_session_id").equals(this.f1075J.mo289a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m555b(C0284y yVar) {
        if (!this.f1110z) {
            return false;
        }
        if (this.f1106v) {
            this.f1106v = false;
        }
        this.f1084S = yVar;
        int f = C0267t.m817f(yVar.mo736b(), "time");
        int duration = this.f1081P.getDuration() / 1000;
        this.f1081P.setOnSeekCompleteListener(this);
        this.f1081P.seekTo(f * 1000);
        if (duration == f) {
            this.f1106v = true;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m558c(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f1095k = C0267t.m817f(b, "x");
        this.f1096l = C0267t.m817f(b, "y");
        this.f1097m = C0267t.m817f(b, "width");
        this.f1098n = C0267t.m817f(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1095k, this.f1096l, 0, 0);
        layoutParams.width = this.f1097m;
        layoutParams.height = this.f1098n;
        setLayoutParams(layoutParams);
        if (this.f1068C && this.f1079N != null) {
            int i = (int) (this.f1087c * 4.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.setMargins(0, this.f1075J.mo295b() - ((int) (this.f1087c * 4.0f)), 0, 0);
            layoutParams2.gravity = 0;
            this.f1079N.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m560d(C0284y yVar) {
        C0205j jVar;
        C0205j jVar2;
        if (C0267t.m814d(yVar.mo736b(), "visible")) {
            setVisibility(0);
            if (this.f1068C && (jVar2 = this.f1079N) != null) {
                jVar2.setVisibility(0);
                return;
            }
            return;
        }
        setVisibility(4);
        if (this.f1068C && (jVar = this.f1079N) != null) {
            jVar.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m565e(C0284y yVar) {
        boolean z = false;
        if (!this.f1110z) {
            return false;
        }
        float e = (float) C0267t.m815e(yVar.mo736b(), "volume");
        AdColonyInterstitial d = C0026a.m80c().mo438d();
        if (d != null) {
            if (((double) e) <= 0.0d) {
                z = true;
            }
            d.mo218b(z);
        }
        this.f1081P.setVolume(e, e);
        JSONObject b = C0267t.m805b();
        C0267t.m809b(b, "success", true);
        yVar.mo735a(b).mo740d();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m568g() {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "id", this.f1072G);
        new C0284y("AdSession.on_error", this.f1075J.mo317k(), b).mo740d();
        this.f1106v = true;
    }

    /* renamed from: l */
    private void m574l() {
        double d = (double) this.f1097m;
        double d2 = (double) this.f1100p;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) this.f1098n;
        double d5 = (double) this.f1101q;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double min = Math.min(d3, d4 / d5);
        double d6 = (double) this.f1100p;
        Double.isNaN(d6);
        int i = (int) (d6 * min);
        double d7 = (double) this.f1101q;
        Double.isNaN(d7);
        int i2 = (int) (d7 * min);
        new C0269v.C0270a().mo707a("setMeasuredDimension to ").mo705a(i).mo707a(" by ").mo705a(i2).mo709a(C0269v.f1296f);
        setMeasuredDimension(i, i2);
        if (this.f1067B) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: m */
    private void m577m() {
        try {
            this.f1083R.submit(new C0203h());
        } catch (RejectedExecutionException unused) {
            m568g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo583a() {
        if (this.f1077L != null) {
            this.f1066A = true;
        }
        this.f1083R.shutdown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public MediaPlayer mo584b() {
        return this.f1081P;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo585c() {
        return this.f1081P != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo586d() {
        Context b;
        JSONObject b2 = this.f1074I.mo736b();
        this.f1072G = C0267t.m819h(b2, "ad_session_id");
        this.f1095k = C0267t.m817f(b2, "x");
        this.f1096l = C0267t.m817f(b2, "y");
        this.f1097m = C0267t.m817f(b2, "width");
        this.f1098n = C0267t.m817f(b2, "height");
        this.f1068C = C0267t.m814d(b2, "enable_timer");
        this.f1070E = C0267t.m814d(b2, "enable_progress");
        this.f1071F = C0267t.m819h(b2, "filepath");
        this.f1100p = C0267t.m817f(b2, "video_width");
        this.f1101q = C0267t.m817f(b2, "video_height");
        this.f1090f = C0026a.m80c().mo445h().mo533n();
        new C0269v.C0270a().mo707a("Original video dimensions = ").mo705a(this.f1100p).mo707a("x").mo705a(this.f1101q).mo709a(C0269v.f1294d);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f1097m, this.f1098n);
        layoutParams.setMargins(this.f1095k, this.f1096l, 0, 0);
        layoutParams.gravity = 0;
        this.f1075J.addView(this, layoutParams);
        if (this.f1070E && (b = C0026a.m78b()) != null) {
            ProgressBar progressBar = new ProgressBar(b);
            this.f1080O = progressBar;
            C0032c cVar = this.f1075J;
            int i = (int) (this.f1090f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
        }
        this.f1081P = new MediaPlayer();
        this.f1110z = false;
        try {
            if (!this.f1071F.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.f1071F);
                this.f1073H = fileInputStream;
                this.f1081P.setDataSource(fileInputStream.getFD());
            } else {
                this.f1067B = true;
                this.f1081P.setDataSource(this.f1071F);
            }
            this.f1081P.setOnErrorListener(this);
            this.f1081P.setOnPreparedListener(this);
            this.f1081P.setOnCompletionListener(this);
            this.f1081P.prepareAsync();
        } catch (IOException e) {
            new C0269v.C0270a().mo707a("Failed to create/prepare MediaPlayer: ").mo707a(e.toString()).mo709a(C0269v.f1299i);
            m568g();
        }
        this.f1075J.mo313i().add(C0026a.m72a("VideoView.play", (C0028a0) new C0196a(), true));
        this.f1075J.mo313i().add(C0026a.m72a("VideoView.set_bounds", (C0028a0) new C0197b(), true));
        this.f1075J.mo313i().add(C0026a.m72a("VideoView.set_visible", (C0028a0) new C0198c(), true));
        this.f1075J.mo313i().add(C0026a.m72a("VideoView.pause", (C0028a0) new C0199d(), true));
        this.f1075J.mo313i().add(C0026a.m72a("VideoView.seek_to_time", (C0028a0) new C0200e(), true));
        this.f1075J.mo313i().add(C0026a.m72a("VideoView.set_volume", (C0028a0) new C0201f(), true));
        this.f1075J.mo315j().add("VideoView.play");
        this.f1075J.mo315j().add("VideoView.set_bounds");
        this.f1075J.mo315j().add("VideoView.set_visible");
        this.f1075J.mo315j().add("VideoView.pause");
        this.f1075J.mo315j().add("VideoView.seek_to_time");
        this.f1075J.mo315j().add("VideoView.set_volume");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo587e() {
        if (this.f1092h) {
            this.f1089e = (float) (360.0d / this.f1104t);
            this.f1094j.setColor(-3355444);
            this.f1094j.setShadowLayer((float) ((int) (this.f1090f * 2.0f)), 0.0f, 0.0f, -16777216);
            this.f1094j.setTextAlign(Paint.Align.CENTER);
            this.f1094j.setLinearText(true);
            this.f1094j.setTextSize(this.f1090f * 12.0f);
            this.f1093i.setStyle(Paint.Style.STROKE);
            float f = this.f1090f * 2.0f;
            if (f > 6.0f) {
                f = 6.0f;
            }
            if (f < 4.0f) {
                f = 4.0f;
            }
            this.f1093i.setStrokeWidth(f);
            this.f1093i.setShadowLayer((float) ((int) (this.f1090f * 3.0f)), 0.0f, 0.0f, -16777216);
            this.f1093i.setColor(-3355444);
            Rect rect = new Rect();
            this.f1094j.getTextBounds("0123456789", 0, 9, rect);
            this.f1087c = (float) rect.height();
            Context b = C0026a.m78b();
            if (b != null) {
                C0190l0.m510a((Runnable) new C0204i(b));
            }
            this.f1092h = false;
        }
        this.f1091g = (int) (this.f1104t - this.f1103s);
        float f2 = this.f1087c;
        float f3 = (float) ((int) f2);
        this.f1085a = f3;
        float f4 = (float) ((int) (3.0f * f2));
        this.f1086b = f4;
        float f5 = f2 / 2.0f;
        float f6 = f2 * 2.0f;
        this.f1078M.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
        double d = (double) this.f1089e;
        Double.isNaN(d);
        this.f1088d = (float) (d * (this.f1104t - this.f1103s));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo588f() {
        return this.f1106v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo589h() {
        if (!this.f1110z) {
            new C0269v.C0270a().mo707a("ADCVideoView pause() called while MediaPlayer is not prepared.").mo709a(C0269v.f1298h);
            return false;
        } else if (!this.f1108x) {
            return false;
        } else {
            this.f1102r = this.f1081P.getCurrentPosition();
            this.f1104t = (double) this.f1081P.getDuration();
            this.f1081P.pause();
            this.f1109y = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo590i() {
        if (!this.f1110z) {
            return false;
        }
        if (!this.f1109y && C0026a.f112d) {
            this.f1081P.start();
            m577m();
        } else if (!this.f1106v && C0026a.f112d) {
            this.f1081P.start();
            this.f1109y = false;
            if (!this.f1083R.isShutdown()) {
                m577m();
            }
            C0205j jVar = this.f1079N;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo591j() {
        new C0269v.C0270a().mo707a("MediaPlayer stopped and released.").mo709a(C0269v.f1296f);
        try {
            if (!this.f1106v && this.f1110z && this.f1081P.isPlaying()) {
                this.f1081P.stop();
            }
        } catch (IllegalStateException unused) {
            new C0269v.C0270a().mo707a("Caught IllegalStateException when calling stop on MediaPlayer").mo709a(C0269v.f1298h);
        }
        ProgressBar progressBar = this.f1080O;
        if (progressBar != null) {
            this.f1075J.removeView(progressBar);
        }
        this.f1106v = true;
        this.f1110z = false;
        this.f1081P.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo592k() {
        this.f1107w = true;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f1106v = true;
        this.f1103s = this.f1104t;
        C0267t.m808b(this.f1082Q, "id", this.f1099o);
        C0267t.m808b(this.f1082Q, "container_id", this.f1075J.mo299c());
        C0267t.m798a(this.f1082Q, "ad_session_id", this.f1072G);
        C0267t.m796a(this.f1082Q, "elapsed", this.f1103s);
        C0267t.m796a(this.f1082Q, "duration", this.f1104t);
        new C0284y("VideoView.on_progress", this.f1075J.mo317k(), this.f1082Q).mo740d();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m568g();
        C0269v.C0270a aVar = new C0269v.C0270a();
        aVar.mo707a("MediaPlayer error: " + i + "," + i2).mo709a(C0269v.f1299i);
        return true;
    }

    public void onMeasure(int i, int i2) {
        m574l();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f1110z = true;
        if (this.f1070E) {
            this.f1075J.removeView(this.f1080O);
        }
        if (this.f1067B) {
            this.f1100p = mediaPlayer.getVideoWidth();
            this.f1101q = mediaPlayer.getVideoHeight();
            m574l();
            new C0269v.C0270a().mo707a("MediaPlayer getVideoWidth = ").mo705a(mediaPlayer.getVideoWidth()).mo709a(C0269v.f1296f);
            new C0269v.C0270a().mo707a("MediaPlayer getVideoHeight = ").mo705a(mediaPlayer.getVideoHeight()).mo709a(C0269v.f1296f);
        }
        JSONObject b = C0267t.m805b();
        C0267t.m808b(b, "id", this.f1099o);
        C0267t.m808b(b, "container_id", this.f1075J.mo299c());
        C0267t.m798a(b, "ad_session_id", this.f1072G);
        new C0284y("VideoView.on_ready", this.f1075J.mo317k(), b).mo740d();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f1083R;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.f1083R.submit(new C0202g());
            } catch (RejectedExecutionException unused) {
                m568g();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture == null || this.f1066A) {
            new C0269v.C0270a().mo707a("Null texture provided by system's onSurfaceTextureAvailable or ").mo707a("MediaPlayer has been destroyed.").mo709a(C0269v.f1300j);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f1076K = surface;
        try {
            this.f1081P.setSurface(surface);
        } catch (IllegalStateException unused) {
            new C0269v.C0270a().mo707a("IllegalStateException thrown when calling MediaPlayer.setSurface()").mo709a(C0269v.f1299i);
            m568g();
        }
        this.f1077L = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f1077L = surfaceTexture;
        if (!this.f1066A) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f1077L = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f1077L = surfaceTexture;
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
        C0267t.m808b(b2, "view_id", this.f1099o);
        C0267t.m798a(b2, "ad_session_id", this.f1072G);
        C0267t.m808b(b2, "container_x", this.f1095k + x);
        C0267t.m808b(b2, "container_y", this.f1096l + y);
        C0267t.m808b(b2, "view_x", x);
        C0267t.m808b(b2, "view_y", y);
        C0267t.m808b(b2, "id", this.f1075J.mo299c());
        switch (action) {
            case 0:
                new C0284y("AdContainer.on_touch_began", this.f1075J.mo317k(), b2).mo740d();
                break;
            case 1:
                if (!this.f1075J.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1072G));
                }
                new C0284y("AdContainer.on_touch_ended", this.f1075J.mo317k(), b2).mo740d();
                break;
            case 2:
                new C0284y("AdContainer.on_touch_moved", this.f1075J.mo317k(), b2).mo740d();
                break;
            case 3:
                new C0284y("AdContainer.on_touch_cancelled", this.f1075J.mo317k(), b2).mo740d();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action2)) + this.f1095k);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action2)) + this.f1096l);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action2));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action2));
                new C0284y("AdContainer.on_touch_began", this.f1075J.mo317k(), b2).mo740d();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", ((int) motionEvent.getX(action3)) + this.f1095k);
                C0267t.m808b(b2, "container_y", ((int) motionEvent.getY(action3)) + this.f1096l);
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action3));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action3));
                if (!this.f1075J.mo324p()) {
                    c.mo423a(b.mo342b().get(this.f1072G));
                }
                new C0284y("AdContainer.on_touch_ended", this.f1075J.mo317k(), b2).mo740d();
                break;
        }
        return true;
    }
}
