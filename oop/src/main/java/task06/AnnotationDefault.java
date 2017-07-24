package task06;

import java.lang.annotation.*;

/**
 * Default annotation to use it for JavaDoc.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface AnnotationDefault {

    String version() default "1.0.0";

    String lastModified() default "01.01.1970";

    String createdBy() default "Alexander Zheludkov";
}