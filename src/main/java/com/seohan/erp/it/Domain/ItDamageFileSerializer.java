package com.seohan.erp.it.Domain;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ItDamageFileSerializer extends JsonSerializer<ItDamageFile> {


    @Override
    public void serialize(ItDamageFile itDamageFile, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {

        gen.writeStartObject();

        gen.writeStringField("fileName",itDamageFile.getFileName());
        gen.writeStringField("uploadPath",itDamageFile.getUploadPath());
        gen.writeStringField("uuid",itDamageFile.getUuid());

        gen.writeEndObject();
    }
}
