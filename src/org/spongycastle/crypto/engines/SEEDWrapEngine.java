// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;


// Referenced classes of package org.spongycastle.crypto.engines:
//            RFC3394WrapEngine, SEEDEngine

public class SEEDWrapEngine extends RFC3394WrapEngine
{

    public SEEDWrapEngine()
    {
        super(new SEEDEngine());
    }
}
