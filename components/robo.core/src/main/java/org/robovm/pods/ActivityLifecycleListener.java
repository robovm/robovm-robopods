package org.robovm.pods;

import android.content.Intent;

public interface ActivityLifecycleListener {
    // TODO add all methods
    void onActivityResult(int requestCode, int resultCode, Intent data);
}
