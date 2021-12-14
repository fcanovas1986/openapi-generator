/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * BananaReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BananaReq {
  public static final String SERIALIZED_NAME_LENGTH_CM = "lengthCm";
  @SerializedName(SERIALIZED_NAME_LENGTH_CM)
  private BigDecimal lengthCm;

  public static final String SERIALIZED_NAME_SWEET = "sweet";
  @SerializedName(SERIALIZED_NAME_SWEET)
  private Boolean sweet;

  public BananaReq() { 
  }

  public BananaReq lengthCm(BigDecimal lengthCm) {
    
    this.lengthCm = lengthCm;
    return this;
  }

   /**
   * Get lengthCm
   * @return lengthCm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getLengthCm() {
    return lengthCm;
  }


  public void setLengthCm(BigDecimal lengthCm) {
    this.lengthCm = lengthCm;
  }


  public BananaReq sweet(Boolean sweet) {
    
    this.sweet = sweet;
    return this;
  }

   /**
   * Get sweet
   * @return sweet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSweet() {
    return sweet;
  }


  public void setSweet(Boolean sweet) {
    this.sweet = sweet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BananaReq bananaReq = (BananaReq) o;
    return Objects.equals(this.lengthCm, bananaReq.lengthCm) &&
        Objects.equals(this.sweet, bananaReq.sweet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lengthCm, sweet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BananaReq {\n");
    sb.append("    lengthCm: ").append(toIndentedString(lengthCm)).append("\n");
    sb.append("    sweet: ").append(toIndentedString(sweet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("lengthCm");
    openapiFields.add("sweet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lengthCm");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BananaReq
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BananaReq.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BananaReq is not found in the empty JSON string", BananaReq.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BananaReq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BananaReq` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BananaReq.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BananaReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BananaReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BananaReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BananaReq.class));

       return (TypeAdapter<T>) new TypeAdapter<BananaReq>() {
           @Override
           public void write(JsonWriter out, BananaReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BananaReq read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BananaReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BananaReq
  * @throws IOException if the JSON string is invalid with respect to BananaReq
  */
  public static BananaReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BananaReq.class);
  }
}

