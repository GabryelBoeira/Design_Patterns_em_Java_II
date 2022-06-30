package br.com.alura.loja.adapter;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpAdapterImpl implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> params) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
        } catch (MalformedURLException e) {
            throw new RuntimeException("Erro ao tentar criar a url => ", e.fillInStackTrace());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao tentar realizar a requisicao HTTP - POST => ", e.fillInStackTrace());
        }
    }
}
