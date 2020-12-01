import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**String方法练习
 * @author chenzk
 * @create 2020-12-01 7:05
 */
public class StringMethodTest {

    @Test
    public void testStringMethod(){
        String str = "abcdefghijklmn";
        int length = str.length();
        char c = str.charAt(0);
        boolean empty = str.isEmpty();
        String strUpper = str.toUpperCase(); //创建新的字符串，而不是在原来基础上全部转换为大写。
        String strLower = str.toLowerCase();
        String strTrim = str.trim(); //去除首尾空格
        boolean equal1 = str.equals("abc");
        boolean equal2 = str.equalsIgnoreCase("abc");
        int compare = str.compareTo("abr"); //注意内部是如何实现的，如果遇到不同的字符则相减，从头到尾都没遇到不同的则长度相减。
        String substring = str.substring(0, 3);

        boolean end1 = str.endsWith("jklmn");
        boolean start1 = str.startsWith("abc");
        boolean start2 = str.startsWith("efg", 3);
        boolean start3 = str.startsWith("efg", 4);
        System.out.println(start2 + " " + start3); //false true

        boolean contain = str.contains("abc");
        //含多个子字符串的时候可用上
        int index1 = str.indexOf("efg");
        int index2 = str.indexOf("efg", 4);
        int index3 = str.lastIndexOf("efg");
        int index4 = str.lastIndexOf("efg", 6);

        String str2 = str.replace("abc", "123");

        //与字符数组的转换
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        String str3 = new String(chars);
        String str5 = String.valueOf(chars);
        //与字节数组的转换
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        String str4 = new String(bytes);
    }

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
