package com.sun.xml.internal.txw2.output;

import java.io.IOException;
import java.io.Writer;

public abstract interface CharacterEscapeHandler
{
  public abstract void escape(char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean paramBoolean, Writer paramWriter)
    throws IOException;
}

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     com.sun.xml.internal.txw2.output.CharacterEscapeHandler
 * JD-Core Version:    0.6.2
 */