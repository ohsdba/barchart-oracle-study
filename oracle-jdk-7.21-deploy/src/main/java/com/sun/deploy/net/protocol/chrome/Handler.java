package com.sun.deploy.net.protocol.chrome;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class Handler extends URLStreamHandler
{
  protected URLConnection openConnection(URL paramURL)
    throws IOException
  {
    return new ChromeURLConnection(paramURL);
  }
}

/* Location:           /home/user1/Temp/jvm/deploy.jar
 * Qualified Name:     com.sun.deploy.net.protocol.chrome.Handler
 * JD-Core Version:    0.6.2
 */