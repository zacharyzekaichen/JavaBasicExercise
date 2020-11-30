import org.junit.Test;

import javax.sound.midi.Soundbank;

/**String方法练习
 * @author chenzk
 * @create 2020-12-01 7:05
 */
public class StringMethodTest {

    /**
     * 通过以下情况说明，变量加上字符串赋值的方式是通过new方式创建String对象的。
     * 只要是String类对象，存储的地址便和常量池中存放的字符串地址不同。
     * 需要注意的是，final+字面量方式赋值的字符串变量便是字符串常量，此时便不是通过new方式创建String对象。
     */
    @Test
    public void test2(){
        String str1 = "殷";
        String str2 = "殷清越";
        String str3 = "殷" + "清越";
        String str4 = str1 + "清越";
        final String str5 = str1 + "清越";
        final String str6 = "殷";
        String str7 = str6 + "清越";
        String str8 = new String("殷清越");
        final String str9 = new String("殷清越");
        final String str10 = new String("殷");
        String str11 = str10 + "清越";
        System.out.println(str2 == str3); //true
        System.out.println(str2 == str4); //false
        System.out.println(str2 == str5); //false
        System.out.println(str2 == str7); //true
        System.out.println(str2 == str8); //false
        System.out.println(str2 == str9); //false
        System.out.println(str2 == str11); //false
    }

    /**
     * String型变量创建方式
     */
    @Test
    public void test1(){
        //字面量方式
        String str1 = "殷清越";
        //通过new的方式
        String str2 = new String("殷清越");
    }
}
