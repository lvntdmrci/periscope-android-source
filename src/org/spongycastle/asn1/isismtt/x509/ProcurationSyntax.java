// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.isismtt.x509;

import java.util.Vector;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

public class ProcurationSyntax extends ASN1Object
{

    public final ASN1Primitive _mth0427()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        DERTaggedObject dertaggedobject = new DERTaggedObject(true, 3, null);
        asn1encodablevector.VS.addElement(dertaggedobject);
        return new DERSequence(asn1encodablevector);
    }
}