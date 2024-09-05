package com.azure.ai.openai.tests;

import com.azure.json.JsonSerializable;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.openai.core.ObjectMappers;

import java.io.InputStream;
import java.io.PipedInputStream;

public interface JsonUtils {

// this won't work
//    static <T extends JsonSerializable<T>> T ofAdditionalProperties(Map<String, JsonValue> additionalProperties) {
//        T object = null;
//        try {
//            JsonMapper mapper = ObjectMappers.jsonMapper();
//            String json = mapper.writeValueAsString(additionalProperties);
//            object = JsonSerializable.fromJson(json);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        return object;
//    }


    // completions().create() returns ChatCompletion => AzureChatCompletions
    static <T extends JsonSerializable<T>> T fromResponse(Object object) throws Exception {
        if (object == null) {
            return null;
        }
        JsonMapper mapper = ObjectMappers.jsonMapper();
        byte[] objectAsBytes = mapper.writeValueAsBytes(object);
        // piping the object as an InputStream for an object that implements JsonSerializable in Azure
//        InputStream inputStream = new PipedInputStream();
//        inputStream.read(objectAsBytes);
        return JsonSerializable.fromJson(objectAsBytes);
    }
}
