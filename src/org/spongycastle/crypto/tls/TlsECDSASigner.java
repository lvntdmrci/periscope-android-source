// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.signers.ECDSASigner;
import org.spongycastle.crypto.signers.HMacDSAKCalculator;

// Referenced classes of package org.spongycastle.crypto.tls:
//            TlsDSASigner, TlsUtils

public class TlsECDSASigner extends TlsDSASigner
{

    public TlsECDSASigner()
    {
    }

    public final boolean _mth02CE(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        return asymmetrickeyparameter instanceof ECPublicKeyParameters;
    }

    protected final short _mth0E05()
    {
        return 3;
    }

    protected final DSA _mth141D(short word0)
    {
        return new ECDSASigner(new HMacDSAKCalculator(TlsUtils._mth02BD(word0)));
    }
}
