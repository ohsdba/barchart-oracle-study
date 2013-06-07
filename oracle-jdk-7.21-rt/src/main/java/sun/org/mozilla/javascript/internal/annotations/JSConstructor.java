package sun.org.mozilla.javascript.internal.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD})
public @interface JSConstructor
{
}

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     sun.org.mozilla.javascript.internal.annotations.JSConstructor
 * JD-Core Version:    0.6.2
 */