// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package tv.periscope.android.api;

import java.util.ArrayList;

// Referenced classes of package tv.periscope.android.api:
//            PsRequest

public class PublishBroadcastRequest extends PsRequest
{

    public String broadcastId;
    public boolean followingOnlyChat;
    public boolean hasLocation;
    public float lat;
    public float lng;
    public String locale;
    public ArrayList lockIds;
    public String title;

    public PublishBroadcastRequest()
    {
    }
}
