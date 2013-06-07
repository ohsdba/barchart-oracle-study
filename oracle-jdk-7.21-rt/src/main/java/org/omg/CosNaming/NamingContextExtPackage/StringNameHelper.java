/*    */ package org.omg.CosNaming.NamingContextExtPackage;
/*    */ 
/*    */ import org.omg.CORBA.Any;
/*    */ import org.omg.CORBA.ORB;
/*    */ import org.omg.CORBA.TypeCode;
/*    */ import org.omg.CORBA.portable.InputStream;
/*    */ import org.omg.CORBA.portable.OutputStream;
/*    */ 
/*    */ public abstract class StringNameHelper
/*    */ {
/* 18 */   private static String _id = "IDL:omg.org/CosNaming/NamingContextExt/StringName:1.0";
/*    */ 
/* 33 */   private static TypeCode __typeCode = null;
/*    */ 
/*    */   public static void insert(Any paramAny, String paramString)
/*    */   {
/* 22 */     OutputStream localOutputStream = paramAny.create_output_stream();
/* 23 */     paramAny.type(type());
/* 24 */     write(localOutputStream, paramString);
/* 25 */     paramAny.read_value(localOutputStream.create_input_stream(), type());
/*    */   }
/*    */ 
/*    */   public static String extract(Any paramAny)
/*    */   {
/* 30 */     return read(paramAny.create_input_stream());
/*    */   }
/*    */ 
/*    */   public static synchronized TypeCode type()
/*    */   {
/* 36 */     if (__typeCode == null)
/*    */     {
/* 38 */       __typeCode = ORB.init().create_string_tc(0);
/* 39 */       __typeCode = ORB.init().create_alias_tc(id(), "StringName", __typeCode);
/*    */     }
/* 41 */     return __typeCode;
/*    */   }
/*    */ 
/*    */   public static String id()
/*    */   {
/* 46 */     return _id;
/*    */   }
/*    */ 
/*    */   public static String read(InputStream paramInputStream)
/*    */   {
/* 51 */     String str = null;
/* 52 */     str = paramInputStream.read_string();
/* 53 */     return str;
/*    */   }
/*    */ 
/*    */   public static void write(OutputStream paramOutputStream, String paramString)
/*    */   {
/* 58 */     paramOutputStream.write_string(paramString);
/*    */   }
/*    */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     org.omg.CosNaming.NamingContextExtPackage.StringNameHelper
 * JD-Core Version:    0.6.2
 */