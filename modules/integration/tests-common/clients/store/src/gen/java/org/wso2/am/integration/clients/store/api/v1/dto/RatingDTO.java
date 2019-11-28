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
 * RatingDTO
 */

public class RatingDTO {
  @SerializedName("ratingId")
  private String ratingId = null;

  @SerializedName("apiId")
  private String apiId = null;

  @SerializedName("ratedBy")
  private String ratedBy = null;

  @SerializedName("rating")
  private Integer rating = null;

  public RatingDTO ratingId(String ratingId) {
    this.ratingId = ratingId;
    return this;
  }

   /**
   * Get ratingId
   * @return ratingId
  **/
  @ApiModelProperty(value = "")
  public String getRatingId() {
    return ratingId;
  }

  public void setRatingId(String ratingId) {
    this.ratingId = ratingId;
  }

  public RatingDTO apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @ApiModelProperty(value = "")
  public String getApiId() {
    return apiId;
  }

  public void setApiId(String apiId) {
    this.apiId = apiId;
  }

  public RatingDTO ratedBy(String ratedBy) {
    this.ratedBy = ratedBy;
    return this;
  }

   /**
   * Get ratedBy
   * @return ratedBy
  **/
  @ApiModelProperty(value = "")
  public String getRatedBy() {
    return ratedBy;
  }

  public void setRatedBy(String ratedBy) {
    this.ratedBy = ratedBy;
  }

  public RatingDTO rating(Integer rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingDTO rating = (RatingDTO) o;
    return Objects.equals(this.ratingId, rating.ratingId) &&
        Objects.equals(this.apiId, rating.apiId) &&
        Objects.equals(this.ratedBy, rating.ratedBy) &&
        Objects.equals(this.rating, rating.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingId, apiId, ratedBy, rating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingDTO {\n");
    
    sb.append("    ratingId: ").append(toIndentedString(ratingId)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    ratedBy: ").append(toIndentedString(ratedBy)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

