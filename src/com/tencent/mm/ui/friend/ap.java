package com.tencent.mm.ui.friend;

import com.tencent.mm.a.l;
import com.tencent.mm.modelfriend.aw;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.t;

final class ap
  implements a.a
{
  ap(an paraman) {}
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    t.i("!44@/B4Tb64lLpJnI9lwkJyeeAeaeS3baC7ZIJLQ3cmLpPk=", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramString1, paramString2 });
    long l = new l(l.aH(paramString2)).longValue();
    aw localaw = ay.yG().L(l);
    if ((localaw != null) && (paramBoolean1)) {
      username = paramString1;
    }
    if (localaw != null)
    {
      bss = 2;
      t.d("!44@/B4Tb64lLpJnI9lwkJyeeAeaeS3baC7ZIJLQ3cmLpPk=", "f :%s", new Object[] { localaw.toString() });
      ay.yG().a(l, localaw);
      jmH.jmG.Eb();
    }
    for (;;)
    {
      if ((paramBoolean1) && (localaw != null)) {
        am.Bz(paramString1);
      }
      return;
      t.w("!44@/B4Tb64lLpJnI9lwkJyeeAeaeS3baC7ZIJLQ3cmLpPk=", "cpan qq friend is null. qq:%s", new Object[] { paramString2 });
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.friend.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */