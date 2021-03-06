package com.easyframework.webservice.restfulclient.model;

import com.easyframework.webservice.restfulclient.HttpMethod;

import java.util.ArrayList;
import java.util.List;

public class RequestInfo {
    private String applicationType;

    private HttpMethod httpMethod;

    private String requestUrl;

    private List<ParameterPair> formData;

    private List<ParameterPair> headers;

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public List<ParameterPair> getFormData() {
        return formData==null?new ArrayList<ParameterPair>():formData;
    }

    public void addHeaders(final List<ParameterPair> hds){
        if(headers==null){
            headers = new ArrayList<ParameterPair>();
        }
        headers.addAll(hds);
    }

    public void setFormData(List<ParameterPair> formData) {
        this.formData = formData;
    }

    public List<ParameterPair> getHeaders() {
        return headers==null?new ArrayList<ParameterPair>():headers;
    }

    public String getApplicationType() {
        return applicationType==null?PostContentType.FORM_DATA:applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public void setHeaders(List<ParameterPair> headers) {
        this.headers = headers;
    }
}
