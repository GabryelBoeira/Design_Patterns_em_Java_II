package br.com.alura.loja.adapter;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> params);
}
