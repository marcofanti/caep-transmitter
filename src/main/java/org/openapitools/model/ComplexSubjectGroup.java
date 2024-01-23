package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.SimpleSubject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ComplexSubjectGroup
 */


@JsonTypeName("ComplexSubject_group")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T16:42:52.857708-05:00[America/New_York]")
public class ComplexSubjectGroup implements SimpleSubject {

  public ComplexSubjectGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectGroup(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
  }


  public ComplexSubjectGroup format(String format) {
    return this;
  }

  public ComplexSubjectGroup uri(String uri) {
    return this;
  }

  public ComplexSubjectGroup url(String url) {
    return this;
  }

  public ComplexSubjectGroup email(String email) {
    return this;
  }

  public ComplexSubjectGroup iss(String iss) {
    return this;
  }

  public ComplexSubjectGroup sub(String sub) {
    return this;
  }

  public ComplexSubjectGroup jti(String jti) {
    return this;
  }

  public ComplexSubjectGroup id(String id) {
   return this;
  }

  public ComplexSubjectGroup phoneNumber(String phoneNumber) {
    return this;
  }

  public ComplexSubjectGroup issuer(String issuer) {
    return this;
  }

  public ComplexSubjectGroup assertionId(String assertionId) {
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexSubjectGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

  @Override
  public String getFormat() {
    return null;
  }
}

