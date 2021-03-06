/*     */ package com.sun.org.apache.xml.internal.serializer.utils;
/*     */ 
/*     */ import java.util.ListResourceBundle;
/*     */ 
/*     */ public class SerializerMessages_ko extends ListResourceBundle
/*     */ {
/*     */   public Object[][] getContents()
/*     */   {
/*  30 */     Object[][] contents = { { "ER_SERIALIZER_NOT_CONTENTHANDLER", "''{0}'' 직렬화 프로그램 클래스가 org.xml.sax.ContentHandler를 구현하지 않습니다." }, { "ER_RESOURCE_COULD_NOT_FIND", "[ {0} ] 자원을 찾을 수 없습니다.\n {1}" }, { "ER_RESOURCE_COULD_NOT_LOAD", "[ {0} ] 자원이 {1} \n {2} \n {3}을(를) 로드할 수 없습니다. " }, { "ER_BUFFER_SIZE_LESSTHAN_ZERO", "버퍼 크기 <=0" }, { "ER_INVALID_UTF16_SURROGATE", "잘못된 UTF-16 대리자(surrogate)가 발견되었습니다: {0} ?" }, { "ER_OIERROR", "IO 오류" }, { "ER_ILLEGAL_ATTRIBUTE_POSITION", "하위 노드가 생성된 이후 또는 요소가 작성되기 이전에 {0} 속성을 추가할 수 없습니다. 속성이 무시됩니다." }, { "ER_NAMESPACE_PREFIX", "''{0}'' 접두부에 대한 이름 공간이 선언되지 않았습니다." }, { "ER_STRAY_NAMESPACE", "''{0}''=''{1}'' 이름 공간 선언이 요소의 외부에 있습니다." }, { "ER_COULD_NOT_LOAD_RESOURCE", "''{0}''(CLASSPATH 확인)을(를) 로드할 수 없으므로, 현재 기본값만을 사용 중입니다." }, { "ER_COULD_NOT_LOAD_METHOD_PROPERTY", "''{1}''출력 메소드(CLASSPATH 확인)에 대한 ''{0}'' 특성 파일을 로드할 수 없습니다." }, { "ER_INVALID_PORT", "잘못된 포트 번호" }, { "ER_PORT_WHEN_HOST_NULL", "호스트가 널(null)이면 포트를 설정할 수 없습니다." }, { "ER_HOST_ADDRESS_NOT_WELLFORMED", "호스트가 완전한 주소가 아닙니다." }, { "ER_SCHEME_NOT_CONFORMANT", "설계가 일치하지 않습니다." }, { "ER_SCHEME_FROM_NULL_STRING", "널(null) 문자열에서 설계를 설정할 수 없습니다." }, { "ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE", "경로에 잘못된 이스케이프 순서가 있습니다." }, { "ER_PATH_INVALID_CHAR", "경로에 잘못된 문자가 있습니다: {0}" }, { "ER_FRAG_INVALID_CHAR", "단편에 잘못된 문자가 있습니다." }, { "ER_FRAG_WHEN_PATH_NULL", "경로가 널(null)이면 단편을 설정할 수 없습니다." }, { "ER_FRAG_FOR_GENERIC_URI", "일반 URI에 대해서만 단편을 설정할 수 있습니다." }, { "ER_NO_SCHEME_IN_URI", "URI에 설계가 없습니다: {0}" }, { "ER_CANNOT_INIT_URI_EMPTY_PARMS", "빈 매개변수로 URI를 초기화할 수 없습니다." }, { "ER_NO_FRAGMENT_STRING_IN_PATH", "경로 및 단편 둘 다에 단편을 지정할 수 없습니다." }, { "ER_NO_QUERY_STRING_IN_PATH", "경로 및 조회 문자열에 조회 문자열을 지정할 수 없습니다." }, { "ER_NO_PORT_IF_NO_HOST", "호스트를 지정하지 않은 경우에는 포트를 지정할 수 없습니다." }, { "ER_NO_USERINFO_IF_NO_HOST", "호스트를 지정하지 않은 경우에는 Userinfo를 지정할 수 없습니다." }, { "ER_SCHEME_REQUIRED", "설계가 필요합니다!" } };
/*     */ 
/* 120 */     return contents;
/*     */   }
/*     */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_ko
 * JD-Core Version:    0.6.2
 */