package xgt.easy.webservice.client;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import xgt.easy.webservice.model.HttpClientConfig;

public final class HttpClientFactory extends HttpAbstractClientFactory {
    private int socketTimeout;

    private int connectionTimeout;

    private int requestTimeout;

    private int maxConnections;

    private int defaultMaxConnections;

    private HttpClientBuilder httpClientBuilder;

    private Object lock = new Object();

    public CloseableHttpClient build() {
        synchronized (lock){
            if(httpClientBuilder==null){
                init();
            }
        }
        return httpClientBuilder.build();
    }

    private void init(){
        RequestConfig.Builder config = RequestConfig.custom();
        config.setSocketTimeout(socketTimeout==0? HttpClientConfig.TIME_OUT:socketTimeout);
        config.setConnectTimeout(connectionTimeout==0?HttpClientConfig.TIME_OUT:connectionTimeout);
        config.setConnectionRequestTimeout(requestTimeout==0?HttpClientConfig.TIME_OUT:requestTimeout);
        PoolingHttpClientConnectionManager  clientConnectionManager = new PoolingHttpClientConnectionManager();
        clientConnectionManager.setMaxTotal(maxConnections == 0 ? HttpClientConfig.MAX_CONNECTION_COUNT : maxConnections);
        clientConnectionManager.setDefaultMaxPerRoute(defaultMaxConnections == 0 ? HttpClientConfig.DEFAULT_MAX_COLLECTION_COUNT : defaultMaxConnections);
        httpClientBuilder = HttpClients.custom()
                .setConnectionManager(clientConnectionManager)
                .setDefaultRequestConfig(config.build());
    }
}
