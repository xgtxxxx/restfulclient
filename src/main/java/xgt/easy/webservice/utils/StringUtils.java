package xgt.easy.webservice.utils;

public final class StringUtils {
    public static final boolean isEmpty(final String string){
        return string==null||"".equals(string);
    }
    public static final boolean isNotEmpty(final String string){
        return string!=null&&!"".equals(string);
    }

    public static final boolean isNotEmpty(final Object obj){
        String s = toString(obj);
        return isNotEmpty(s);
    }

    public static final String toString(Object obj){
        return obj==null?null:String.valueOf(obj);
    }
}
