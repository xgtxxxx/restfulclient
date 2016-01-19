package xgt.easy.webservice.client;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import xgt.easy.webservice.model.RequestInfo;
import xgt.easy.webservice.model.ResponseInfo;

import java.io.IOException;

public class EasyHttpClient extends SimpleHttpClient {
    @Override
    public ResponseInfo doGet(RequestInfo info) throws IOException {
        return execute(createGet(info));
    }

    @Override
    public ResponseInfo doPost(RequestInfo info) {
        return null;
    }

    @Override
    public ResponseInfo doPut(RequestInfo info) {
        return null;
    }

    @Override
    public ResponseInfo doDelete(RequestInfo info) {
        return null;
    }
}
