package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class su
  extends c
{
  private final int height = 96;
  private final int width = 96;
  
  protected final int i(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 96;
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.d(paramVarArgs);
      c.c(paramVarArgs);
      Paint localPaint = c.g(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.g(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.h(paramVarArgs);
      ((Path)localObject).moveTo(57.0F, 31.286F);
      ((Path)localObject).cubicTo(57.0F, 32.233F, 57.768F, 33.0F, 58.714F, 33.0F);
      ((Path)localObject).lineTo(73.0F, 33.0F);
      ((Path)localObject).lineTo(57.0F, 17.0F);
      ((Path)localObject).lineTo(57.0F, 31.286F);
      ((Path)localObject).lineTo(57.0F, 31.286F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(54.0F, 33.0F);
      ((Path)localObject).lineTo(54.0F, 17.0F);
      ((Path)localObject).lineTo(32.0F, 17.0F);
      ((Path)localObject).cubicTo(30.343F, 17.0F, 29.0F, 18.343F, 29.0F, 20.0F);
      ((Path)localObject).lineTo(29.0F, 70.0F);
      ((Path)localObject).cubicTo(29.0F, 71.657F, 30.343F, 73.0F, 32.0F, 73.0F);
      ((Path)localObject).lineTo(70.0F, 73.0F);
      ((Path)localObject).cubicTo(71.657F, 73.0F, 73.0F, 71.657F, 73.0F, 70.0F);
      ((Path)localObject).lineTo(73.0F, 36.0F);
      ((Path)localObject).lineTo(57.0F, 36.0F);
      ((Path)localObject).cubicTo(55.343F, 36.001F, 54.0F, 34.658F, 54.0F, 33.0F);
      ((Path)localObject).lineTo(54.0F, 33.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(26.0F, 73.0F);
      ((Path)localObject).lineTo(26.0F, 29.0F);
      ((Path)localObject).cubicTo(24.343F, 29.0F, 23.0F, 30.343F, 23.0F, 32.0F);
      ((Path)localObject).lineTo(23.0F, 76.0F);
      ((Path)localObject).cubicTo(23.0F, 77.657F, 24.343F, 79.0F, 26.0F, 79.0F);
      ((Path)localObject).lineTo(60.0F, 79.0F);
      ((Path)localObject).cubicTo(61.657F, 79.0F, 63.0F, 77.657F, 63.0F, 76.0F);
      ((Path)localObject).lineTo(29.0F, 76.0F);
      ((Path)localObject).cubicTo(27.343F, 76.0F, 26.0F, 74.657F, 26.0F, 73.0F);
      ((Path)localObject).lineTo(26.0F, 73.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.f(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.su
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */