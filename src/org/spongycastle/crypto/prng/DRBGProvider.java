// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.prng;

import org.spongycastle.crypto.prng.drbg.SP80090DRBG;

// Referenced classes of package org.spongycastle.crypto.prng:
//            EntropySource

interface DRBGProvider
{

    public abstract SP80090DRBG _mth02CA(EntropySource entropysource);
}
