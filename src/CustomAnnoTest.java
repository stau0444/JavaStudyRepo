import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Inherited // 부모 어노테이션을 상속한다.
@Documented// javaDoc 에 등록 되도록 한다
@Target(ElementType.TYPE)
public @interface CustomAnnoTest {

}
