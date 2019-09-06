package com.chachae.annoations;

/**
 * @author chachae
 * @date 2019/9/6 10:52
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记【推荐】的类或者写法
 *
 * @author chachae
 * @date 2019/9/6 10:41
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {

  String value() default "";
}
