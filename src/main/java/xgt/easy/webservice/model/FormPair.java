package xgt.easy.webservice.model;

/**
 * Created by xgt on 2016/1/5.
 */
public class FormPair {
    private String key;
    private Object value;

    public FormPair(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
