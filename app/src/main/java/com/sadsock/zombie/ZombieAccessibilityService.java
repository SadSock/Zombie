package com.sadsock.zombie;


import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

public class ZombieAccessibilityService extends AccessibilityService {

    final static String TAG = "AccessibilityService";
    int screenWidth;
    int screenHeight;

    // Reflection reflection;

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.d(TAG, "on AccessibilityEvent");
    }

    @Override
    public void onInterrupt() {
        Log.e(TAG, "OnInterrupt");
    }

    @Override
    public void onServiceConnected() {
        Log.d(TAG, "on Service Connected");

        DisplayMetrics dm = getResources().getDisplayMetrics();
        screenWidth = dm.widthPixels;
        screenHeight = dm.heightPixels;

        AccessibilityServiceInfo info = new AccessibilityServiceInfo();

        info.eventTypes = AccessibilityEvent.TYPES_ALL_MASK;
        // info.feedbackType = AccessibilityServiceInfo.DEFAULT | AccessibilityServiceInfo.FEEDBACK_HAPTIC;
        info.feedbackType = AccessibilityServiceInfo.FEEDBACK_HAPTIC;
        info.notificationTimeout = 1000; // millisecond

        setServiceInfo(info);
    }


}
