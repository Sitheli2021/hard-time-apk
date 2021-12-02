package com.adcolony.sdk;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";

    /* renamed from: d */
    static final int f90d = 128;

    /* renamed from: a */
    JSONArray f91a = C0267t.m785a();

    /* renamed from: b */
    JSONObject f92b = C0267t.m805b();

    /* renamed from: c */
    Location f93c;

    public AdColonyUserMetadata addUserInterest(@NonNull String str) {
        if (C0190l0.m530e(str)) {
            C0267t.m807b(this.f91a, str);
            C0267t.m799a(this.f92b, "adc_interests", this.f91a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        JSONArray a = C0267t.m785a();
        this.f91a = a;
        C0267t.m799a(this.f92b, "adc_interests", a);
        return this;
    }

    public Object getMetadata(@NonNull String str) {
        return C0267t.m804b(this.f92b, str);
    }

    public int getUserAge() {
        return C0267t.m817f(this.f92b, "adc_age");
    }

    public int getUserAnnualHouseholdIncome() {
        return C0267t.m817f(this.f92b, "adc_household_income");
    }

    public String getUserEducation() {
        return C0267t.m819h(this.f92b, "adc_education");
    }

    public String getUserGender() {
        return C0267t.m819h(this.f92b, "adc_gender");
    }

    public String[] getUserInterests() {
        String[] strArr = new String[this.f91a.length()];
        for (int i = 0; i < this.f91a.length(); i++) {
            strArr[i] = C0267t.m813d(this.f91a, i);
        }
        return strArr;
    }

    public Location getUserLocation() {
        return this.f93c;
    }

    public String getUserMaritalStatus() {
        return C0267t.m819h(this.f92b, "adc_marital_status");
    }

    public String getUserZipCode() {
        return C0267t.m819h(this.f92b, "adc_zip");
    }

    public AdColonyUserMetadata setMetadata(@NonNull String str, double d) {
        if (C0190l0.m530e(str)) {
            C0267t.m796a(this.f92b, str, d);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(@NonNull String str, @NonNull String str2) {
        if (C0190l0.m530e(str2) && C0190l0.m530e(str)) {
            C0267t.m798a(this.f92b, str, str2);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(@NonNull String str, boolean z) {
        if (C0190l0.m530e(str)) {
            C0267t.m809b(this.f92b, str, z);
        }
        return this;
    }

    public AdColonyUserMetadata setUserAge(@IntRange(from = 0, to = 130) int i) {
        setMetadata("adc_age", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(@IntRange(from = 0) int i) {
        setMetadata("adc_household_income", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserEducation(@NonNull String str) {
        if (C0190l0.m530e(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserGender(@NonNull String str) {
        if (C0190l0.m530e(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserLocation(@NonNull Location location) {
        this.f93c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", (double) location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", (double) location.getTime());
        setMetadata("adc_accuracy", (double) location.getAccuracy());
        return this;
    }

    public AdColonyUserMetadata setUserMaritalStatus(@NonNull String str) {
        if (C0190l0.m530e(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserZipCode(@NonNull String str) {
        if (C0190l0.m530e(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }
}
