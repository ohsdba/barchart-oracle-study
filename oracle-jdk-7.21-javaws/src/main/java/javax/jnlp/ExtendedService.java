package javax.jnlp;

import java.io.File;
import java.io.IOException;

public abstract interface ExtendedService
{
  public abstract FileContents openFile(File paramFile)
    throws IOException;

  public abstract FileContents[] openFiles(File[] paramArrayOfFile)
    throws IOException;
}

/* Location:           /home/user1/Temp/jvm/javaws.jar
 * Qualified Name:     javax.jnlp.ExtendedService
 * JD-Core Version:    0.6.2
 */