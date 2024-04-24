/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import java.io.File;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.client.model.Tag;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class BodyApi extends BaseApi {

  public BodyApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BodyApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Test binary (gif) response body
   * Test binary (gif) response body
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File testBinaryGif() throws ApiException {
    return this.testBinaryGif(Collections.emptyMap());
  }


  /**
   * Test binary (gif) response body
   * Test binary (gif) response body
   * @param additionalHeaders additionalHeaders for this call
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File testBinaryGif(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/binary/gif";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "image/gif"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<File> localVarReturnType = new TypeReference<File>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param body  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyApplicationOctetstreamBinary(File body) throws ApiException {
    return this.testBodyApplicationOctetstreamBinary(body, Collections.emptyMap());
  }


  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param body  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyApplicationOctetstreamBinary(File body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/body/application/octetstream/binary";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/octet-stream"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test array of binary in multipart mime
   * Test array of binary in multipart mime
   * @param files  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyMultipartFormdataArrayOfBinary(List<File> files) throws ApiException {
    return this.testBodyMultipartFormdataArrayOfBinary(files, Collections.emptyMap());
  }


  /**
   * Test array of binary in multipart mime
   * Test array of binary in multipart mime
   * @param files  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyMultipartFormdataArrayOfBinary(List<File> files, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'files' is set
    if (files == null) {
      throw new ApiException(400, "Missing the required parameter 'files' when calling testBodyMultipartFormdataArrayOfBinary");
    }
    
    // create path and map variables
    String localVarPath = "/body/application/octetstream/array_of_binary";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (files != null)
      localVarFormParams.put("files", files);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test single binary in multipart mime
   * Test single binary in multipart mime
   * @param myFile  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyMultipartFormdataSingleBinary(File myFile) throws ApiException {
    return this.testBodyMultipartFormdataSingleBinary(myFile, Collections.emptyMap());
  }


  /**
   * Test single binary in multipart mime
   * Test single binary in multipart mime
   * @param myFile  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyMultipartFormdataSingleBinary(File myFile, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/body/application/octetstream/single_binary";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (myFile != null)
      localVarFormParams.put("my-file", myFile);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet testEchoBodyAllOfPet(Pet pet) throws ApiException {
    return this.testEchoBodyAllOfPet(pet, Collections.emptyMap());
  }


  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet testEchoBodyAllOfPet(Pet pet, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = pet;
    
    // create path and map variables
    String localVarPath = "/echo/body/allOf/Pet";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Pet> localVarReturnType = new TypeReference<Pet>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test free form object
   * Test free form object
   * @param body Free form object (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyFreeFormObjectResponseString(Object body) throws ApiException {
    return this.testEchoBodyFreeFormObjectResponseString(body, Collections.emptyMap());
  }


  /**
   * Test free form object
   * Test free form object
   * @param body Free form object (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyFreeFormObjectResponseString(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/echo/body/FreeFormObject/response_string";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet testEchoBodyPet(Pet pet) throws ApiException {
    return this.testEchoBodyPet(pet, Collections.emptyMap());
  }


  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet testEchoBodyPet(Pet pet, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = pet;
    
    // create path and map variables
    String localVarPath = "/echo/body/Pet";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Pet> localVarReturnType = new TypeReference<Pet>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test empty response body
   * Test empty response body
   * @param pet Pet object that needs to be added to the store (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyPetResponseString(Pet pet) throws ApiException {
    return this.testEchoBodyPetResponseString(pet, Collections.emptyMap());
  }


  /**
   * Test empty response body
   * Test empty response body
   * @param pet Pet object that needs to be added to the store (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyPetResponseString(Pet pet, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = pet;
    
    // create path and map variables
    String localVarPath = "/echo/body/Pet/response_string";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test string enum response body
   * Test string enum response body
   * @param body String enum (optional)
   * @return StringEnumRef
   * @throws ApiException if fails to make API call
   */
  public StringEnumRef testEchoBodyStringEnum(String body) throws ApiException {
    return this.testEchoBodyStringEnum(body, Collections.emptyMap());
  }


  /**
   * Test string enum response body
   * Test string enum response body
   * @param body String enum (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return StringEnumRef
   * @throws ApiException if fails to make API call
   */
  public StringEnumRef testEchoBodyStringEnum(String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/echo/body/string_enum";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<StringEnumRef> localVarReturnType = new TypeReference<StringEnumRef>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test empty json (request body)
   * Test empty json (request body)
   * @param tag Tag object (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyTagResponseString(Tag tag) throws ApiException {
    return this.testEchoBodyTagResponseString(tag, Collections.emptyMap());
  }


  /**
   * Test empty json (request body)
   * Test empty json (request body)
   * @param tag Tag object (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyTagResponseString(Tag tag, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = tag;
    
    // create path and map variables
    String localVarPath = "/echo/body/Tag/response_string";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
