package com.tencent.mm.pluginsdk.i.a.c;

import android.annotation.SuppressLint;
import com.tencent.mm.pluginsdk.i.a.a.b.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public final class n
{
  private static final HashMap iEA;
  private static volatile List iEB;
  
  static
  {
    Object localObject = new HashMap(2);
    iEA = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("CheckResUpdatePlugin".hashCode()), new b.a());
    try
    {
      localObject = Class.forName("com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper$ResDownloaderPlugin").newInstance();
      iEA.put(Integer.valueOf("WebViewCacheDownload".hashCode()), (f)localObject);
      iEB = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static Collection aQy()
  {
    if (iEB != null) {
      return iEB;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = iEA.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      f localf = (f)iEA.get(Integer.valueOf(i));
      if (localf != null) {
        localLinkedList.add(localf);
      }
    }
    iEB = localLinkedList;
    return localLinkedList;
  }
  
  public static void init() {}
}

/* Location:
 * Qualified Name:     com.tencent.mm.pluginsdk.i.a.c.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */