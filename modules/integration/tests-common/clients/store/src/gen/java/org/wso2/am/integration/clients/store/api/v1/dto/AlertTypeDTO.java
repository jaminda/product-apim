/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

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

/**
 * AlertTypeDTO
 */

public class AlertTypeDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("requireConfiguration")
  private Boolean requireConfiguration = null;

  public AlertTypeDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The alert Id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "The alert Id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AlertTypeDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the alert.
   * @return name
  **/
  @ApiModelProperty(example = "AbnormalRequestsPerMin", value = "The name of the alert.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AlertTypeDTO requireConfiguration(Boolean requireConfiguration) {
    this.requireConfiguration = requireConfiguration;
    return this;
  }

   /**
   * Whether the alert type require additional configurations.
   * @return requireConfiguration
  **/
  @ApiModelProperty(example = "true", value = "Whether the alert type require additional configurations.")
  public Boolean isRequireConfiguration() {
    return requireConfiguration;
  }

  public void setRequireConfiguration(Boolean requireConfiguration) {
    this.requireConfiguration = requireConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertTypeDTO alertType = (AlertTypeDTO) o;
    return Objects.equals(this.id, alertType.id) &&
        Objects.equals(this.name, alertType.name) &&
        Objects.equals(this.requireConfiguration, alertType.requireConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, requireConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertTypeDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requireConfiguration: ").append(toIndentedString(requireConfiguration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

