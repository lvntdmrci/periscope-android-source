// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package o:
//            fn, bg, gq

public static abstract class g.String extends Binder
    implements fn
{
    static final class if
        implements fn
    {

        private IBinder zznJ;

        public final IBinder asBinder()
        {
            return zznJ;
        }

        public final bg _mth02CB(gq gq1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (gq1 == null) goto _L2; else goto _L1
_L1:
            gq1 = gq1.asBinder();
_L4:
            parcel.writeStrongBinder(gq1);
            zznJ.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            gq1 = bg.if._mth141D(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return gq1;
            gq1;
            parcel1.recycle();
            parcel.recycle();
            throw gq1;
_L2:
            gq1 = null;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final bg _mth02CE(gq gq1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (gq1 == null) goto _L2; else goto _L1
_L1:
            gq1 = gq1.asBinder();
_L4:
            parcel.writeStrongBinder(gq1);
            zznJ.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            gq1 = bg.if._mth141D(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return gq1;
            gq1;
            parcel1.recycle();
            parcel.recycle();
            throw gq1;
_L2:
            gq1 = null;
            if (true) goto _L4; else goto _L3
_L3:
        }

        if(IBinder ibinder)
        {
            zznJ = ibinder;
        }
    }


    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            parcel = _mth02CB(_mth1D62(parcel.readStrongBinder()));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            parcel = _mth02CE(_mth1D62(parcel.readStrongBinder()));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
        return super.onTransact(i, parcel, parcel1, j);
    }

    public g.String()
    {
        attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }
}
