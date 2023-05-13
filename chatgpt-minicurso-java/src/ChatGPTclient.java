import java.util.concurrent.ExecutionException;
import okhttp3.*;
import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class ChatGPTclient {
    public String criarPergunta(
        String OPEN_AI_KEY,
        String assunto, 
        String tipo,
        String dificuldade, 
        String perguntaExemplo

    ) throws Exception{
        
        String prompt = String.format(
            "Elabora uma questão sobre  %s, do tipo %s, de dificuldade %s ",
            assunto, tipo, dificuldade
        );
        prompt += perguntaExemplo == null ? "" : String.format(
            "Use a sequinte questão de exemplo: %s ", perguntaExemplo
        );

        RequisicaoChatGPT requisicaochatgpt = 
        new RequisicaoChatGPT(
            "text-davinci-003",prompt,150
        );
        Gson gson = new Gson();
        String json = gson.toJson(requisicaochatgpt);

        RequestBody requestbody = 
            RequestBody.create(json,MediaType.parse("application/json"));
        
        OkHttpClient client = new OkHttpClient();

        
        
        return "";
    }
}
