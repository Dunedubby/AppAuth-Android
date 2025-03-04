package net.openid.appauthdemo;

import androidx.annotation.NonNull;

import net.openid.appauth.browser.BrowserDescriptor;
import net.openid.appauth.browser.BrowserMatcher;

/**
 * Matches no browser.
 */
public class NoBrowserMatcher implements BrowserMatcher {

    /**
     * The singleton instance.
     */
    public static final NoBrowserMatcher INSTANCE = new NoBrowserMatcher();

    private NoBrowserMatcher() {
        // no need to construct separate instances
    }

    @Override
    public boolean matches(@NonNull BrowserDescriptor descriptor) {
        return false;
    }
}
