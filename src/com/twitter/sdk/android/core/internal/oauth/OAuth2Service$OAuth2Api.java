// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.Callback;

// Referenced classes of package com.twitter.sdk.android.core.internal.oauth:
//            OAuth2Service

static interface I
{

    public abstract void getAppAuthToken(String s, String s1, Callback callback);

    public abstract void getGuestToken(String s, Callback callback);
}
